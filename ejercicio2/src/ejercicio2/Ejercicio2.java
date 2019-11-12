
package ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Ejercicio2 {

   
    public static void main(String[] args) {

    if(!(new File("archivo2.txt")).exists()){
        System.out.println("No he encontrado archivo2.txt");
    return;
    }
    System.out.println("Leyendo archivo de texto...");
    try{
        BufferedReader archivoEntrada= new BufferedReader(new FileReader(new File("archivo2.txt")));
        String linea=null;
        while((linea=archivoEntrada.readLine())!=null){
            System.out.println(linea);
        }
    }catch (IOException errorDeArchivo){
                System.out.println("ha habido problemas con"+errorDeArchivo.getMessage());
                
                }
    }
}
