package VentasApp;

import java.util.Scanner;

public class VentasApp {

    public static void main(String[] args) {
        int numVentas;

        int sumaVentas = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad de ventas");
        numVentas = sc.nextInt();
        for (int i = 0; i < numVentas; i++) {
            System.out.println("Introdice el precio de la venta " + (i + 1));

            int venta = sc.nextInt();

            //Acumulamos el valor de la venta.
            sumaVentas = sumaVentas + venta;
        }
        System.out.println(sumaVentas);

    }

}
