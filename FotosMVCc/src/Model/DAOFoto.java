package Model;

import java.awt.HeadlessException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DAOFoto {

    Connection con;
    Conexion conectar = new Conexion();
    PreparedStatement ps;

    public void insertarFoto(Foto f) {
        try {
            String sql = "INSERT INTO FOTOS (id,descripcion,imagen) VALUES (?,?,?)";
            PreparedStatement ps;
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, f.getId());
            ps.setString(2, f.getDescripcion());
            ps.setBinaryStream(3, f.getImagen(), f.getLongitud());
            ps.executeUpdate();
        } catch (SQLException | HeadlessException ex) {
            System.out.println("exception: " + ex);
        }
    }

    public void actualizarFoto(Foto f) {
        try {
            String sql = "UPDATE fotos SET descripcion=? WHERE id=?";
            PreparedStatement ps;
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, f.getDescripcion());
            ps.setInt(2, f.getId());
            ps.executeUpdate();
        } catch (SQLException | HeadlessException ex) {
            System.out.println("exception:" + ex);

        }
    }

    public void actualizarImagen(Foto f) {
        try {
            String sql = "UPDATE fotos SET imagen= ? WHERE id=?";
            PreparedStatement ps;
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setBinaryStream(1, f.getImagen(), f.getLongitud());
            ps.setInt(2, f.getId());
            ps.executeUpdate();
        } catch (SQLException | HeadlessException ex) {
            System.out.println("exception:" + ex);
        }
    }

public Object [] consultarPorId(Foto f) {
String sql= "SELECT id,descripcion FROM fotos WHERE id=?";
Object [] filas = new Object[2];
try{
con= conectar.getConnection();ps = con.prepareStatement(sql);
ps.setInt(1,f.getId());
ResultSet rs = ps.executeQuery();
while(rs.next()){
filas [0] = rs.getInt(1); //Id
filas [1] = rs.getString(2);  //Descripcion
}
}catch (Exception ex) {
System.out.println("exception:" + ex);
}
return filas;
}

public InputStream consultarImagen(Foto f){
InputStream stream = null;
try { 
String sql = "SELECT imagen FROM fotos WHERE id=?";
con = conectar.getConnection();
ps = con.prepareStatement(sql);
ps.setInt(1,f.getId());
ResultSet rs = ps.executeQuery();
while (rs.next()) {
stream = rs.getBinaryStream(1);
}
return stream;

}catch (Exception e) {
        System.out.println("consultar imagen:" + 3);
        return null;
}
}
}


