/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atletas;

/**
 *
 * @author b8
 */
public interface Nadador {
     public default String nadar(){
        return"es un atleta que nada en aguas frias.";
}
}