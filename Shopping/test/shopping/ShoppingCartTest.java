
package shopping;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 *
 * @author b8
 */
public class ShoppingCartTest {
    private ShoppingCart cart1;
    private Product prod1;
    public ShoppingCartTest() {
    }
    @Before
    public void setUp(){
        cart1 = new ShoppingCart();
        prod1 = new Product("P001", "Plasma TV LG 32", "Plasma TV with TDT Decod. and high resolution Screen", 46999.99);
        cart1.addItem(prod1);
    }
    @After
    public void tearDown(){
        prod1 = null;
        cart1 = null;
    }

    /**
     * Test of getBalance method, of class ShoppingCart.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        ShoppingCart instance = new ShoppingCart();
        double expResult = 46999.99;
        double result = cart1.getBalance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of addItem method, of class ShoppingCart.
     */
    @Test
    public void testAddItem() {
        System.out.println("addItem");
        Product prod2 = new Product("P002", "DVD player Samsung", "DVD player remote control and programming", 39.99);
        cart1.addItem(prod2);
        assertEquals(2, cart1.getItemCount());
        double expected = prod1.getPrice()+prod2.getPrice();
        double result = cart1.getBalance();
        assertEquals(expected, result, 0.00);
        Product item = null;
        ShoppingCart instance = new ShoppingCart();
        instance.addItem(item);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of removeItem method, of class ShoppingCart.
     */
    @Test
    public void testRemoveItem() {
        System.out.println("removeItem");
        cart1.removeItem(prod1);
        assertEquals(0, cart1.getItemCount());
        Product item = null;
        ShoppingCart instance = new ShoppingCart();
        instance.removeItem(item);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getItemCount method, of class ShoppingCart.
     */
    @Test
    public void testGetItemCount() {
        System.out.println("getItemCount");
        ShoppingCart instance = new ShoppingCart();
        int expResult = 1;
        int result = cart1.getItemCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of empty method, of class ShoppingCart.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        cart1.empty();
        assertEquals(0, cart1.getItemCount());
        ShoppingCart instance = new ShoppingCart();
        instance.empty();
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
