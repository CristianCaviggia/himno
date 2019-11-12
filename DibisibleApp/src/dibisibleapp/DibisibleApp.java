

package dibisibleapp;

import java.util.Scanner;


public class DibisibleApp {

   
    public static void main(String[] args) {
     Scanner sc= new Scanner (System.in);
     System.out.println ("Introduce el numero ");
     int numero = sc.nextInt();
     
     if (numero%2==0){
         System.out.println("Muestra el numero "+ numero+" es dibicible entre dos ");
     }else{ 
         System.out.println("El numero "+numero +" no es divicible entre dos");
     }
    }
    
}
