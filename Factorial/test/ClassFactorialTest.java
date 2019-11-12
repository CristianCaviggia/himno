

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;


public class ClassFactorialTest {
    
    public ClassFactorialTest() {
    }
    @BeforeClass
    public static void setUpClass()throws Exception{
        
    }
    @AfterClass
    public static void tearDownClass()throws Exception{
        
    }
    

    
    @Test
    public void testFactorial(){
        assertEquals(1, ClassFactorial.factorial(0));
        assertTrue(1 == ClassFactorial.factorial(1));
        assertEquals(24, ClassFactorial.factorial(4));
        assertEquals(720, ClassFactorial.factorial(6));
        boolean excepcionLanzada = false;
        try{
            ClassFactorial.factorial(-1);
        }catch(IllegalArgumentException e){
            excepcionLanzada = true;
        }
        assertTrue(excepcionLanzada);
    }
    
}
