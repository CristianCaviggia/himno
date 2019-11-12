
package modelo;

import java.sql.*;

public class Database {
    private String db = "dbtest";
    private String user = "root";
    private String password = "1234";
    private String url = "jdbc:mysql://localhost/" + db;
    private Connection conn = null;
    public Database(){
        this.url="jdbc:mysql://localhost/" + this.db;
        try{
            //obtenemos el driver de para mysql
            Class.forName("com.mysql.jdbc.Driver");
            //obtenemos la coneccion
            conn = DriverManager.getConnection(this.url, this.user, this.password);
        }catch (SQLException e){System.err.println(e.getMessage());
        
        }catch (ClassNotFoundException e){System.err.println(e.getMessage());
        
        }
    }
    public Connection getConexion(){
        return this.conn;
    }
    
}
