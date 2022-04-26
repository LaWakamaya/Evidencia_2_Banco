/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author tania
 */
public class conexion {
    Connection cn;
    String url="jdb:mysql://localhost:3306/banco?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    String drv ="com.mysql.jdbc.Driver";
    String usr ="root";
    String pwd ="1234";
    
    public Connection getConnetion(){
        try{
            Class.forName(drv);
            cn=DriverManager.getConnection(url,usr,pwd);
            JOptionPane.showConfirmDialog(null,"Conexion owo!!");           
        } catch(Exception e){
            JOptionPane.showConfirmDialog(null,"No funciono qui qui!!"+ e);           
        }
        return cn;
    }
    
            
}
