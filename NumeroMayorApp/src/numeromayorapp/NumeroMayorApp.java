/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeromayorapp;

/**
 *
 * @author b8
 */
public class NumeroMayorApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1=30;
        int numero2=15;
        
        if (numero1 >= numero2){
            if (numero1 == numero2) {
                System.out.println ("Los Numeros " +numero1+ " y" + numero2 + " son iguales" );
            } else { System.out.println ("El numero " + numero1 + " es mayor que el numero " + numero2);
            }
            } else { System.out.println ("El numero " + numero2 + " es mayor que el numero " +numero1);
            }
        }
    }
   
