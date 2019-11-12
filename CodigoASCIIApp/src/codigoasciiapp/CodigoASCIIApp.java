
package codigoasciiapp;

import javax.swing.JOptionPane;
import java.util.Scanner;


public class CodigoASCIIApp {

  
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        System.out.println ("iNTRODUCE UN CARACTER ASCHI");

        
       
       
       char caracter = teclado.next () . charAt (0);
       
       int codigo = (int) caracter;
       
       System.out.println (codigo);
    }
    
}
