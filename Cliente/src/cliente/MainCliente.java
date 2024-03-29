package cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class MainCliente {

    private final static int PORT = 5000;
    private final static String SERVER = "localhost";

    public static void main(String[] args) {
        boolean exit = false;
        Socket socket;
        try {
            System.out.println("Cliente>Inicio");
            while (!exit) {
                socket = new Socket(SERVER, PORT);
                //para leer lo que envie el servidor
                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                //para imprimir datos del servidor
                PrintStream output = new PrintStream(socket.getOutputStream());
                //para leer lo que escriba el usuario
                BufferedReader brRequest = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Cliente>Escriba comando");
                //Captura comando escrito por el usuario
                String request = brRequest.readLine();
                //manda peticion al servidor
                output.println(request);
                //captura respuesta e imprime
                String st = input.readLine();
                if (st != null) {
                    System.out.println("Servidor>" + st);
                }
                if (request.equals("exit")) {                        //terminar aplicacion
                    exit = true;
                    System.out.println("Cliente>Fin de programa");
                }
                socket.close();
            }                                                      //fin ciclo repetitivo
        } catch (IOException ex) {
            System.err.println("Cliente>" + ex.getMessage());
        }
    }

}
