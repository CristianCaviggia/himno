
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author b8
 */
public class YearUtilitiesTest {

    public YearUtilitiesTest() {
    }

    /**public void testIsLeap() {
        YearUtilities instance = new YearUtilities();
        assertTrue(instance.isLeap(4)); //es bisiesto
        assertFalse(instance.isLeap(100)); //no es bisiesto
        assertTrue(instance.isLeap(400)); //es bisiesto
        assertFalse(instance.isLeap(2011)); //no es bisiesto
        assertTrue(instance.isLeap(2012)); //es bisiesto
    }
*/
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {

    }

    @Test
    public void testIsLeap() {
        System.out.println("isLeap");
        //int year = 0;
        YearUtilities instance = new YearUtilities();
        //boolean expResult = false;
        //boolean result = instance.isLeap(year);
        //assertEquals(expResult, result);

        assertTrue(instance.isLeap(4)); //es bisiesto
        assertFalse(instance.isLeap(100)); //no es bisiesto
        assertTrue(instance.isLeap(400)); //es bisiesto
        assertFalse(instance.isLeap(2011)); //no es bisiesto
        assertTrue(instance.isLeap(2012)); //es bisiesto

    }

}
