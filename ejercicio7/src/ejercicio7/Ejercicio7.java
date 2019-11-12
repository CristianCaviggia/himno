package ejercicio7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1, numero2;
        try {
            System.out.println("introduce un numero");
            numero1 = teclado.nextInt();
            try {
                System.out.print("introduce otro numero:");
                numero2 = teclado.nextInt();
                System.out.println(numero1 + "/" + numero2 + "=" + numero1 / numero2);
            } catch (InputMismatchException e) {
                teclado.nextLine();
                numero2 = 0;
                System.out.println("Debe introducir un número");
            } catch (ArithmeticException e) {
                teclado.nextLine();
                numero2 = 0;
                System.out.println("No se puede dividir por cero");
            }
        } catch (InputMismatchException e) {
            teclado.nextLine();
            numero1 = 0;
            System.out.println("Debe introducir un número");
        }
    }
}
