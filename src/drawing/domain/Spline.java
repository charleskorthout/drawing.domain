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
    private java.util.List<Point> points;
    
    public Spline(){
        
    }

    public java.util.List<Point> getPoints() {
        return points;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }
    
    @Override
    public String toString(){
        return String.format("class Spline; weight {0}, degree = {1} ", this.weight, this.degree);
    }
    
}
