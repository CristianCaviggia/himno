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
public class futbolista extends SeleccionFutbol {

    private int dorsal;
    private String demarcacion;

    public futbolista() {
        super();
    }
public futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion){
    super(id, nombre, apellido,edad);
    this.dorsal=dorsal;
    this.demarcacion=demarcacion;
    
}

    /**
     * @return the demarcacion
     */
    public String getDemarcacion() {
        return demarcacion;
    }

    /**
     * @return the dorsal
     */
    public int getDorsal() {
        return dorsal;
    }

    /**
     * @param demarcacion the demarcacion to set
     */
    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    /**
     * @param dorsal the dorsal to set
     */
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    @Override
    public void jugarPartido(){
        System.out.println("Juega el partido");
    }
    @Override
    public void entrenar(){
        System.out.println("El futbolista juega para tener un buen rendimiento");
    }
public void entrevista(){
    System.out.println("el futbolista da una entrevista");
}
    public static class EjemploHerencia {

        public static void main(String[] args) {
        }
    }
}
