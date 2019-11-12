
package model;

import java.io.FileInputStream;

public class Foto {

    private int id;
    private String descripcion;
    private FileInputStream imagen;
    private int longitud;

    public Foto() {

    }

    public Foto(int id, String descripcion, FileInputStream imagen, int longitud) {
        this.id = id;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.longitud = longitud;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the imagen
     */
    public FileInputStream getImagen() {
        return imagen;
    }

    /**
     * @return the longitud
     */
    public int getLongitud() {
        return longitud;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(FileInputStream imagen) {
        this.imagen = imagen;
    }

    /**
     * @param longitud the longitud to set
     */
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

}
