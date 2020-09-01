package session06;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author dkruger
 */
public class CollectionClasses {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = i+3;
        int[] old = a;
        a = new int[11];
        for (int i = 0; i < old.length; i++)
            a[i] = old[i];
        a[10] = 99;
        
        ArrayList<Integer> list = new ArrayList<>(1000000);
        list.add(1);
        for (int i = 0; i < 1000000; i++)
            list.add(i);
        list.remove(0); // slow!
        Integer x = 2;
        
        for (int i = 0; i < list.size(); i++ )
            list.set(i, list.get(i)*2);
//            list.set(i, new Integer(list.get(i).intValue()*2));

        ArrayList<String> b = new ArrayList<>();
        b.add("Hello");
        b.add("test");
        
        for (int i = 0; i < b.size(); i++)
            System.out.println(b.get(i));
   
        //ITERATORS ARE THE BEST way to traverse a list
        for (Iterator<String> i = b.iterator(); i.hasNext(); ) { 
           String s = i.next();
           System.out.println(s);
        }
        
        LinkedList<String> b2 = new LinkedList<>();
        
        //o(N^2)
        for (int i = 0; i < b2.size(); i++)
            System.out.println(b2.get(i)); // SLOW for linkedlist
        
        for (Iterator<String> i = b2.iterator(); i.hasNext(); ) { 
           String s = i.next();
           System.out.println(s);
        }
        
        for (String s : b2) {
            System.out.println(s);
        }
    }
}
