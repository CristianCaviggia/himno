package almacenar;

import org.junit.Test;
import static org.junit.Assert.*;
import almacenar.Paquete;

public class PaqueteTest {

    public PaqueteTest() {
    }

    /**
     * Test of getVolumen method, of class Paquete.
     */
    @Test
    public void testGetVolumen() {
        System.out.println("getVolumen");
        Paquete instance = new Paquete(1.0);
        double esperado = 1.0;
        double resultado = instance.getVolumen();
        assertEquals(esperado, resultado, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }

}
