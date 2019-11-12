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
public class Masajista extends SeleccionFutbol {
    private String titulacion;
    private int aniosExperiencia;
    public Masajista(){}
    
    
    public Masajista(int id, String nombre, String apellido, int edad, String titulacion, int aniosExperiencia){
        super(id, nombre, apellido, edad);
        this.titulacion=titulacion;
        this.aniosExperiencia= aniosExperiencia;
        
    }
    public void darMasaje(){
        System.out.println("Da masaje");
    }

    @Override
    public void entrenar() {
   
        System.out.println("El masajista brinda asistencia durante el entrenamiento");
    
    }
            
    
}
