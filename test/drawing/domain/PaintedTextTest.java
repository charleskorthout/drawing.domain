/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing.domain;

import java.awt.Font;
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
    
    public PaintedTextTest() {
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
     * Test of getContent method, of class PaintedText.
     */
    @Test
    public void testGetContent() {
        System.out.println("getContent");
        PaintedText instance = new PaintedText();
        String expResult = "";
        String result = instance.getContent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContent method, of class PaintedText.
     */
    @Test
    public void testSetContent() {
        System.out.println("setContent");
        String content = "";
        PaintedText instance = new PaintedText();
        instance.setContent(content);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFont method, of class PaintedText.
     */
    @Test
    public void testGetFont() {
        System.out.println("getFont");
        PaintedText instance = new PaintedText();
        Font expResult = null;
        Font result = instance.getFont();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFont method, of class PaintedText.
     */
    @Test
    public void testSetFont() {
        System.out.println("setFont");
        Font font = null;
        PaintedText instance = new PaintedText();
        instance.setFont(font);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class PaintedText.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PaintedText instance = new PaintedText();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
