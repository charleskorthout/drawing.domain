/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author charl
 */
public class OvalTest {
    
    public OvalTest() {
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
     * Test of getWeight method, of class Oval.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        Oval instance = new Oval();
        int expResult = 0;
        int result = instance.getWeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWeight method, of class Oval.
     */
    @Test
    public void testSetWeight() {
        System.out.println("setWeight");
        int weight = 0;
        Oval instance = new Oval();
        instance.setWeight(weight);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWidth method, of class Oval.
     */
    @Test
    public void testGetWidth() {
        System.out.println("getWidth");
        Oval instance = new Oval();
        int expResult = 0;
        int result = instance.getWidth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWidth method, of class Oval.
     */
    @Test
    public void testSetWidth() {
        System.out.println("setWidth");
        int width = 0;
        Oval instance = new Oval();
        instance.setWidth(width);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Oval.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Oval instance = new Oval();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
