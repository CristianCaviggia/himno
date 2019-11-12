package conversormoneda2.pkg0;

import javax.swing.JOptionPane;

/**
 * Clase para comvertir una cantidad de dólares, euros o yenes a pesos
 *
 * @author Bruno Blas Galeano y Nestor john.
 *
 */
public class ConversorMoneda2 {
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
            do{
                String moneda1 = leerMoneda();
             int cantidad1= leerCantidad();
             String moneda2= leermoneda();
             double cantidad2=convertirMoneda(moneda1,cantidad1,moneda2);
                     String mensaje= moneda1+" "+cantidad1+" "+"equivalen a "+moneda2+" "+String.format("%,2f",cantidad2);
                     JOptionPane.showMessageDialog(null , mensaje);
        while (!moneda1.equals("SALIR")) {
          
            
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
    public static double convertirMoneda(String moneda, double cantidad2,int moneda1, int moneda2) {
        double resultado;
        switch (moneda1) {
            case "USD":
                resultado = cantidad2 * moneda1/moneda2;
                break;
            case "EUR":
                resultado = cantidad2 * moneda1/moneda2;
                break;
            case "YEN":
                resultado = cantidad2 * moneda1/moneda2;
                break;
            case "LBS":
                resultado = cantidad2 * moneda1/moneda2;
                break;
            case "BRL":
                resultado = cantidad2 * moneda1/moneda2;
                break;
            default:
                resultado = 0;
                break;
        }
        return resultado;
    }

    private static int leerCantidad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


    


