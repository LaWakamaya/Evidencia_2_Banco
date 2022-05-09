/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion.Banco;

import Datos.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Alan Franco
 */
public class ConexionBD {
    private String nombreBD = "banco";//REEMPLAZAR POR NOMBRE DE BASE DE DATOS
    private String user = "root";//REEMPLAZAR POR USER DE LA CONEXION LOCAL DE BD
    private String pass = "99901u";//REEMPLAZAR POR PASSWORD DE LA CONEXION LOCAL DE BD
    private String url = "jdbc:mysql://localhost:3306/"+nombreBD+"?useUnicode=true"
            + "&useJDBCCompliantTimeZoneShift=true&useLegacyDateTimeCode=false"
            + "&serverTimezone=UTC";//ESTO ASI SE QUEDA
    
    Connection con = null;//Objeto de la conexion de bd
    Statement st;//Objeto que va a mandar las querys de bd
    ResultSet rs;//Objeto que va a recibir los resultados de la query (select)
    String query = "";//String que se va a modificar para mandar la query

    public ConexionBD() {//El constructor, esto se ejecuta en cuanto creas el objeto de BD
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            this.st = con.createStatement();
            if(con!=null)
                System.out.println("Conexion exitosa");//Conexion resulta, sale en el output de "Apache Tomcat or TomEE"
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.toString());//Conexion falla
        }
        
    }
      
    
        

    /* EJEMPLO DE SELECT EN BASE DE DATOS
    public List<Usuarios> obtenerUsuarios() throws SQLException{
        List<Usuarios> users = new ArrayList<>(); //La funcion devuelve un objeto List del tipo del objeto que manejamos en java
        query = "SELECT * FROM usuarios"; //Selecciono todos los usuarios
        rs = st.executeQuery(query); //Le mando la string para que ejecute la query
        
        while(rs.next()){ //Esto se repite por la cantidad de usuarios en la BD
        //       variable   tipo dato  columna bd
        //        local         |        |
        //         |            |        |
        //         v            v        v
           String user = rs.getString("user");
           String pass = rs.getString("pass");
           String nombre = rs.getString("nombre");
           String apellido = rs.getString("apellido");
           int edad = rs.getInt("edad");
           String genero = rs.getString("genero");
           
           Despues de recibir todo agregamos un usuario a lalista de usuarios
           users.add(new Usuarios(user,pass,nombre,apellido,edad,genero));
        }
        //Cerramos la sentencia y devolvemos la lista de usuarios
        rs.close();
        return users;
    }
    */
    
    /*EJEMPLO DE INSERTAR 
    public void guardarUsuario(Usuarios u) throws SQLException{
        query = "INSERT INTO usuarios(user, pass, nombre, apellido, edad, genero) VALUES(" // Pongo la sentencia a ejecutar
                //Se concatenan todos los parametros del objeto Usuario a guardar en la bd
                // Las \" se utilizan para poner unas comillas dentro de la string para mandar la query
                + "\"" + u.getUser() + "\", "
                + "\"" + u.getPass()+ "\", "
                + "\"" + u.getNombre() + "\", "
                + "\"" + u.getApellido() + "\", "
                + u.getEdad() + ", "
                + "\"" + u.getGenero() + "\");";
    //La sentencia final quedaria algo como:
    //INSERT INTO usuarios(user, pass, nombre, apellido, edad, genero) VALUES(
    //"alanfranco", "alan123", "Alan", "Franco", 21, "Hombre");
    //Ya teniendola asi ya se manda a la bd
        st.executeUpdate(query);
    }
    */

   public void AltaCliente(Usuario u) throws SQLException{
        query = "INSERT INTO usuario() VALUES(" // Pongo la sentencia a ejecutar
                //Se concatenan todos los parametros del objeto Usuario a guardar en la bd
                // Las \" se utilizan para poner unas comillas dentro de la string para mandar la query
                + "\"" + u.getNombre() + "\", "
                + "\"" + u.getApellido()+ "\", "
                + "\"" + u.getDireccion() + "\", "
                + "\"" + u.getCP() + "\","
                + "\"" + u.getCiudad() + "\", "
                + "\"" + u.getEstado() + "\", "
                + "\"" + u.getPais() + "\", "
                 + "\"" + u.getTelefono() + "\","
                + "\"" + u.getFechaNacimiento() + "\", "
                + "\"" + u.getCorreoEletronico() + "\");";
                
        
}
   }
    
