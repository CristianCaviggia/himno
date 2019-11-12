package archivosejercicio1;

import java.io.*;

class archivosejercicio1 {

    public static void main(String[] args) {

        System.out.println("Volcando a archivo de texto...");

        try {
            BufferedWriter archivoSalida = new BufferedWriter(new FileWriter(new File("archivo1.txt")));
            archivoSalida.write("hola");

            archivoSalida.write("este es");

            archivoSalida.newLine();

            archivoSalida.write(" un archivo de texto");

            archivoSalida.newLine();

            archivoSalida.close();

        } catch (IOException errorDeArchivo) {
            System.out.println("Ha habido problemas: " + errorDeArchivo.getMessage());

        }
    }

}
