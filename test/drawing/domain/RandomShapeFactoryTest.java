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
import java.util.*;

/**
 *
 * @author charl
 */
public class RandomShapeFactoryTest {
    
    /**
     * Default constructor
     */
    public RandomShapeFactoryTest() {
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
     * Test of createShape method, of class RandomShapeFactory.
     */
    @Test
    public void testCreateShape() {
        System.out.println("createShape");
        Set<Integer> set = new HashSet();
        for (int i = 0; i < 100; i++) {
            DrawingItem di = RandomShapeFactory.createShape();
            if (di instanceof Image) set.add(0);
            if (di instanceof Oval) set.add(1);
            if (di instanceof PaintedText) set.add(2);
            if (di instanceof Polygon) set.add(3);
            if (di instanceof Spline) set.add(4);
        }
        int expResult = 5; // we must have 5 different shapes
        int result = set.size();
        assertEquals(expResult, result);
    }
    
}
