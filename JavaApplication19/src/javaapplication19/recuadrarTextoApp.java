package recuadrartectoapp;

import java.util.Scanner;

public class recuadrarTextoApp {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        System.out.print("introduce cadena de texto: ");
        cadena = teclado.nextLine();
        cajaTexto(cadena);

    }

    /**
     * Método que muestra un String rodeado por un borde.
     */
    public static void cajaTexto(String str) {
        int n = str.length();
        for (int i = 0; i < n + 4; i++) {
            System.out.print("#");

        }
        System.out.println();
        System.out.println("# " + str + " #");
        for (int i = 0; i < n + 4; i++) {

            System.out.print("#");

        }

        System.out.println();

    }
}
