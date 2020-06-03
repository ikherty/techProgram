/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variant6;

import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author qw
 */
public class VCaller6Test {
    
    public VCaller6Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of multHash method, of class VCaller6.
     */
    @Test
    public void testMultHash() {
        System.out.println("multHash");
        HashMap<String, Double> ah = new HashMap<String, Double>();
        Double value = 3.14;
        ah.put("a", value);
        VCaller6 instance = new VCaller6(ah);
        boolean expResult = false;
        boolean result = instance.multHash(ah);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of divHash method, of class VCaller6.
     */
    /* @Test
    public void testDivHash() {
        System.out.println("divHash");
        HashMap<String, Double> ah = null;
        VCaller6 instance = new VCaller6();
        boolean expResult = false;
        boolean result = instance.divHash(ah);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
