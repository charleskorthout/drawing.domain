/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing.domain;

import java.awt.*;
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
public class PaintedTextTest {
    
    /**
     * Default constructor
     */
    public PaintedTextTest() {
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
     * Test of getContent method, of class PaintedText.
     */
    @Test
    public void testGetContent() {
        System.out.println("getContent");
        String content = "Some content";
        PaintedText instance = new PaintedText();
        instance.setContent(content);
        String expResult = content;
        String result = instance.getContent();
        assertEquals(expResult, result);
    }

    /**
     * Test of setContent method, of class PaintedText.
     */
    @Test
    public void testSetContent() {
        System.out.println("setContent");
        String content = "Some content";
        PaintedText instance = new PaintedText();
        instance.setContent(content);
        String expResult = content;
        String result = instance.getContent();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFont method, of class PaintedText.
     */
    @Test
    public void testGetFont() {
        System.out.println("getFont");
        Font font = new java.awt.Font("Arial", Font.BOLD, 12); 
        PaintedText instance = new PaintedText();
        Font expResult = font;
        instance.setFont(font);
        Font result = instance.getFont();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFont method, of class PaintedText.
     */
    @Test
    public void testSetFont() {
        System.out.println("setFont");
        Font font = new java.awt.Font("Arial", Font.BOLD, 12); 
        PaintedText instance = new PaintedText();
        Font expResult = font;
        instance.setFont(font);
        Font result = instance.getFont();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class PaintedText.
     */
    @Test
    public void testToString() {
        // TODO 
        assertTrue(true);
    }
    
}
