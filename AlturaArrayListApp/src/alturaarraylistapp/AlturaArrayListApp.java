/*
JOHN 2-7
 */
package alturaarraylistapp;

import java.util.ArrayList;
import java.util.Scanner;

public class AlturaArrayListApp {

    public static void main(String[] args) {

        ArrayList<Double> alturas = new ArrayList();
        int cantidad;
        double media;

        cantidad = cantidadAlumnos();
        leerAlturas(alturas, cantidad);

        media = calcularMedia(alturas);
        mostrarResultados(alturas, media);

    }

    public static int cantidadAlumnos() {
        Scanner teclado = new Scanner(System.in);
        int cantidad;
        do {
            System.out.print("Introduce la cantidad de alumonos del aula: ");
            cantidad = teclado.nextInt();
        } while (cantidad < 1);
        return cantidad;
    }

    public static void leerAlturas(ArrayList<Double> alturas, int cantidad) {
        Scanner teclado = new Scanner(System.in);
        int i;
        double alto;
        for (i = 1; i <= cantidad; i++) {
            do {
                System.out.print("Alumno " + i + " Altura: ");
                alto = teclado.nextDouble();
            } while (alto <= 0);
            alturas.add(alto);
        }
    }

    public static double calcularMedia(ArrayList<Double> alturas) {
        double media = 0;
        for (Double item : alturas) {
            media = media + item;
        }
        return media / alturas.size();
    }

    public static void mostrarResultados(ArrayList<Double> alturas, double media) {
        int superior = 0, inferior = 0;
        System.out.println("Alturas introducidas: ");
        System.out.println(alturas);
        for (Double item : alturas) {
            if (item > media) {
                superior++;
            } else if (item < media) {
                inferior++;
            }

            System.out.printf("Media: %.2f %n", media);
            System.out.println("Hay " + superior + " alumnos mas altos que la media");
            System.out.println("Hay " + inferior + " alumnos mas bajos que la media");
        }
    }
}
