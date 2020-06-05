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
//    @Test
//    public void testMultHash() {
//        System.out.println("multHash");
//        HashMap<String, Double> ah = new HashMap<String, Double>();
//        Double value = 3.14;
//        ah.put("a", value);
//        VCaller6 instance = new VCaller6(ah);
//        boolean expResult = false;
//        boolean result = instance.multHash(ah);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
    
    @Test
    public void testMultHash() {//новый тест
    HashMap<String,Double> hd= new HashMap<String,Double>();
        hd.put("a", 1.1);
        hd.put("b", 2.0);
        hd.put("c", 3.0);
        hd.put("d", 1.1);
        HashMap<String,Double> ad= new HashMap<String,Double>();
        ad.put("e", 1.1);
        ad.put("r", 2.0);
        ad.put("c", 3.0);
        ad.put("d", Double.NaN);//not a number
        VCaller6 test=new VCaller6(hd);
        assertEquals(test.multHash(ad), true);//проверяем на вхождение в условие
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
