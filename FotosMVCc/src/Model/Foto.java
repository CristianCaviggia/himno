
package Model;

import java.io.FileInputStream;
import java.io.InputStream;

public class Foto {
    private int id;
    private String descripcion;
    private FileInputStream imagen;
    private int longitud;
    public Foto(){
        
    }
    public Foto(int id,String descripcion,FileInputStream imagen, int longitud) {
        this.id=id;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.longitud = longitud;
    }
    public int getId() { 
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getDescripcion () {
        return descripcion;
    }
    public void setDescripcion (String descripcion) { 
        this.descripcion = descripcion;
    }
    public void setImagen(FileInputStream imagen) {
        this.imagen = imagen;
    }
    public int getLongitud() {
        return longitud;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    InputStream getImagen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
