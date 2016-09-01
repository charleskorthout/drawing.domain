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
    private int weight;
    private int width;
    
    /**
     * Default constructor
     */
    public Oval(){
        
    }
    
    /**
     * Get the weight of the oval
     * @return the weight of the oval
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Set the weight of the oval
     * @param weight the weight of the oval
     */
    public void setWeight(int weight) {
        this.weight = weight;
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
        return String.format("class Oval; weight %d, width = %d ", this.weight, this.width);
    }
}
