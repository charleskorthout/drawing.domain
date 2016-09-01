/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing.domain;
import java.util.*;
import java.io.*;

/**
 *
 * @author Charles Korthout
 */
public class Image extends DrawingItem {
    private String file;
    private int size;
    
    public Image(){
        
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    @Override
    public String toString(){
        return String.format("class Image; file = {0}, sizew = {1} ", this.file, this.size);
    }
}
