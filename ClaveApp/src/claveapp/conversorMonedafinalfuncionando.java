package conversorMonedaFINALfuncionando;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class conversorMonedafinalfuncionando {

    final static double USD=46.19;
    final static double EUR=49.13;
    final static double YEN=0.40;
    final static double LBS=55.36;
    final static double BRL=11.28;
    final static double ARS=1.00;

    public static void main(String[] args) {
        String moneda1, moneda2, mensaje;
        double cantidad1, cantidad2, valorMoneda1, valorMoneda2;
        do {
            moneda1 = leerMoneda();
            cantidad1 = leerCantidad(moneda1);
            moneda2 = leerMoneda();
            valorMoneda1 = convertirMoneda(moneda1, 1);
            valorMoneda2 = convertirMoneda(moneda2, 1);
            cantidad2 = cantidad1 * valorMoneda1 / valorMoneda2;
            mensaje = moneda1 + " " + cantidad1 + " " + "equivalen a " + moneda2 + " " + String.format("%.2f", cantidad2);
            JOptionPane.showMessageDialog(null, mensaje);
        } while (true);
    }

   
    public static String leerMoneda() {
        String resultado;
        do {
            String texto = JOptionPane.showInputDialog("Indicar la moneda USD, EUR, YEN, LBS, BRL, ARS");
            resultado = texto.trim().toUpperCase();
        } while (!resultado.equals("USD") && !resultado.equals("EUR") && !resultado.equals("YEN") && !resultado.equals("LBS") && !resultado.equals("BRL") && !resultado.equals("ARS"));
        return resultado;

    }

    
    public static int leerCantidad(String moneda) {
        int resultado = 0;
        do {
            String texto = JOptionPane.showInputDialog("indica la cantidad de " + moneda);
            resultado = Integer.parseInt(texto);
        } while (resultado <= 0);
        return resultado;
    }

    
    public static double convertirMoneda(String moneda1, double i) {
        double resultado;
        switch (moneda1) {
            case "USD":
                resultado = i * USD;
                break;
            case "EUR":
                resultado = i * EUR;
                break;
            case "YEN":
                resultado = i * YEN;
                break;
            case "LBS":
                resultado = i * LBS;
                break;
            case "BRL":
                resultado = i * BRL;
                break;
            case "ARS":
                resultado = i * ARS;
                break;
            default:
                resultado = 0;
                break;
        }
        return resultado;
    }
}
