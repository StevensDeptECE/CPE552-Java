package session06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author dkruger
 */
public class CollectionClasses {
    public static void main(String[] args) {
        int[] a = new int[10]; // 4 bytes per element
        a[0]= 5;
        a[1] = 19;
        a[2] = 33;
        a[3] = 4;
        int[] temp = a;
        a = new int[20];
        System.arraycopy(a, 0, temp, 0, temp.length);
        
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            b.add(i); // new Integer(i) // 20 bytes per element
        
        for (int i = 0; i < b.size(); ++i)
            System.out.print(b.get(i) + " ");
        
        for (Integer x : b)
            System.out.println(x + " ");


        LinkedList<String> c = new LinkedList<>();
        c.add("hello");
        c.add("testing");
        c.add("bye");
        
        for (int i = 0; i < c.size(); ++i)
            System.out.print(c.get(i) + " ");
        
        
        for (String x : c)
            System.out.print(x + " ");
        
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("bear", 2);
        map.put("cat", 3);
        
        Integer i = map.get("apple");
        if (i == null) {
          System.out.println("notfound");
        } else {
            System.out.println(i+1);
        }
        
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
        }
        System.out.println();
        
        for (String key : map.keySet()) {
           System.out.print(key + " "); 
        }
        System.out.println();
        
        // for ordered sets of keys, use TreeSet
        //TreeSet a
        
        
        
        



        
    }
}
