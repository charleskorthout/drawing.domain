/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package drawing.javafx;

import drawing.domain.IPaintable;
import drawing.domain.Image;
import drawing.domain.Oval;
import drawing.domain.PaintedText;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author Charles Korthout
 */
public class JavaFXPaintable implements IPaintable{

    Color color = Color.BLACK;
    GraphicsContext gc;

    /**
     * Constructor
     * @param gc the Graphics context
     */
    public JavaFXPaintable(GraphicsContext gc) {
        this.gc = gc;
    }
    
    
    /**
     * set the color for a paint
     * @param color the color
     */
    @Override
    public void setColor(java.awt.Color color) {
        this.color = JavaFXPaintable.fromAWTColor(color );

    };
    
    /**
     * draw an oval
     * @param oval the oval to draw
     */
    public void paintOval(Oval oval) {
        gc.setStroke(JavaFXPaintable.fromAWTColor(oval.getColor()));
        gc.strokeOval(oval.getAnchor().x , oval.getAnchor().y, oval.getWidth(), oval.getHeight());          
    };
    
    /**
     * draw a line
     * @param from the start point
     * @param to the end point
     * @param weight the thickness of the line
     */
    @Override
    public void paintLine(java.awt.Point from, java.awt.Point to, int weight) {
        gc.setLineWidth(weight);
        gc.setStroke(this.color);
        gc.strokeLine(from.x, from.y, to.x, to.y);        
    }
            
        
    /**
     * draw a text
     * @param text the text to draw
     */
    @Override
    public void paintText(PaintedText text){
        gc.setStroke(JavaFXPaintable.fromAWTColor(text.getColor()));
        gc.fillText(text.getContent(), text.getAnchor().x, text.getAnchor().y + text.getFont().getSize()); 
    }
    
    /**
     * draw an image 
     * @param image the image to show
     */
    @Override
    public void paintImage(Image image) {
        int width = image.getAnchor().x  + image.getWidth();
        int height = image.getAnchor().y + image.getWidth();
        BufferedImage img2 = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img2.createGraphics();
        g2.drawImage(img2, 0, 0, width, height, null);
        javafx.scene.image.WritableImage fxImage = SwingFXUtils.toFXImage(img2, null);
        this.gc.drawImage(fxImage, image.getAnchor().x, image.getAnchor().y, width, height);
    }
    
    /**
     * Clear the drawing canvas
     */
    @Override
    public void clear() {
        Canvas canvas = gc.getCanvas();
        // Store the current transformation matrix
        gc.save();
        // Use the identity matrix while clearing the canvas
        gc.setTransform(1, 0, 0, 1, 0, 0);
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        // Restore the transform
        gc.restore();
    };
    

    /**
     * Converting AWT Colors to JavaFX 
     * JavaFX has no equivalent of java.awt.SystemColor which could be used to implement native styles. 
     * The addition of a helper function to convert AWT colors and a new SystemColor 
     * API for JavaFX would solve these problems. 

     * @param awtColor
     * @return The corresponding JavaFX color.
     */
    private static Color fromAWTColor(java.awt.Color awtColor) {
        int r = awtColor.getRed(); 
        int g = awtColor.getGreen(); 
        int b = awtColor.getBlue(); 
        int a = awtColor.getAlpha(); 
        double opacity = a / 255.0; 
        javafx.scene.paint.Color fxColor = javafx.scene.paint.Color.rgb(r, g, b, opacity); 
        return fxColor;        
    }

}
