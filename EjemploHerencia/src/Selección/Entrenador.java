/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Selección;

/**
 *
 * @author b8
 */
public class Entrenador extends SeleccionFutbol{
    
    private String idFederacion;
    public Entrenador(){
        super();
    }
    public Entrenador(int id, String nombre, String apellido, int edad, String idFederacion){
super ( id,nombre,apellido,edad);
this.idFederacion=idFederacion;

}

    /**
     * @return the idFederacion
     */
    public String getIdFederacion() {
        return idFederacion;
    }

    /**
     * @param idFederacion the idFederacion to set
     */
    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    public void dirigirPartido(){
        System.out.println("Dirige un partido");
    }
    public void dirigirEntrenamiento(){
        System.out.println("Dirigir entrenamiento");
    }

    @Override
    public void entrenar() {
        System.out.println("El entrenador también concentra junto a sus jugadores");
    }
     @Override
    public void jugarPartido(){
        System.out.println("El entrenador juega desde el borde del campo");
    }
}
