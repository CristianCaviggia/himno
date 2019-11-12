/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;

/**
 *
 * @author b8
 */
public class ProductTest {

    private Product prod1;

    public ProductTest() {
    }

    @Before
    public void setUp() throws Exception {
        prod1 = new Product("P001", "Plasma TV LG 32", "Plasma TV with TDT Decod. and high resolution Screen", 46999.99);
    }

    @After
    public void tearDown() {
        prod1 = null;
    }

    /**
     * Test of getCode method, of class Product.
     */
    @Test
    public void testGetCode() {
        System.out.println("getCode");
        Product instance = null;
        String expResult = "P001";
        String result = prod1.getCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getDescription method, of class Product.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Product instance = null;
        String expResult = "Plasma TV with TDT Decod. and high resolution Screen";
        String result = prod1.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPrice method, of class Product.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Product instance = null;
        Double expResult = 46999.99;
        Double result = prod1.getPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getTitle method, of class Product.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Product instance = null;
        String expResult = "Plasma TV LG 32";
        String result = prod1.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

}
