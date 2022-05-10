/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion.Banco;

import Datos.Cuenta;
import Datos.Transferencia;
import Datos.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**v bbbn
 *
 * @author Alan Franco
 */
public class ConexionBD {
    private String nombreBD = "banco";//REEMPLAZAR POR NOMBRE DE BASE DE DATOS
    private String user = "root";//REEMPLAZAR POR USER DE LA CONEXION LOCAL DE BD
    private String pass = "admin";//REEMPLAZAR POR PASSWORD DE LA CONEXION LOCAL DE BD
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
        query = "INSERT INTO usuario(nombre, apellido, direccion, cp, ciudad,"
                + "estado, pais, telefono, fechanacimiento, correoeletronico,"
                + "contraseña, administrador) VALUES(" // Pongo la sentencia a ejecutar
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
                + "\"" + u.getCorreoElectronico()+ "\", "
                + "\"" + u.getContraseña()+ "\", "
                + u.getAdmin() + ");";
        
        st.executeUpdate(query);
        //ALEX no me permitio poner contraseña me marca error falta ese get 
        }
    
    public void AltaCuenta(Cuenta c) throws SQLException{
        query = "INSERT INTO cuenta(IdUsuario, TipoCuenta, Monto) VALUES(" // Pongo la sentencia a ejecutar
               //Se concatenan todos los parametros del objeto Usuario a guardar en la bd
               // Las \" se utilizan para poner unas comillas dentro de la string para mandar la query
               + "" + c.getIdUsuario() + ", "
               + "\"" + c.getTipoCuenta() + "\", "
               + "" + c.getMonto()+ ");" ;

        st.executeUpdate(query);
             //EN esta parte quise hacer lo de alta de cuenta tome los datos de la clase usuario pero 
             //pero  faltan mas es el de fecha y tipo de cuenta no estan en la clase Usuario.java
       }
    
    public void AltaTransferencia(Transferencia t) throws SQLException{
        query = "INSERT INTO transferencia(IdUsuario, IdOrigen, IdDestino,"
                + "Monto, Fecha) VALUES("
                + "" + t.getIdUsuario() + ", "
                + "" + t.getIdOrigen() + ", "
                + "" + t.getIdDestino() + ", "
                + "" + t.getMonto() + ", "
                + "\"" + t.getFecha() + "\""
                + ");";
        st.executeUpdate(query);
    }
     
    public List<Usuario> obtenerUsuarios() throws SQLException{

       List<Usuario> users = new ArrayList<>();
       query = "SELECT * FROM usuario";
       rs = st.executeQuery(query);

       while(rs.next()){
           int IdUsuario = rs.getInt("IdUsuario");
           String Nombre = rs.getString("Nombre");
           String Apellido = rs.getString("Apellido");
           String Direccion = rs.getString("Direccion");
           String CP = rs.getString("CP");
           String Ciudad = rs.getString("Ciudad");
           String Estado = rs.getString("Estado");
           String Pais = rs.getString("Pais");
           String Telefono = rs.getString("Telefono");
           String FechaNacimiento = rs.getString("FechaNacimiento");
           String CorreoElectronico = rs.getString("CorreoEletronico");
           String Contraseña = rs.getString("Contraseña");
           int Admin = rs.getInt("Administrador");

           users.add(new Usuario(IdUsuario, Nombre, Apellido, Direccion, CP, Ciudad, Estado, Pais, Telefono, FechaNacimiento, CorreoElectronico, Contraseña, Admin));
       }
       rs.close();
       return users;
    }
     
    public List<Cuenta> obtenerCuentas() throws SQLException{

       List<Cuenta> cuentas = new ArrayList<>();
       query = "SELECT * FROM cuenta";
       rs = st.executeQuery(query);
       
       while(rs.next()){
           int IdCuenta = rs.getInt("IdCuenta");
           int IdUsuario = rs.getInt("IdUsuario");
           String TipoCuenta = rs.getString("TipoCuenta");
           double Monto = rs.getDouble("Monto");
           
           cuentas.add(new Cuenta(IdCuenta, IdUsuario, TipoCuenta, Monto));
           
       }
       rs.close();
       return cuentas;
    }
    
    public List<Transferencia> obtenerTransferencias() throws SQLException{
        List<Transferencia> trans = new ArrayList<>();
        query = "SELECT * FROM transferencia;";
        rs = st.executeQuery(query);
        
        while(rs.next()){
            int IdTransferencia = rs.getInt("IdTransferencia");
            int IdUsuario = rs.getInt("IdUsuario");
            int IdOrigen = rs.getInt("IdOrigen");
            int IdDestino = rs.getInt("IdDestino");
            double Monto = rs.getDouble("Monto");
            String Fecha = rs.getString("Fecha");
            
            trans.add(new Transferencia(IdTransferencia, IdUsuario, IdOrigen, 
                    IdDestino, Monto, Fecha));
        }
        rs.close();
       return trans;
    }
    
    public void UpdateMonto(Transferencia t) throws SQLException{
        List<Cuenta> cuentas = obtenerCuentas();
        double nuevoMontoOrigen = (cuentas.get(t.getIdOrigen()-1).getMonto() - t.getMonto());
        query = "UPDATE cuenta SET "
                + "Monto = " + nuevoMontoOrigen
                + " WHERE IdCuenta = " + t.getIdOrigen() + ";";
        st.executeUpdate(query);
        
        double nuevoMontoDestino = (cuentas.get(t.getIdDestino()-1).getMonto() + t.getMonto());
        query = "UPDATE cuenta SET "
                + "Monto = " + nuevoMontoDestino
                + " WHERE IdCuenta = " + t.getIdDestino() + ";";
        st.executeUpdate(query);
        
        query = "INSERT INTO transferencia(IdUsuario, IdOrigen, IdDestino, "
                + "Monto, Fecha) VALUES("
                + "" + t.getIdUsuario() + ", "
                + "" + t.getIdOrigen() + ", "
                + "" + t.getIdDestino() + ", "
                + "" + t.getMonto() + ", "
                + "\"" + t.getFecha() + "\""
                + ");";
        st.executeUpdate(query);
    }
   }
    
