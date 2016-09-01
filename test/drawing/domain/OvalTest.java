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
    
    /**
     * Default constructor
     */
    public OvalTest() {
    }
    
    /**
     * Test setup class
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     * Test cleanup class
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     * Test setup
     */
    @Before
    public void setUp() {
    }
    
    /**
     * Test cleanup
     */
    @After
    public void tearDown() {
    }
    
    /**
     * Test of getWeight method, of class Oval.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        int weight = 0;
        Oval instance = new Oval();
        instance.setWeight(weight);
        int expResult = weight;
        int result = instance.getWeight();
        assertEquals(expResult, result);        
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
        int expResult = weight;
        int result = instance.getWeight();
        assertEquals(expResult, result);
    }

    /**
     * Test of getWidth method, of class Oval.
     */
    @Test
    public void testGetWidth() {
        System.out.println("getWidth");
        int width = 0;
        Oval instance = new Oval();
        instance.setWidth(width);
        int expResult = width;
        int result = instance.getWidth();
        assertEquals(expResult, result);
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
        int expResult = width;
        int result = instance.getWidth();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Oval.
     */
    @Test
    public void testToString() {
        // TODO 
        assertTrue(true);
    }
    
}
