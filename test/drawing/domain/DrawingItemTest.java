/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing.domain;

import java.awt.Color;
import java.awt.Point;
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
public class DrawingItemTest {
    
    /**
     * Default constructor
     */
    public DrawingItemTest() {
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
     * Test of getColor method, of class DrawingItem.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        DrawingItem instance = new DrawingItem();
        Color expResult = Color.RED;
        instance.setColor(Color.RED);
        Color result = instance.getColor();
        assertEquals(expResult, result);        
    }

    /**
     * Test of setColor method, of class DrawingItem.
     */
    @Test
    public void testSetColor() {
        DrawingItem instance = new DrawingItem();
        Color expResult = Color.RED;
        instance.setColor(Color.RED);
        Color result = instance.getColor();
        assertEquals(expResult, result);     
    }

    /**
     * Test of getAnchor method, of class DrawingItem.
     */
    @Test
    public void testGetAnchor() {
        System.out.println("getAnchor");
        DrawingItem instance = new DrawingItem();
        Point expResult = new Point(1,2);
        instance.setAnchor(expResult);
        Point result = instance.getAnchor();
        assertEquals(expResult, result);        
    }

    /**
     * Test of setAnchor method, of class DrawingItem.
     */
    @Test
    public void testSetAnchor() {
        DrawingItem instance = new DrawingItem();
        Point expResult = new Point(1,2);
        instance.setAnchor(expResult);
        Point result = instance.getAnchor();
        assertEquals(expResult, result);    
    }

    /**
     * Test of previousState method, of class DrawingItem.
     */
    @Test
    public void testPreviousState() {
        System.out.println("previousState");
        DrawingItem instance = new DrawingItem();
        DrawingItem expResult = instance;
        // change some values to force state to change and previous state to be saved
        instance.setColor(Color.yellow);
        DrawingItem result = instance.previousState();
        assertEquals(expResult, result);  
    }

    
}
