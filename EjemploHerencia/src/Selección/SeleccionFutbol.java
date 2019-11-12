/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Selección;

public abstract class SeleccionFutbol implements IntegrantesSeleccionFutbol {

    private int id;
    private String nombre;
    private String apellido;
    private int edad;

    public SeleccionFutbol() {
    }

   public SeleccionFutbol(int id, String nombre, String apellido, int edad){
           this.id=id;
       this.nombre=nombre;
       this.apellido=apellido;
       this.edad=edad;
   }

    /**
     * @return the id
     */
    public int getId() {
        return this.id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return this.apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return this.edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public void concentrarse(){
        System.out.println("Concentrarse(desde interface)");
    }
    @Override
    public void viajar(){
    System.out.println("viajar(desde interface)");
    }
    @Override
 public void jugarPartido(){
    System.out.println("todo integrante del equipo asiste al partido de futbol(desde interface)");    
}
    @Override
  public abstract void entrenar();
}

