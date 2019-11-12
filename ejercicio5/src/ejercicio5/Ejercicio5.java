package ejercicio5;

import java.io.File;
import java.io.FileInputStream;

public class Ejercicio5 {

    public static void main(String[] args) {
        System.out.println("contando la cantidad de letras\"a\"...");
        int contador = 0;

        try {
            FileInputStream archivoEntrada = new FileInputStream(new File("archivo5.txt"));
            int dato;
            while ((dato = archivoEntrada.read()) != -1) {
                if (dato == 97) {
                    contador++;
                }

            }
            archivoEntrada.close();

        } catch (Exception errorDeArchivo) {

            System.out.println("ha habido problemas:" + errorDeArchivo.getMessage());
        }
            System.out.println("La cantidad de letras\"a\"en el achivo es :" + contador);
        }
    }
