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
public class DrawingTest {
    
    /**
     * From http://stackoverflow.com/questions/3047051/how-to-determine-if-a-list-is-sorted-in-java
     * @param <T> generic type
     * @param listOfT the collection to be checked
     * @return logical value if it sorted
     */
    public static <T extends Comparable> boolean isSorted(List<T> listOfT) {
        T previous = null;
        for (T t: listOfT) {
            if (previous != null && t.compareTo(previous) < 0) return false;
            previous = t;
        }
        return true;
    }
    
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
    public void testProperlySortedSingleItem() {
        System.out.println("getItems");
        DrawingItem item = new Oval();
        Drawing instance = new Drawing();
        int expResult = 1;
        instance.append(item);
        int result = instance.getItems().size();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of the number inserted items is equal to the number of returned items
     */
    @Test
    public void testIfAllItemsAreAdded() {
        System.out.println("getItems");
        Drawing instance = new Drawing();
        int expResult = 10;
        for (int i = 0; i < expResult; i++)
        {
            DrawingItem item = RandomShapeFactory.createShape();
            instance.append(item);
        }
        int result = instance.getItems().size();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of the number inserted items is equal to the number of returned items
     */
    @Test
    public void testIfAllItemsAreSorted() {
        System.out.println("getItems");
        Drawing instance = new Drawing();
        int listsize = 10;
        for (int i = 0; i < listsize; i++)
        {
            DrawingItem item = RandomShapeFactory.createShape();
            instance.append(item);
        }
        boolean result = DrawingTest.isSorted(instance.getItems());
        assertTrue(result);
    }
    
    /**
     * Output the items to the output stream
     */
    @Test
    public void testvisualizeAll() {
        System.out.println("getItems");
        Drawing instance = new Drawing();
        int listsize = 10;
        for (int i = 0; i < listsize; i++)
        {
            DrawingItem item = RandomShapeFactory.createShape();
            instance.append(item);
        }
        for (DrawingItem di : instance.getItems()){
            System.out.println(di.toString());
        }
        assertTrue(true);
    }
}
