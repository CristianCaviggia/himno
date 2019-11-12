/*
JOHN
 */
package listacocheapp;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaCocheApp {

    static ArrayList<Coche> coches = new ArrayList();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        leerCoches();
        System.out.println(" /nCoches Introducidos: ");
        mostrarCoches();
        mostrarPorMarca();
        mostrarPorKm();
        System.out.println(" /nCoches con Mayor numero de Km: " + mostrarMayorKm());
        System.out.println(" /nCoches ordenados de menor a mayor numero de Km:");
        mostrarOrdenadosPorKm();
    }

    public static void leerCoches() {
        String matricula;
        String marca;
        String modelo;
        int Km;

        Coche aux;
        int i, N;

        do {
            System.out.print("Número de coches ? ");
            N = sc.nextInt();
        } while (N < 0);
        sc.nextLine();

        for (i = 1; i <= N; i++) {
            System.out.println("Coche " + i);
            System.out.println("Matricula: ");
            matricula = sc.nextLine();
            System.out.println("Marca: ");
            marca = sc.nextLine();
            System.out.println("Modelo: ");
            modelo = sc.nextLine();
            System.out.println("Números de Kilometros: ");
            Km = sc.nextInt();
            sc.nextLine();

            aux = new Coche();

            aux.setMatricula(matricula);
            aux.setMarca(marca);
            aux.setModelo(modelo);
            aux.setKm(Km);

            coches.add(aux);
        }
    }

    public static void mostrarCoches() {
        for (int i = 0; i < coches.size(); i++) {
            System.out.println(coches.get(i));
        }
    }

    public static void mostrarPorMarca() {
        String marca;
        System.out.println("Introduce la Marca: ");
        marca = sc.nextLine();
        System.out.println("Coches de la marca: " + marca);
        for (int i = 0; i < coches.size(); i++) {
            if (coches.get(i).getMarca().equalsIgnoreCase(marca)) {
                System.out.println(coches.get(i));
            }
        }
    }

    public static void mostrarPorKm() {
        int Km;
        System.out.println("Introducer el numero de kilometros ");
        Km = sc.nextInt();
        System.out.println("Coches con Menos de " + Km + " Km.");
        for (int i = 0; i < coches.size(); i++) {
            if (coches.get(i).getKm() < Km) {
                System.out.println(coches.get(i));
            }
        }
    }

    public static Coche mostrarMayorKm() {
        Coche mayor = coches.get(0);
        for (int i = 0; i < coches.size(); i++) {
            if (coches.get(i).getKm() > mayor.getKm()) {
                mayor = coches.get(i);
            }
        }
        return mayor;
    }

    public static void mostrarOrdenadosPorKm() {
        int i, j;
        Coche aux;
        for (i = 0; i < coches.size() - 1; i++) {
            for (j = 0; j < coches.size() - 1; i++) {
                if (coches.get(j + 1).getKm() < coches.get(j).getKm()) {
                    aux = coches.get(j + 1);
                    coches.set(j + 1, coches.get(j));
                    coches.set(j, aux);
                }
            }
        }
        mostrarCoches();
    }
}
