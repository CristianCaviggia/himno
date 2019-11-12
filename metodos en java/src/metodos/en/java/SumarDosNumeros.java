// 


package SumarDosNumeros.java;

import java.util.Scanner;


public class SumarDosNumeros {
    

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        int numero1= teclado.nextInt();
        int numero2=teclado.nextInt();
        int resultado= sumar(numero1,numero2);
        System.out.println("LA SUMA ES: " +resultado);
        
    }
    public static int sumar(int a,int b) {
        int c;
        c=a+b;
        return c ;
    }
}
