/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.Vo.PreguntaVO;
import Modelo.basededatos.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 57313
 */
public class PreguntaDao {
    Conexion con =new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public void insertar(PreguntaVO preguntaVO){
        String query="INSERT INTO `pregunta` (enunciado,valor) VALUES(?,?)";
        try {
            ps=con.getConnection().prepareStatement(query);
            ps.setString(1, preguntaVO.getEnunciado());
            ps.setInt(2, preguntaVO.getValor());
            if (ps.execute()) {
                
            }
        } catch (Exception e) {
        }
        con.desconectar();
       
    }
    
      public ArrayList<PreguntaVO> listarme(){
         PreparedStatement pst;
        ResultSet rs;
        ArrayList<PreguntaVO> lista=new ArrayList<>();
        String sql="SELECT * FROM pregunta ";
        try {
            pst=con.getConnection().prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){
                PreguntaVO pvo=new PreguntaVO();
               
               pvo.setIdpregunta(rs.getInt("idpregunta"));
               pvo.setEnunciado(rs.getString("enunciado"));
               pvo.setValor(rs.getInt("valor"));
               
                
               
               lista.add(pvo);
            }
            
        } catch (Exception e) {
        }
        return lista;      
        
    } 
      
      public void eliminar(int id){
          String query="delete  from pregunta where idpregunta="+id;
          try {
              ps=con.getConnection().prepareStatement(query);
              ps.execute();
          } catch (Exception e) {
          }
          con.desconectar();
      }
    
}
