/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session04;
import java.util.*;

/**
 *
 * @author dkruger
 */
public class TestingDataClass {
    public static void buildingArrays() {
        int[] a = { 5, 4, 3 };
        for (int i = 0; i < a.length; ++i)
            System.out.print(x[i]);
        
        final int n = 10;
        int[] b = new int[n];
        for (int i = 0; i < n; ++i)
            b[i] = 0;
        for (int x : b)
            System.out.print(x + " ");
        
        
    }
    
    public static void buildingArrayLists() {
        // build an array list
        // grow it each time around
        // remove some elements
        // print out
    }
    
    public static void buildingHashMaps() {
        HashMap<String,Integer> h = new HashMap<>();
        h.put("AAPL", new Integer(1));
        h.put("IBM", new Integer(2));
        h.put("MSFT", new Integer(3));
        Integer v = h.get("IBM");
        System.out.println(h.get("AAPL"));
        int v2 = h.get("MSFT");
        System.out.println(v2+1);
        
        // iterate through an entire hash map
    }
    public static void loadingProperties() {
        0
    }
    public static void main(String[] args) {
        buildingArrays();
        buildingArrayLists();
        buildingHashMaps();
        loadingProperties();
    }
}
