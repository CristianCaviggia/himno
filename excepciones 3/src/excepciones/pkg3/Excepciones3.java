/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones.pkg3;
import java.util.InputMismatchException;

/**
 *
 * @author b8
 */
public class Excepciones3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nums[]= new int [4];
        try{
            System.out.println("antes de que se genere la excepcion");
            nums[7]=10;
        } catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("indice fuera de los limites");
        }
        System.out.println("Despues de que se genere la excepcion");
    }
    
}
