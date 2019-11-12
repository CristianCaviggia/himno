/*
 * To change this license header, choose License Headers in Project Properties.
 * JOHN
 * and open the template in the editor.
 */
package textomaslargo;
        
import java.util.ArrayList;
import java.util.Scanner;



public class TextoMasLargo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        ArrayList<String> cadenas = new ArrayList ();
        leerArray(cadenas);
        System.out.println ("Cadena de mayor longitud: " +  cadenaMasLarga (cadenas));        
}

public static void leerArray (ArrayList <String> cadenas) {
    Scanner sc = new Scanner (System.in);
    String s;
    boolean masCadenas;
    do {
        masCadenas = true;
        System.out.println ("Introduce una Cadena de caracteres (Fin para terminar): ");
        s = sc.nextLine();
        if (s.equalsIgnoreCase ("FIN")) {
            masCadenas = false;
        } else { 
            cadenas.add(s);
        }
    } while (masCadenas);
    
    }
public static String cadenaMasLarga (ArrayList <String> cadenas) {
    String mayor = cadenas.get (0);
    for (int i = 1; i < cadenas.size (); i++) {
     if (cadenas.get(i).length() > mayor.length()) {
         mayor = cadenas.get(i);
             }
    }
    return mayor;
}    
}
