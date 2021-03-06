/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing.domain;

/**
 *
 * @author Charles Korthout
 */
public class Oval extends DrawingItem {
    private int height;
    private int width;
    
    /**
     * Default constructor
     */
    public Oval(){
        
    }
    
    /**
     * Get the height of the oval
     * @return the height of the oval
     */
    public int getHeight() {
        return height;
    }

    /**
     * Set the height of the oval
     * @param height the height of the oval
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Get the width of the oval
     * @return The width of the oval
     */
    public int getWidth() {
        return width;
    }

    /**
     * Set the width of the oval
     * @param width The width of the oval
     */
    public void setWidth(int width) {
        this.width = width;
    }
    
    /**
     * Override the default string output to provide a more meaningful output
     * @return 
     */
    @Override
    public String toString(){
        return String.format("class Oval; height %d, width = %d, distance to origin %f ", this.height, this.width, DrawingItem.distance(this));
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
