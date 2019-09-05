/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 57313
 */
public class Conexion {
       private static String Driver="com.mysql.jdbc.Driver";
    private static String url="jdbc:mysql://localhost:3306/millonarioBD";
    private static String username="root";
    private static String password="";
    private static Connection conn;
    
    public Conexion(){
        conn=null;
        try {
            Class.forName(Driver);
            conn=DriverManager.getConnection(url, username, password);
            if (conn!=null) {
                System.out.println("Conexion establecida");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error al conectar la base de datos");
        }
    }
    
    
   public Connection getConnection(){
       return conn;
   }
    
    public void desconectar(){
        conn=null;
    }
}
