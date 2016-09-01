/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing.domain;
import java.awt.*;
import java.util.*;
/**
 *
 * @author Charles Korthout
 */
public class Polygon extends DrawingItem {
    private java.util.List<Point> vertices = null;
    private int weight;

    /**
     * Default constructor
     */
    public Polygon(){
        vertices = new ArrayList();
    }
    
    /**
     * Get the vertices of the polygon
     * @return the list of vertices
     */
    public java.util.List<Point> getVertices() {
        return Collections.unmodifiableList(vertices);
    }

    /**
     * Get the weight of the polygon
     * @return the weight of the polygon
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Set the weight of the polygon
     * @param weight the weight of the polygon
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    /**
     * Override the default string output to provide a more meaningful output
     * @return 
     */
    @Override
    public String toString(){
        return String.format("class Polygon; weight %d", this.weight);
    }
}
