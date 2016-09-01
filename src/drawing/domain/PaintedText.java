/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing.domain;
import java.awt.*;

/**
 *
 * @author Charles Korthout
 */
public class PaintedText extends DrawingItem {
    private String content;
    private Font font;
    
    public PaintedText() {
        
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }
    
    @Override
    public String toString(){
        return String.format("class PaintedText; content {0}, font = {1} ", this.content, this.font.toString());
    }
}
