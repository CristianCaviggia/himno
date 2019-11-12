package ecuaciones2gradoapp;

import java.util.Scanner;

public class Ecuaciones2GradoApp {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el valor a");
        int a = sc.nextInt();
        System.out.println("Introduce el valor de b");
        int b = sc.nextInt();
        System.out.println("Introduce el valor de c");
        int c = sc.nextInt();
        double discriminante = Math.pow(b, 2) - (4 * a * c);
        //Mesaje de traza.
        System.out.println(">>" + discriminante);
        if (discriminante > 0) {
            double x1 = (-b) + Math.sqrt(discriminante)/ (2 * a);
            double x2 = (-b) - Math.sqrt(discriminante) / (2 * a);
            
            System.out.println("Elvalor de x1 es " + x1 + "y el valor de x2 es " + x2);
        } else {
            System.out.print("El discriminante es negativo");
            
        }
    }
}
