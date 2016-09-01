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
public class ImageTest {
    
    public ImageTest() {
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
     * Test of getFile method, of class Image.
     */
    @Test
    public void testGetFile() {
        System.out.println("getFile");
        Image instance = new Image();
        String expResult = "";
        String result = instance.getFile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFile method, of class Image.
     */
    @Test
    public void testSetFile() {
        System.out.println("setFile");
        String file = "";
        Image instance = new Image();
        instance.setFile(file);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class Image.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        Image instance = new Image();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSize method, of class Image.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        int size = 0;
        Image instance = new Image();
        instance.setSize(size);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Image.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Image instance = new Image();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
