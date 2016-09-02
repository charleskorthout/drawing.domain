/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing.domain;
import java.util.*;

/**
 *
 * @author Charles Korthout
 */
public class Drawing {
    private String name;
    private int width;
    private int height;
    private List<DrawingItem> drawingItems = null;
    
    /**
     * Default constructor
     */
    public Drawing(){
        drawingItems = new ArrayList();
    }
    /**
     * 
     * @return the width of the drawing
     */
    public int getWidth(){
        return width;
    }
    
    /**
     * 
     * @param width the width of the drawing
     */
    public void setWidth(int width){
        this.width = width;
    }

    /**
     * 
     * @return the height of the drawing
     */
    public int getHeight() {
        return height;
    }

    /**
     * 
     * @param height the height of the drawing
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * 
     * @return the name of the drawing
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name the name of the drawing
     */
    public void setName(String name) {
        this.name = name;
    }
    
    // TODO Implement the collection methods for deletion and iteration
    /**
     * Add an item to the drawing shape collection
     * @param item The item to add to the collection
     */
    public void append(DrawingItem item) {
        if (item != null) drawingItems.add(item);
    }
    
    /**
     * Return a sorted list of DrawingItems
     * @return a sorted list of drawing items
     */
    public List<DrawingItem> getItems() {
            DrawingItemComparator comparator = new DrawingItemComparator();
            List list = this.drawingItems; //TODO must we keep the list sorted under pre/post change conditions???
            Collections.sort(list,comparator);
            return Collections.unmodifiableList(list);
    }
}


