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
public class SplineTest {
    
    public SplineTest() {
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
     * Test of getPoints method, of class Spline.
     */
    @Test
    public void testGetPoints() {
        System.out.println("getPoints");
        Spline instance = new Spline();
        List<Point> expResult = null;
        List<Point> result = instance.getPoints();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWeight method, of class Spline.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        Spline instance = new Spline();
        int expResult = 0;
        int result = instance.getWeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWeight method, of class Spline.
     */
    @Test
    public void testSetWeight() {
        System.out.println("setWeight");
        int weight = 0;
        Spline instance = new Spline();
        instance.setWeight(weight);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDegree method, of class Spline.
     */
    @Test
    public void testGetDegree() {
        System.out.println("getDegree");
        Spline instance = new Spline();
        int expResult = 0;
        int result = instance.getDegree();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Spline.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Spline instance = new Spline();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
