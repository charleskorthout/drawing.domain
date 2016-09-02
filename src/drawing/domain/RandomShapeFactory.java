/*
 * RandomShapeFactory can create random shapes out of the 5 possible shapes and
 * randomly creates an anchor point.
 */

package drawing.domain;
import java.awt.Point;
import java.util.*;
/**
 *
 * @author Charles Korthout
 */
public class RandomShapeFactory {
    
    private static final int TOTALSHAPES = 5 ; // five different shapes
    private static final int MAXWIDTH = 1000; // maximum width of a drawing
    private static final int MAXHEIGHT = 1000; // maximum height
    
    /**
     * Select randomly a shape from the five possible shapes
     * @return a random shape
     */
    public static DrawingItem createShape(){        
        return getRandomShape();
    }
    
    /**
     * Randomly select a X value 
     * @return X value within a predefined range
     */
    private static int getRandomX() {
        Random r = new Random();
        return r.nextInt(MAXWIDTH );

    }
    
    /**
     * Get a random Y value from a predefined range
     * @return Y value within a predefined range
     */
    private static int getRandomY() {
        Random r = new Random();
        return r.nextInt(MAXHEIGHT );
    }
    
    /**
     * Randomly select an index from 0 to 4
     * @return an index in the range from 0 to 4
     */
    private static int getRandomIndex() {
        Random r = new Random();
        return r.nextInt(TOTALSHAPES);
    }
    
    /**
     * Randomly select a shape from the possible shapes
     * @return a random shape
     */
    private static DrawingItem getRandomShape() {
        int shapeIndex = getRandomIndex();
        DrawingItem di;
        switch (shapeIndex) {
            case 0 : di = new Image(); break;
            case 1 : di = new Oval();  break;
            case 2 : di = new PaintedText(); break;
            case 3 : di = new Polygon();break;
            default : di = new Spline();                
        }
        di.setAnchor(new Point(getRandomX(),getRandomY()));
        return di;
    }
}
