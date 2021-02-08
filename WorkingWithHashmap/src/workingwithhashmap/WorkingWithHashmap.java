/*
Note: Adding a new item with an existing key over writes the previous item
 */
package workingwithhashmap;

/**
 *
 * @author SHEKHAR
 */
import java.util.HashMap;

public class WorkingWithHashmap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Keys are used to search fro the value
        // HashMap<Key, Value>
        HashMap<String, Integer> points = new HashMap<String, Integer>();
        points.put("Steve",23);
        points.put("Tony",69);
        points.put("Bruce",101);
        
        System.out.println(points.get("Tony"));
        System.out.println(points.containsValue(23));
        System.out.println(points.containsValue(2));
        System.out.println(points.containsKey("Steve"));
        System.out.println(points.containsKey("Tony"));
    }
    
}
