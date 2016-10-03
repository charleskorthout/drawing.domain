/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing.domain;
import java.awt.Font;


/**
 *
 * @author Charles Korthout
 */
public class PaintedText extends DrawingItem {
    private String content;
    private Font font;
    
    /**
     * Default constructor
     */
    public PaintedText() {
        font = new Font("Arial", Font.BOLD, 12); 
        content = "default content";
    }

    /**
     * Get the content of the string
     * @return the string content
     */
    public String getContent() {
        return content;
    }

    /**
     * Set the string value
     * @param content the string value
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Get the font of the text
     * @return the font of the text
     */
    public Font getFont() {
        return font;
    }

    /**
     * Set the Font of the text
     * @param font The font of the text
     */
    public void setFont(Font font) {
        this.font = font;
    }
    
    /**
     * OVerride the default string output to provide a more meaningful output
     * @return 
     */
    @Override
    public String toString(){
        return String.format("class PaintedText; content %s, font = %s; distance to origin %f ", this.content, this.font.toString(), DrawingItem.distance(this));
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
