/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion.Banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alexa
 */
public class Conexion {
    
    public Connection getConnection(){
        
        try{
            
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco","root","1234");//Coneccion a la base de datos:banco
            
            return conexion;
            
        }  catch(SQLException e){
            System.out.println(e.toString());//Regresara el error!!
            return null;//retornar null
        }
    }
    
}
