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
public interface IntegrantesSeleccionFutbol {
    void concentrarse();
    void viajar();
    void entrenar();
    void jugarPartido();
    default void ruedaPrensa(){
        System.out.println("participar de una rueda de prensa(desde la interface)");
    }
    default void videoPublicitario(){
        System.out.println("hacer un video publicitario (desde la interface)");
    }
}
