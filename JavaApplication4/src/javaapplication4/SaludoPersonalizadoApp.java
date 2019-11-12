import java.util.Scanner;

public class SaludoPersonalizadoApp {
    public static void main (String[] args)  {
        Scanner teclado = new Scanner(System.in); 
        System.out.println("introduce tu nombre");
        String nombre = teclado.nextLine();
        System.out.println("Biemvenido "+ nombre );
        
    
    }
    
}
