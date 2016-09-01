/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing.domain;
import java.awt.*;

/**
 *
 * @author Charles Korthout
 */
public class DrawingItem {
    
    private Color color;
    private Point anchor;
    private DrawingItem previousState = null;

    /**
     * Default constructor
     */
    public DrawingItem(){
        
    }
    
    /**
     * Get the color of the drawing item
     * @return the Color of the drawing item
     */
    public Color getColor() {
        return color;
    }

    /**
     * Set the color of the drawing item
     * @param color the color of the drawing item
     */
    public void setColor(Color color) {
        this.save();
        this.color = color;
    }

    /**
     * Get the anchor point (left top) of the drawing 
     * @return the anchor point of the drawing
     */
    public Point getAnchor() {
        return anchor;
    }

    /**
     * 
     * @param anchor the anchor point of the drawing item
     */
    public void setAnchor(Point anchor) {
        this.save();
        this.anchor = anchor;
    }
    
    /**
     * 
     * returns to the previous state 
     * @return the previous state of the drawing item
     */
    public DrawingItem previousState() { 
        if (this.previousState != null){
            this.anchor = previousState.getAnchor();   
            this.color = previousState.getColor();
            this.previousState = null;            
        }
        return this;
    }
    
    
   /**
    * Save the current state of the drawing item
    */
    private void save(){
        this.previousState = this;
    }    
    
}
