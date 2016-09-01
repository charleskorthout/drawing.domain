/*
 * 
 */

package drawing.domain;
import java.util.*;
import java.io.*; // for Serializable

/**
 *
 * @author Charles Korthout
 */
public class DrawingItemComparator implements Serializable, Comparator <DrawingItem>   {

    static final long serialVersionUID = 1L; //assign a long value

     // TODO if DrawingItem is null an exception is thrown.. handle it
    /**
     * 
     * @param di1 The first drawing item
     * @param di2 The second drawing item
     * @return 
     */
    @Override 
    public int compare(DrawingItem di1, DrawingItem di2) {
        Double dist1 = Math.sqrt(Math.pow(di1.getAnchor().getX(),2) + Math.pow(di1.getAnchor().getY(),2));
        Double dist2 = Math.sqrt(Math.pow(di2.getAnchor().getX(),2) + Math.pow(di2.getAnchor().getY(),2));
        return dist1.compareTo(dist2);
    } 
}
