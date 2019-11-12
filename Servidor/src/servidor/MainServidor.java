package servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;

public class MainServidor {

    private final static int PORT = 5000;            //Puerto

    public static void main(String[] args) {
        try {
            //Socket de servidor para esperar peticiones de la red
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Servidor>Servidor iniciado");
            System.out.println("Servidor>En espera de cliente..");
            //Socket de cliente
            Socket clientSocket;
            while (true) {
                //En espera de conexion, si existe la acepta
                clientSocket = serverSocket.accept();
                //Para leer lo que envie el cliente
                BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                //Para imprimir datos de salida 
                PrintStream output = new PrintStream(clientSocket.getOutputStream());
                //Se lee la peticion del cliente
                String request = input.readLine();
                System.out.println("Cliente>peticion[" + request + "]");
                //Se procesa la peticion y se espera resultado
                String strOutput = process(request);
                //Se imprime en consola "servidor"
                System.out.println("Servidor>Resultado de peticion");
                System.out.println("Servidor>\"" + strOutput + "\"");
                //Se imprime en cliente
                output.flush();
                output.println(strOutput);
                //Cierra conexion
                clientSocket.close();
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    /**
     * procesa peticion del cliente y retorna resultado
     *
     * @param request peticion del cliente
     * @return String
     */
    public static String process(String request) {
        String result = "";
        String[] phrases = {
            "La tecnologia se alimenta a si misma. La tecnologia hace posible mas tecnologia.-Alvin Toffler.",
            "La tecnologia es solo una herramienta. El profesor es lo mas importante en el trabajo y motivacion.-Bill Gates.",
            "La Maquina tecnologicamente mas eficiente que el hombre ha inventado es el libro.-Northrop Frye.",
            "Ya no hacen mas los bugs como bunny.-Olav Mjelde",
            "Un lenguaje para programar es de bajo nivel cuadno debes prestar atencion a lo irrelevante.-Alan J.Perlis.",
            "Hablar es barato. Enseñame el codigo.-Linus Torvalds",
            "No me importa si funciona en su maquina!No me envian su maquina!.-Vidiu Platon",
            "Programa como si la persona que mantendra tu codigo fuera un psicopata violento que sabe donde vives.-Martin Golding"};
        ArrayList<String> phrasesList = new ArrayList<>();
        Collections.addAll(phrasesList, phrases);
        String[] books = {
            "Divina Comedia - Dante Alighieri",
            "Don Quijote de la Mancha - Miguel de Cervantes",
            "Cien años de soledad - Gabriel Garcia Marquez",
            "Moby Dick - Herman Melville",
            "Ana Karenina - Lev Tolstoi",
            "Eneida - Virgilio",
            "Otelo - William Shakespeare",
            "El viejo y el mar - Ernest Hemingway",
            "Orgullo y prejuicio - Jane Austen"};
        ArrayList<String> booksList = new ArrayList<>();
        Collections.addAll(booksList, books);
        if (request != null) {
            switch (request) {
                case "frase":
                    Collections.shuffle(phrasesList);
                    result = phrasesList.get(0);
                    break;
                case "libro":
                    Collections.shuffle(booksList);
                    result = booksList.get(0);
                    break;
                case "exit":
                    result = "bye";
                    break;
                default:
                    result = "La peticion no se puede resolver.";
                    break;

            }
        }
        return result;
    }

}
