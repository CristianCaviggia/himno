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
public interface Ciclista {
     public default String haceBici(){
        return"es un atleta que compite en ciclismo.";
}
}