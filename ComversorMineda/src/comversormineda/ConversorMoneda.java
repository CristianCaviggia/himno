package comversormoneda;

import javax.swing.JOptionPane;

/**
 * Clase para comvertir una cantidad de dólares, euros o yenes a pesos
 *
 * @author Bruno Blas Galeano y Nestor john.
 *
 */

public class ConversorMoneda {
//Constantes con la cotización de las monedas

    final static double USD = 46.19;
    final static double EUR = 49.13;
    final static double YEN = 0.40;
    final static double LBS = 55.36;
    final static double BRL = 11.28;

    /**
     * Método principal.
     *
     * @param arg the command line arguments.
     */

    public static void main(String[] args) {
        String moneda = leerMoneda();
        while (!moneda.equals("SALIR")) {
            int cantidad = leerCantidad(moneda);
            double pesos = convertirAPesos(moneda, cantidad);
            String mensaje = moneda + " " + cantidad + " equivalen a $" + String.format("%.2f", pesos);
            JOptionPane.showMessageDialog(null, mensaje);
            moneda = leerMoneda();
        }
    }

    /**
     * Lee una moneda por teclado
     *
     * @return código de moneda USD, EUR o YEN.
     */
    public static String leerMoneda() {
        String resultado;
        do {
            String texto = JOptionPane.showInputDialog("Indicar la moneda USD,EUR, YEN, LBS, BRL o SALIR");
            resultado = texto.trim().toUpperCase();
        } while (!resultado.equals("USD") && !resultado.equals("EUR") && !resultado.equals("YEN") && !resultado.equals("LBS") && !resultado.equals("BRL") && !resultado.equals("SALIR"));
        return resultado;

    }

    /**
     * Lee una cantidd de monedas del teclado.
     *
     * @paramoneda USD, EUR, YEN.
     * @return cantidad de monedas.
     */
    public static int leerCantidad(String moneda) {
        int resultado = 0;
        do {
            String texto = JOptionPane.showInputDialog("indica la cantidad de " + moneda);
            resultado = Integer.parseInt(texto);
        } while (resultado <= 0);
        return resultado;
    }

    /**
     * Convierte una cantidad de moneda a pesos.
     *
     * @param moneda USD,EUR,YEN.
     * @param cantidad de monedas
     * @return importe en pesos
     */
    public static double convertirAPesos(String moneda, double cantidad) {
        double resultado;
        switch (moneda) {
            case "USD":
                resultado = cantidad * USD;
                break;
            case "EUR":
                resultado = cantidad * EUR;
                break;
            case "YEN":
                resultado = cantidad * YEN;
                break;
            case "LBS":
                resultado = cantidad * LBS;
                break;
            case "BRL":
                resultado = cantidad * BRL;
                break;
            default:
                resultado = 0;
                break;
        }
        return resultado;
    }
}
