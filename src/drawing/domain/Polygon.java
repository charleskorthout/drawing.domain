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
public class Polygon extends DrawingItem {
    private java.util.List<Point> vertices;
    private int weight;

    public Polygon(){
        
    }
    
    public java.util.List<Point> getVertices() {
        return vertices;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    @Override
    public String toString(){
        return String.format("class Polygon; weight {0}", this.weight);
    }
}
