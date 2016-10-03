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
public class Image extends DrawingItem {
    private String file;
    private int width;
    private int height;

    
    /**
     * Default constructor
     */
    public Image(){
        
    }

    /**
     * Get the filename of the drawing image
     * @return the filename of the image
     */
    public String getFile() {
        return file;
    }

    /**
     * Set the file name of the image
     * @param file the name of the image
     */
    public void setFile(String file) {
        this.file = file;
    }

    /**
     * get the file width of the image 
     * @return 
     */
    public int getWidth() {
        return width;
    }

    /**
     * Set the width of an image
     * @param width The width of the image 
     */
     //TODO Does this make sense?? What is the purpoise of setting a file width here....
    public void setWidth(int width) {
        this.width = width;
    }
    
    /**
     * get the height of the image
     * @return the height of the image
     */
    public int getHeight() {
        return height;
    }

    /**
     * Set the height of the image
     * @param height the height of the image
     */
    public void setHeight(int height) {
        this.height = height;
    }
    
    /**
     * Override the default and provide more meaningful output
     * @return 
     */
    @Override
    public String toString(){
        return String.format("class Image; file = %s, sizew = %d, distance to source %f ", this.file, this.width, DrawingItem.distance(this));
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
     * @return 
     */
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + this.getAnchor().hashCode();
        return result;
    }
}

