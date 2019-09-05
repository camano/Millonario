/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.basededatos;

import Modelo.DAO.PreguntaDao;
import Modelo.Vo.PreguntaVO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 57313
 */
public class main {
    public static void main(String[] args) {
        Conexion c=new Conexion();
        
        PreguntaVO pvo=new PreguntaVO();
        PreguntaDao dao=new PreguntaDao();
        dao.eliminar(2);
    /* ArrayList<PreguntaVO> listar=new ArrayList<>();
        listar=(ArrayList<PreguntaVO>) dao.listarme();
        System.out.println(listar.size());
        for (int i = 0; i < listar.size(); i++) {
            System.out.println(listar.get(i).getEnunciado());
        }
      */  
        
    }
}
