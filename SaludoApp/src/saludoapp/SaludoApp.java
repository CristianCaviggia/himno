package saludoapp;

import java.util.Scanner;

public class SaludoApp {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame la Hora");
        byte hora = teclado.nextByte();
        if (hora >= 6 && hora < 13) {
            System.out.println("Buenos Dias");
        } else if (hora >= 13 && hora < 20) {
            System.out.println("Buenas Tardes");
        } else {
            System.out.println("Buenas Noches");
        }

    }

}

