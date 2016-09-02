/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing.domain;
import java.util.*;
import java.awt.*;
/**
 *
 * @author Charles Korthout
 */
public class Spline extends DrawingItem{
    private int weight;
    private int degree;
    private java.util.List<Point> points = null;
    
    /**
     * Default constructor
     */
    public Spline(){
        points = new ArrayList();
    }

    /**
     * Get the list of points from the spline
     * @return the list of points from the spline
     */
    public java.util.List<Point> getPoints() {
        return Collections.unmodifiableList(points);
    }

    /**
     * Get the weight of the spline
     * @return the weight of the spline
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Set the weight of the spline
     * @param weight the weight of the spline
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Get the degree of the spline
     * @return the degree of the spline
    */
    public int getDegree() {
        return degree;
    }

    /**
     * Set the degree of the spline
     * @param degree the degree of the spline
     */
    public void setDegree(int degree) {
        this.degree = degree;
    }
    
    /**
     * Override the default string output to provide a more meaningful output
     * @return 
     */
    @Override
    public String toString(){
        return String.format("class Spline; weight %d, degree = %d, distance to origin %f ", this.weight, this.degree, DrawingItem.distance(this));
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
