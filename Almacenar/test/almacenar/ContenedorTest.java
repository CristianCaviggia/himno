package almacenar;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;
import almacenar.Paquete;
import almacenar.Contenedor;

/**
 *
 * @author b8
 */
public class ContenedorTest {

    private Contenedor contenedor = null;
    private int cantidadPaquetes = 5;
    private Paquete[] paquetes = null;
    private double unidadVolumenPaquete = 10.0;

    public ContenedorTest() {
    }

    @Before
    public void setUp() throws Exception {
        assertTrue("Error, debe testear al menos un paquete", cantidadPaquetes > 0);
        paquetes = new Paquete[cantidadPaquetes];
        for (int i = 0; i < cantidadPaquetes; i++) {
            paquetes[i] = new Paquete((i + 1) * unidadVolumenPaquete);
        }
        contenedor = new Contenedor();
    }

    @After
    public void tearDown() {

    }

    /**
     * Test of agregar method, of class Contenedor.
     */
    @Test
    public void testAgregar() {
        System.out.println("agregar");
        contenedor.limpiar();
        for (int i = 0; i < cantidadPaquetes; i++) {
            assertTrue("Fallo al agregar un paquete al contenedor", contenedor.agregar(paquetes[i]));
            assertFalse("Debe fallar al agregar dos veces el mismo paquete", contenedor.agregar(paquetes[i]));
            assertTrue("Fallo al verificar si contiene el paquete", contenedor.contiene(paquetes[i]));
        }
        

    }

    @Test
    public void testRemover() {
        System.out.println("remover");
        contenedor.limpiar();
        assertFalse("Fallo si intenta remover de una lista vacia", contenedor.remover(paquetes[0]));
        for (int i = 0; i < cantidadPaquetes; i++) {
            contenedor.limpiar();
            for (int j = 0; j < i; j++) {
                contenedor.agregar(paquetes[j]);
            }
            for (int j = 0; j < i; j++) {
                assertTrue("Fallo al remover un paquete", contenedor.remover(paquetes[j]));
                assertFalse("Fallo si el contenedor aun tiene el paquete despues de removerlo", contenedor.contiene(paquetes[j]));
            }
            for (int j = i; j < cantidadPaquetes; j++) {
                assertFalse("Debe fallar al intentar remover un paquete que no esta en la lista", contenedor.remover(paquetes[j]));
            }
        }
    }

    /**
     * Test of getVolumen method, of class Contenedor.
     */
    @Test
    public void testGetVolumen() {
        System.out.println("getVolumen");
        Contenedor instance = new Contenedor();
        double esperado = 0.0;
        for (int i = 0; i < cantidadPaquetes; i++) {
            esperado = esperado + paquetes[i].getVolumen();
        }
        contenedor.limpiar();
        for(int i=0;i<cantidadPaquetes;i++){
            contenedor.agregar(paquetes[i]);
        }
        double resultado = contenedor.getVolumen();
        assertEquals(esperado, resultado, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of cantidad method, of class Contenedor.
     */
    @Test
    public void testCantidad() {
        System.out.println("cantidad");
        contenedor.limpiar();
        for (int i = 0; i < cantidadPaquetes; i++) {
            contenedor.agregar(paquetes[i]);
        }
        Contenedor instance = new Contenedor();
        int expResult = 0;
        int resultado = contenedor.cantidad();
        assertEquals(cantidadPaquetes, resultado);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of limpiar method, of class Contenedor.
     */
    @Test
    public void testLimpiar() {
        System.out.println("limpiar");
        Contenedor instance = new Contenedor();
        contenedor.limpiar();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(0, contenedor.cantidad());
    }

    /**
     * Test of contiene method, of class Contenedor.
     */
    @Test
    public void testContiene() {
        System.out.println("contiene");
        contenedor.limpiar();
        for (int i = 0; i < cantidadPaquetes; i++) {
            contenedor.agregar(paquetes[i]);
        }
        for (int i = 0; i < cantidadPaquetes - 1; i++) {
            assertTrue("Contenedor contiene un paquete", contenedor.contiene(paquetes[i]));
        }
        Paquete paquete = null;
        Contenedor instance = new Contenedor();
        boolean expResult = false;
        boolean result = instance.contiene(paquete);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

}
