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
    private int size;
    
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
     * get the file size of the image 
     * @return 
     */
    public int getSize() {
        return size;
    }

    /**
     * Set the size of an image
     * @param size The size of the image 
     */
     //TODO Does this make sense?? What is the purpoise of setting a file size here....
    public void setSize(int size) {
        this.size = size;
    }
    
    /**
     * Override the default and provide more meaningful output
     * @return 
     */
    @Override
    public String toString(){
        return String.format("class Image; file = %s, sizew = %d ", this.file, this.size);
    }
}
