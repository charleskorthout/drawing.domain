/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing.domain;

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
public class DrawingItemComparatorTest {
    
    public DrawingItemComparatorTest() {
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
     * Test of compare method, of class DrawingItem.
     * 
     * The test is using the same shapes, but the points are located at
     *  x1=1 and y1 = 1 , x2 = 1 and y2 = 1
     * 
     * The test result must be equal
     */
    @Test
    public void testCompareSameShape() {
        System.out.println("compare");
        DrawingItem di1 = new Oval();
        Point anchor = new Point(1,1);
        di1.setAnchor(anchor);
        DrawingItem di2 = new Oval();
        di2.setAnchor(anchor);
        DrawingItemComparator instance = new DrawingItemComparator();
        int expResult = 0;
        int result = instance.compare(di1, di2);
        assertEquals(expResult, result);        
    }
    
    /**
     * Test of compare method, of class DrawingItem.
     * 
     * The test is using the same shapes, but the points are located at
     *  x1=1 and y1 = 1 , x2 = 2 and y2 = 2
     * 
     * The test result must ensure that the second is larger than the first
     */
    @Test
    public void testCompareSameShapeFirstShapeGreaterDistance() {
        System.out.println("compare");
        DrawingItem di1 = new Oval();
        Point anchor1 = new Point(1,1);
        di1.setAnchor(anchor1);
        Point anchor2 = new Point(2,2);
        DrawingItem di2 = new Oval();
        di2.setAnchor(anchor2);
        DrawingItemComparator instance = new DrawingItemComparator();
        int expResult = -1;
        int result = instance.compare(di1, di2);         
        assertEquals(expResult, result);       
    }
    
    /**
     * Test of compare method, of class DrawingItem.
     * 
     * The test is using the same shapes, but the points are located at
     *  x1= 2 and y1 = 2 , x2 = 1 and y2 = 1
     * 
     * The test result must ensure that the second is smaller than the first
     */
    @Test
    public void testCompareSameShapeFirstShapeSmallerDistance() {
        System.out.println("compare");
        DrawingItem di1 = new Oval();
        Point anchor1 = new Point(2,2);
        di1.setAnchor(anchor1);
        Point anchor2 = new Point(1,1);
        DrawingItem di2 = new Oval();
        di2.setAnchor(anchor2);
        DrawingItemComparator instance = new DrawingItemComparator();
        int expResult = 1;
        int result = instance.compare(di1, di2);         
        assertEquals(expResult, result);       
    }
    
    /**
     * Test of compare method, of class DrawingItem.
     * 
     * The test is using a different shapes, but the points are located at
     *  x1=1 and y1 = 1 , x2 = 1 and y2 = 1
     * 
     * The test result must be equal
     */
    @Test
    public void testCompareSameShapeSamePoint() {
        System.out.println("compare");
        DrawingItem di1 = new Oval();
        Point anchor = new Point(1,1);
        di1.setAnchor(anchor);
        DrawingItem di2 = new Spline();
        di2.setAnchor(anchor);
        DrawingItemComparator instance = new DrawingItemComparator();
        int expResult = 0; // greater
        int result = instance.compare(di1, di2);
        assertEquals(expResult, result);       
    }
    
    /**
     * Test of compare method, of class DrawingItem.
     * The test is using the same shapes, but the points are located at
     *  x1=1 and y1 =2 , x2 = 2 and y2 = 1
     * 
     * The test result must be equal
     */
    @Test
    public void testCompareSameShapeDifferentPointsEqualDistance() {
        System.out.println("compare");
        DrawingItem di1 = new Oval();
        Point anchor1 = new Point(1,2);
        di1.setAnchor(anchor1);
        DrawingItem di2 = new Oval();
        Point anchor2 = new Point(2,1);
        di2.setAnchor(anchor2);
        DrawingItemComparator instance = new DrawingItemComparator();
        int expResult = 0;
        int result = instance.compare(di1, di2);
        assertEquals(expResult, result);        
    }
    
    /**
     * Test of compare method, of class DrawingItem.
     * The test is using the different shapes, but the points are located at
     *  x1=1 and y1 =2 , x2 = 2 and y2 = 1
     * 
     * The test result must be equal
     */
    @Test
    public void testCompareDifferentShapeDifferentPointsEqualDistance() {
        System.out.println("compare");
        DrawingItem di1 = new Oval();
        Point anchor1 = new Point(1,2);
        di1.setAnchor(anchor1);
        DrawingItem di2 = new Polygon();
        Point anchor2 = new Point(2,1);
        di2.setAnchor(anchor2);
        DrawingItemComparator instance = new DrawingItemComparator();
        int expResult = 0;
        int result = instance.compare(di1, di2);
        assertEquals(expResult, result);        
    }
    
}
