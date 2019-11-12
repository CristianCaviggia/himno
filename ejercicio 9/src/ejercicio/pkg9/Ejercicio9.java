
package ejercicio.pkg9;

import java.util.Scanner;


public class Ejercicio9 {

  
    public static void main(String[] args) {
       try{
           double x=leerValor();
           System.out.println("Raiz cuadrada de "+x+"="+Math.sqrt(x));
       }catch(valorNoValido1 e){
           System.out.println(e.getMessage());
       }
    }

    public static double leerValor()throws valorNoValido1 {
      Scanner sc= new Scanner(System.in);
      System.out.println("Introduce número>0");
       double n=sc.nextDouble();
      if(n<=0){
          throw new valorNoValido1("El número debe ser positivo");
      }
      return n;
    }
    
}
