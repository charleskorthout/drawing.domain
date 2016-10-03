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
     * Add a point to the vertices
     * @param p the point to add
     */
    public void addPoint(Point p) {
        vertices.add(p);
    }
    
    /**
     * Override the default string output to provide a more meaningful output
     * @return 
     */
    @Override
    public String toString(){
        return String.format("class Polygon; weight %d, distance to origin %f", this.weight, DrawingItem.distance(this));
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
