
package precioproductoapp;
import javax.swing.JOptionPane;


public class PrecioProductoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double IVA = 0.21;
        String texto=JOptionPane.showInputDialog("Introduce el preciode un producto ");
        double precio= Double.parseDouble(texto);
        double precioFinal=precio+(precio*IVA);
        System.out.println(precioFinal);
    }
    
}
