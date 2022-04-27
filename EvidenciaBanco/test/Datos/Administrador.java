/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Conexion.Banco.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static sun.jvm.hotspot.HelloWorld.e;

/**
 *
 * @author alexa
 */
public class Administrador {
    
    Connection conexion;
    
    public Administrador(){
        Conexion con = new Conexion();
        conexion = con.getConnection();
        
    }
    
    private List<Usuario>ListaUsuario(){
        
        PreparedStatement ps;
        ResultSet rs;
        
        List<Usuario>Lista= new ArrayList<>();
        try{
            ps = conexion.prepareStatement("SELECT idUsuario,CP,Telefono,IdNumerocuenta,TipoCuenta"
                    + "Nombre,Apellido,Direccion,Ciudad,Estado,Pais,FechaNacimiento,CorreoEletronico,Contrasena"
                    + "Administrador FROM Usuario"); 
   
            rs = ps.executeQuery();
            
            while(rs.next()){
                
         int idUsuario = rs.getInt("idUsuario");
         int CP = rs.getInt ("CP");
         int Telefono = rs.getInt ("Telefono");
         int IdNumerocuenta = rs.getInt("IdNumerocuenta");
         int TipoCuenta = rs.getInt("TipoCuenta");
         String Nombre = rs.getString ("Nombre");
         String Apellido = rs.getString ("Apellido");
         String Direccion = rs.getString ("Direccion");
         String Ciudad = rs.getString ("Ciudad");
         String Estado = rs.getString ("Estado");
         String Pais = rs.getString ("Pais");
         String FechaNacimiento = rs.getString ("FechaNacimiento");
         String CorreoEletronico = rs.getString ("CorreoEletronico");
         String Contrasena = rs.getString ("Contrasena");
         boolean Administrador = rs.getBoolean("Administrador");
         
        Usuario tipoUusario = new Usuario(idUsuario,CP,Telefono,IdNumerocuenta,TipoCuenta, Nombre,Apellido,Direccion,Ciudad,
        Estado,Pais,FechaNacimiento,CorreoEletronico,Contrasena,Administrador );
        
        Lista.add(tipoUusario);
         
            }
        return Lista;
        
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
            
        }
    }
    
}
