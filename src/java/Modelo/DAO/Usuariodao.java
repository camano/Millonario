/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.Interfacez.Crudusuario;
import Modelo.Vo.UsuarioVo;
import Modelo.basededatos.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 57313
 */
public class Usuariodao implements Crudusuario{
    PreparedStatement ps;
    ResultSet rs;
    Conexion c=new Conexion();
    String Correo="correo";
    String clave="contraseña";
    @Override

    
    public boolean login(UsuarioVo vo) {
      
        String Consulta="SELECT * FROM `usuario` WHERE correo=? AND contraseña=?";
        try {
            ps=c.getConnection().prepareStatement(Consulta);
            ps.setString(1, vo.getCorreo());
            ps.setString(2, vo.getClave());
            rs=ps.executeQuery();
            while(rs.next()){
               vo.setIdusuario(rs.getInt("idusuario"));
               vo.setCorreo(rs.getString("correo"));
               vo.setClave(rs.getString("contraseña"));
               
               return true;
            }
            
        } catch (SQLException e) {
            System.out.println("ERROR" +e);
        }
        
        c.desconectar();
        return false;
    }
 
    
}
