/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import  java.sql.Driver;
import java.sql.SQLException;
/**
 *
 * @author ivana
 */
public class Conexion {
    
    Connection conexionBD = null;
    public static final String URL = "jdbc:mysql://localhost:3306/Proyecto";   
    public static final String USUARIO = "root";
    public static final String PASSWORD = "";
    
    
    public Connection getConexion(){
        
        try {
            
            conexionBD = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            
        } catch (SQLException e) {
            new RuntimeException("ERROR EN LA CONEXION:\n"+"Ejecute USBSERVER para cargar la base de datos\n" , e);
            
        }
        
        return conexionBD;
    
    }
}
 
