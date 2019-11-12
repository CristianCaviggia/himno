/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author b8
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        String[] lineas = {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "..."};
        FileWriter archivo = null;
        try {
            archivo = new FileWriter("arcivo3.txt");
            for (String linea : lineas) {
                archivo.write(linea + "\r\n");
            }
            archivo.close();
        } catch (IOException ex) {
            System.out.println("Mensaje de exepción: " + ex.getMessage());
        }

    }
}

