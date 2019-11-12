/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author b8
 */
public class Excepciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int n;
        do {
            try {
                System.out.print("introduce un numero entero mayor a 0: ");
                n = teclado.nextInt();
                System.out.println("numero introducido " + n);

            } 
            catch (InputMismatchException e) {
                n = 0;
                System.out.println("Debe introducir un numero entero" + e.toString());
                teclado.nextLine();

            }
           
            
       }while (n <= 0);
    
    }

}
