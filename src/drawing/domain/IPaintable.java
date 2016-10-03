/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing.domain;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author charl
 */
public interface IPaintable {
    /**
     * set the color for a paint
     * @param color the color
     */
    void setColor(Color color);
    
    /**
     * draw an oval
     * @param oval the oval to draw
     */
    void paintOval(Oval oval);
    
    /**
     * draw a line
     * @param from the start point
     * @param to the end point
     * @param weight the thickness of the line
     */
    void paintLine(Point from, Point to, int weight );
    
    /**
     * draw a text
     * @param text the text to draw
     */
    void paintText(PaintedText text);
    
    /**
     * draw an image 
     * @param image the image to show
     */
    void paintImage(Image image);
    
    /**
     * Clear the drawing
     */
    void clear();
    
}
