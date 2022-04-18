
import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionMySQL {
    public static void main(String[] args) {
        connect();
    }
    public static void connect(){
        Connection conn=null; //Iniciamos con la coneccion
        String driver ="com.mysql.jdbc.Driver";//Ruta del driver para el jsp!!
        try{
          Class.forName(driver); //Acedemos a class.for name, nos ayuda a verificar si el driver si conecto
            System.out.println("Si jalo owo!");
            try{
               conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/banco?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","1234");//url de mi proyecto,nombre,contraseña
            if(conn!=null){
                System.out.println("Conexion realizada :3!!");
            } 
            }catch(Exception e){
                System.out.println("ERROR AL CONECTAR"+e.getMessage());
            }
            
        }catch(Exception e){
            System.out.print("no se conectio qui qui"+e.getMessage());
        }
    }
}
