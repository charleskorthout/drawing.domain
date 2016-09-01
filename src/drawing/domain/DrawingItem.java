/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing.domain;
import java.util.*;
import java.awt.*;
import java.math.*;

/**
 *
 * @author Charles Korthout
 */
public class DrawingItem {
    
    private Color color;
    private Point anchor;
    private DrawingItem previousState = null;

    public DrawingItem(){
        
    }
            
    public Color getColor() {
        return color;
    }

    
    public void setColor(Color color) {
        this.save();
        this.color = color;
    }

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
