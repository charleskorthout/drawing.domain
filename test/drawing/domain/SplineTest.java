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
public class SplineTest {
    
    /**
     * Default constructor
     */
    public SplineTest() {
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
     * Test of getPoints method, of class Spline.
     * At initialization there are no items in the list
     */
    @Test
    public void testGetPointsInitialized() {
        System.out.println("getPoints");
        Spline instance = new Spline();
        int expResult = 0; 
        int result = instance.getPoints().size();
        assertEquals(expResult, result);        
    }

    /**
     * Test of getWeight method, of class Spline.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        Spline instance = new Spline();
        int weight = 0;
        instance.setWeight(weight);
        int expResult = weight;
        int result = instance.getWeight();
        assertEquals(expResult, result);        
    }

    /**
     * Test of setWeight method, of class Spline.
     */
    @Test
    public void testSetWeight() {
        System.out.println("setWeight");
        Spline instance = new Spline();
        int weight = 0;
        instance.setWeight(weight);
        int expResult = weight;
        int result = instance.getWeight();
        assertEquals(expResult, result);  
    }

    /**
     * Test of getDegree method, of class Spline.
     */
    @Test
    public void testGetDegree() {
        System.out.println("getDegree");
        int degree = 0;
        Spline instance = new Spline();
        instance.setDegree(degree);
        int expResult = degree;
        int result = instance.getDegree();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDegree method, of class Spline.
     */
    @Test
    public void testSetDegree() {
        System.out.println("setDegree");
        int degree = 0;
        Spline instance = new Spline();
        instance.setDegree(degree);
        int expResult = degree;
        int result = instance.getDegree();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Spline.
     */
    @Test
    public void testToString() {
        // TODO 
        assertTrue(true);
    }
    
}
