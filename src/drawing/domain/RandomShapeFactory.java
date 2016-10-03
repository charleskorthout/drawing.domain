/*
 * RandomShapeFactory can create random shapes out of the 5 possible shapes and
 * randomly creates an anchor point.
 */

package drawing.domain;
import java.awt.Color;
import java.awt.Font;
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
    private static final int IMAGEHEIGHT = 100;
    private static final int IMAGEWIDTH = 100;
    private static final int MAXFONT = 60;
    
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
     * Returns a random font size
     * @return 
     */
    private static int getRandomFontsize(){
        Random r = new Random();
        return r.nextInt(MAXFONT );
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
     * Returns a random color
     * @return a random color
     */
    private static Color getRandomColor() {
        int r = (int) (Math.random() * 255);
        int g = (int) (Math.random() * 255);
        int b = (int) (Math.random() * 255);
        Color color = new Color(r, g, b);
        return color;
    }
    
    private static Image getRandomImage() {
        Image image = new Image();
        image.setFile("C:\\temp\\iwpold\\img\\charles.jpg");
        image.setAnchor(new Point(RandomShapeFactory.getRandomX(), RandomShapeFactory.getRandomY()));
        image.setHeight(RandomShapeFactory.IMAGEHEIGHT);
        image.setWidth(RandomShapeFactory.IMAGEWIDTH);
        return image;
    }
    
    /**
     * Create an oval with random settings
     * @return the random oval
     */
    private static Oval getRandomOval(){
        Oval oval = new Oval();
        oval.setAnchor(new Point(RandomShapeFactory.getRandomX(), RandomShapeFactory.getRandomY()));
        oval.setColor(RandomShapeFactory.getRandomColor());
        oval.setHeight(RandomShapeFactory.getRandomY());
        oval.setWidth(RandomShapeFactory.getRandomX());  
        return oval;        
    }
    
    /**
     * Create a new text shape
     * @return the random text
     */
    private static PaintedText getRandomPaintedText(){
        PaintedText text = new PaintedText();
        text.setAnchor(new Point(RandomShapeFactory.getRandomX(), RandomShapeFactory.getRandomY()));
        text.setColor(RandomShapeFactory.getRandomColor());
        text.setFont(new Font("Arial", Font.BOLD, RandomShapeFactory.getRandomFontsize()));
        text.setContent("This is sample text");
        return text;
    }
    
    /**
     * Create a random spline
     * @return the random spline
     */
    private static Spline getRandomSpline() {
        Spline spline = new Spline();
        spline.setAnchor(new Point(RandomShapeFactory.getRandomX(), RandomShapeFactory.getRandomY()));
        spline.setColor(RandomShapeFactory.getRandomColor());
        spline.setWeight(RandomShapeFactory.getRandomIndex());
        spline.setDegree(RandomShapeFactory.getRandomIndex());
        for (int i = 0 ; i < RandomShapeFactory.getRandomIndex(); i++){
            Point p = new Point(RandomShapeFactory.getRandomX(), RandomShapeFactory.getRandomY());
            spline.addPoint(p);
        }
        return spline;
    }
    
    private static Polygon getRandomPolygon(){
        Polygon polygon = new Polygon();
        polygon.setColor(RandomShapeFactory.getRandomColor());
        polygon.setAnchor(new Point(RandomShapeFactory.getRandomX(), RandomShapeFactory.getRandomY()));
        polygon.setWeight(RandomShapeFactory.getRandomIndex());
        for (int i = 0 ; i < RandomShapeFactory.getRandomIndex(); i++){
            Point p = new Point(RandomShapeFactory.getRandomX(), RandomShapeFactory.getRandomY());
            polygon.addPoint(p);
        }
        return polygon;
    }
    
    /**
     * Randomly select a shape from the possible shapes
     * @return a random shape
     */
    private static DrawingItem getRandomShape() {
        int shapeIndex = getRandomIndex();
        DrawingItem di;
        switch (shapeIndex) {
            case 0 : di = RandomShapeFactory.getRandomImage(); break;
            case 1 : di = RandomShapeFactory.getRandomOval();  break;
            case 2 : di = RandomShapeFactory.getRandomPaintedText(); break;
            case 3 : di = RandomShapeFactory.getRandomPolygon();break;
            default : di = RandomShapeFactory.getRandomSpline();                
        }
        return di;
    }
}
