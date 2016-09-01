/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing.domain;

import java.awt.Point;
import java.util.List;
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
    
    public PolygonTest() {
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
     * Test of getVertices method, of class Polygon.
     */
    @Test
    public void testGetVertices() {
        System.out.println("getVertices");
        Polygon instance = new Polygon();
        List<Point> expResult = null;
        List<Point> result = instance.getVertices();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWeight method, of class Polygon.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        Polygon instance = new Polygon();
        int expResult = 0;
        int result = instance.getWeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Polygon.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Polygon instance = new Polygon();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
