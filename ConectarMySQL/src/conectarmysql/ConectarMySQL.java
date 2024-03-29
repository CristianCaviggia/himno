package conectarmysql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConectarMySQL {

    public static void main(String[] args) {

        testMySQLDriver();

        try {
            String url = "jdbc:mysql://localhost:3306/prueba?useSSL=false";
            String username = "root";
            String password = "1234";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM persona");

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                Date fecha = rs.getDate("fecha");
                System.out.println(String.format("%d, %s %s, %s", id, nombre, apellido, fecha));
            }
            rs.close();
            connection.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    private static void testMySQLDriver() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            System.out.println("Error, no se ha pódido cargar MySQL JDBC Driver");
        }
    }
}
