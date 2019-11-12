
package sumadedosnumeros;
import java.util.*;


public class SumaDeDosNumeros {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        long numero1, numero2, resultado;
        System.out.print("Introduce el primer número: ");
        numero1=teclado.nextLong();
        System.out.print("introduce segundo número: ");
        numero2=teclado.nextLong();
        resultado= sumar(numero1,numero2);
        System.out.println("Sumar: " + resultado);
        
    }
    public static long sumar(long a,long b){
        long c;
        c=a+b;
        return c;
    }
}
