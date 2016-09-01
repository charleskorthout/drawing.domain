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
public class PolygonTest {
    
    /**
     * Default constructor
     */
    public PolygonTest() {
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
     * Test of getVertices method, of class Polygon.
     * Initialy the list must be empty (0 items)
     */
    @Test
    public void testGetVertices() {
        System.out.println("getVertices");
        Polygon instance = new Polygon();
        int expResult = 0;
        int result = instance.getVertices().size();
        assertEquals(expResult, result);
    }

    /**
     * Test of getWeight method, of class Polygon.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        int weight = 0;
        Polygon instance = new Polygon();
        instance.setWeight(weight);
        int expResult = weight;
        int result = instance.getWeight();
        assertEquals(expResult, result);
    }

    /**
     * Test of setWeight method, of class Polygon.
     */
    @Test
    public void testSetWeight() {
        System.out.println("setWeight");
        int weight = 0;
        Polygon instance = new Polygon();
        instance.setWeight(weight);
        int expResult = weight;
        int result = instance.getWeight();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Polygon.
     */
    @Test
    public void testToString() {
        // TODO 
        assertTrue(true); 
    }
    
}
