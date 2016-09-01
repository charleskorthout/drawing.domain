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
    
    /**
     * Default constructor
     */
    public ImageTest() {
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
     * Test of getFile method, of class Image.
     */
    @Test
    public void testGetFile() {
        System.out.println("getFile");
        String file = "Testname";
        Image instance = new Image();
        instance.setFile(file);
        String expResult = file;
        String result = instance.getFile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.        
    }

    /**
     * Test of setFile method, of class Image.
     */
    @Test
    public void testSetFile() {
        System.out.println("setFile");
        String file = "Testname";
        Image instance = new Image();
        instance.setFile(file);
        String expResult = file;
        String result = instance.getFile();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSize method, of class Image.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        int size = 0;
        Image instance = new Image();
        instance.setSize(size);
        int expResult = size;
        int result = instance.getSize();
        assertEquals(expResult, result);
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
        int expResult = size;
        int result = instance.getSize();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Image.
     */
    @Test
    public void testToString() {
        // TODO 
        assertTrue(true);
    }
    
}
