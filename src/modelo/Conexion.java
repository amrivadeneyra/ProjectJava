package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*import java.sql.*;    */
 /*Connection cn;*/
public class Conexion {

    private final String db = "test";
    private final String user = "manuel";
    private final String pass = "123";
    private final String url = "jdbc:mysql://localhost/" + db;
    private Connection con = null;

    public Connection getConexion()
    {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.url, this.user, this.pass);
            System.out.println("Connexion Exitosa");
        } catch(SQLException e)
        {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
      return con;  
    }

}

    

    
    
    /*    Connection cn;
    Statement st;
    
    public Connection connexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema","manuel","123");/* falta usuario y contraseña*/
 /*           System.out.println("Connexion Exitosa");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }return cn;
    }
    
    Statement createStatement(){
        throw new UnsupportedOperationException("No soportado");
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } */
 /* public Connection connexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }       */
//public Connection connexion() {
//  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//}


