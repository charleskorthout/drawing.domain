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
    public int weight;
    public int width;

    public Oval(){
        
    }
    
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    @Override
    public String toString(){
        return String.format("class Oval; weight {0}, width = {1} ", this.weight, this.width);
    }
}
