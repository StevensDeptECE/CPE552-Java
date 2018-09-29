package session05;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author dkruger
 */
public class UsingCollections {
    public static void main(String [] args) {
        // for fixed sizes
       int[] a = new int[1000000]; 
       for (int i = 0; i < a.length; i++)
          a[i] = 5*i;
       ArrayList<Integer> b = new ArrayList<>();
       for (int i = 0; i < 1000; i++)
           b.add(i);
       ArrayList<String> c = new ArrayList<>();
       c.add("cat");
       c.add("dog");
       c.add("elephant");
       
       for (int i = 0; i < c.size(); i++)
           System.out.println(c.get(i));
       
       for (String x : c)
           System.out.println(x);
       
       HashMap<String, String> commandMap = new HashMap<>();
       commandMap.put("[F7]", "compile");
       commandMap.put("C-s", "save");
       
    }
}
