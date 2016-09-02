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
public class DrawingItem implements Comparable<DrawingItem>{

    private Color color;
    private Point anchor;
    private DrawingItem previousState = null;

    /**
     * Default constructor
     */
    public DrawingItem(){
        anchor = new Point(0,0);
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

    /**
     * static method to retrieve the distance to the origin
     * @param di The DrawingItem
     * @return The distance to the origin
     */
    protected static double distance(DrawingItem di) {
        return Math.sqrt(Math.pow(di.getAnchor().getX(),2) + Math.pow(di.getAnchor().getY(),2));
    }
    
    /**
     * Implementation of the compareto method
     * @param di a DrawingItem to compare with
     * @return the logical value of the compare
     */
    @Override
    public int compareTo(DrawingItem di) {
        Double dist1 = distance(this); 
        Double dist2 = distance(di); 
        return dist1.compareTo(dist2);        
    }
    
    /**
     * 
     * @param o the object to compare to
     * @return the logical value after compare
     */
    @Override
    public boolean equals(Object o) {
        if (o==null) return false;
        else if (o instanceof DrawingItem) return this.compareTo((DrawingItem)o) == 0;
        return false;
    }
    
    /**
     * 
     * @return the hashcode of the object
     */
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + this.getAnchor().hashCode();
        return result;
    }
}
