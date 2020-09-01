package sessionReflectionBeans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author dkruger
 */
public class DataReview {
    public static void main(String[] args) {
        int[] a = {5, 4, 3};
        System.out.println(a.length);
        a = new int[4];
        a[0] = 5;
        a[1] = 4;
        a[2] = 3;
        a[3] = 9;
        
        int y = 5;
        // pointers in normal java are 32 bits 2**32 = 4billion
        // normally this means you can address 4 Gb
        // in Java, because each pointer can only point to an 8 byte chunk
        // address 4 * 8 = 32Gb
        Integer x = new Integer(5);
        
        
        ArrayList<Integer> b = new ArrayList<>(100000);
        b.add(5); // new Integer(5)
        b.add(3); // new Integer(5)
        b.add(2); // new Integer(5)
        
        for (int i = 0; i < b.size(); i++)
            System.out.print(b.get(i));
        
        for (Iterator<Integer> i = b.iterator(); i.hasNext() ; ) {
            Integer t = i.next();
            System.out.print(t);
        }
        
        for (Integer i : b) {
            System.out.print(i);
        }
        
        LinkedList<Integer> c = new LinkedList();
        c.addFirst(5);
        c.addLast(6);
        c.addFirst(3);
        
        for (Iterator<Integer> i = c.iterator(); i.hasNext(); ) {
            Integer t = i.next();
            System.out.print(t);
            if (t.intValue() == 5) {
            
            }
        }
        
        HashMap<String,Integer> myMap = new HashMap<>();
        myMap.put("hello", 1);
        System.out.println(myMap.get("hello"));
        System.out.println(myMap.get("test"));
        
        TreeMap<String, Integer> stocks = new TreeMap<>();
        stocks.put("MSFT", 65);
        stocks.put("AAPL", 103);

        
        for (Iterator i = stocks.entrySet().iterator(); i.hasNext(); ) {
           Map.Entry me = (Map.Entry)i.next();
           System.out.println(me.getKey() + " ==> " + me.getValue());
        }
        
        
        for (Map.Entry<String,Integer> m : stocks.entrySet())  {
            System.out.println(m.getKey() + "==>" + m.getValue());
        }
            
    }
    
    
    
    
    
    
    
    
    
    
    /*
    Build a Hashmap containing the numbers from 1 to 10 each mapped to the word
    "one", "two",...
    then print them all
    
    */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
