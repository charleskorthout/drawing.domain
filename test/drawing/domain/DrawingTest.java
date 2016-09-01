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
public class DrawingTest {
    
    /**
     * Default constructor
     */
    public DrawingTest() {
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
     * Test of getWidth method, of class Drawing.
     */
    @Test
    public void testGetWidth() {
        System.out.println("getWidth");
        int width = 0;
        Drawing instance = new Drawing();
        instance.setWidth(width);
        int expResult = width;
        int result = instance.getWidth();
        assertEquals(expResult, result);        
    }

    /**
     * Test of setWidth method, of class Drawing.
     */
    @Test
    public void testSetWidth() {
        System.out.println("setWidth");
        int width = 0;
        Drawing instance = new Drawing();
        instance.setWidth(width);
        int expResult = width;
        int result = instance.getWidth();
        assertEquals(expResult, result);  
    }

    /**
     * Test of getHeight method, of class Drawing.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        int height = 0;
        Drawing instance = new Drawing();
        instance.setHeight(height);
        int expResult = height;
        int result = instance.getHeight();
        assertEquals(expResult, result);        
    }

    /**
     * Test of setHeight method, of class Drawing.
     */
    @Test
    public void testSetHeight() {
        System.out.println("setHeight");
        int height = 0;
        Drawing instance = new Drawing();
        instance.setHeight(height);
        int expResult = height;
        int result = instance.getHeight();
        assertEquals(expResult, result);     
    }

    /**
     * Test of getName method, of class Drawing.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String name = "";
        Drawing instance = new Drawing();
        instance.setName(name);
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Drawing.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Drawing instance = new Drawing();
        instance.setName(name);
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of append method, of class Drawing.
     */
    @Test
    public void testAppend() {
        System.out.println("append");
        DrawingItem item = new Oval();
        Drawing instance = new Drawing();
        int expResult = 1;
        instance.append(item);
        int result = instance.getItems().size();
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of append method, of class Drawing.
     */
    @Test
    public void testProperlySorted() {
        System.out.println("getItems");
        DrawingItem item = new Oval();
        Drawing instance = new Drawing();
        int expResult = 1;
        instance.append(item);
        int result = instance.getItems().size();
        assertEquals(expResult, result);
    }
}
