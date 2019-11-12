
package bisiestoapp;
import java.util.*; 

public class BisiestoApp {
 public static void main(String[] args) {
     Scanner teclado =new Scanner(System.in);
     int anio;
     System.out.print("Introduce un año: ");
     anio = teclado.nextInt();
     if(esBisiesto(anio)){
         System.out.println("El año introducido es bisiesto ");
     }else {
         System.out.println("El año introducido no es bisiesto");
         
     }
 }
     public static boolean esBisiesto(int unAnio){
         if(unAnio %4==0 && unAnio % 100 != 0 || unAnio%400 == 0){
             return true;
         }else{
             return false;
             
         }
     }
}
