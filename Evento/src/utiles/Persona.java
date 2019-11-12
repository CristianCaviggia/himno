package utiles;

import java.io.Serializable;

public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    private String nombre;
    private String direccion;
    private int edad;
    private boolean casado;

    public Persona() {
        super();
        this.nombre = "PEEP";
        this.direccion = "NOWHERE";
        this.edad = 33;
        this.casado = true;
    }

    public Persona(String nombre, String direccion, int edad, boolean casado) {
        super();
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = 33;
        this.casado = casado;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the casado
     */
    public boolean isCasado() {
        return casado;
    }

    /**
     * @param casado the casado to set
     */
    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "\n-------\n//Nombre:" + nombre + "//direccion" + direccion + "//Edad:" + edad + "//Casado" + casado + "\n";
    }
}
