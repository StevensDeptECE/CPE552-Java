/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session04;
import java.io.*;
import java.util.*;

/**
 *
 * @author dkruger
 */
public class TestingData { //session04.TestingData
    public static void buildingArrays() {
        int[] a = { 5, 4, 3, 2 };
        for (int i = 0; i < a.length; ++i)
            System.out.print(a[i] + " ");
        System.out.println();
        final int n = 10;
        int[] b = new int[n];
        for (int i = 0; i < n; ++i)
            b[i] = i+3;

        for (int x : b)
            System.out.print(x + " ");
        System.out.println();
    }
    
    public static void buildingArrayLists() {
      ArrayList<Integer> a = new ArrayList<>(); // as of 1.7
      a.add(new Integer(5));
      a.add(16); // automatically creates new Intger(16) "autoboxing"
      a.remove(0);
      a.add(0, 93);
      int sum = 0;
      for (Integer x : a) {
        sum += x;
        System.out.print(x + " ");
      }
      int sum2 = 0;
      for (int x : a) {
        sum2 += x;
      }
      System.out.println("Sum=" + sum2);
        // build an array list
        // grow it each time around
        // remove some elements
        // print out
        // faster with preallocate
        
      ArrayList<String> b = new ArrayList<>(1000000);
      for (String s : b) {
        System.out.print(s);
      }
      for (int i = 0; i < 1000000; i++)
        b.add(""+i);
    }
    
    public static void buildingHashMaps() {
        HashMap<String,Integer> h = new HashMap<>(16000);
        h.put("AAPL", new Integer(1));
        h.put("IBM", new Integer(2));
        h.put("MSFT", new Integer(3));
        h.put("3", 99);
        Integer v = h.get("xxx");
        if (v == null) {
          System.out.println("Object not there!");
        }
        System.out.println(h.get("AAPL"));
        int v2 = h.get("MSFT");
        System.out.println(v2+1);
        // iterate through an entire hash map
    }
    public static void displayHashMap() throws Exception {
      FileReader fr = new FileReader("data/dict.dat");
      BufferedReader br = new BufferedReader(fr);
      String line;
      
      HashMap<String,String> englishToChinese = new HashMap<>();
      HashMap<String,String> chineseToEnglish = new HashMap<>();
      while ((line = br.readLine()) != null) {
        String[] words = line.split("\\s+");
        if (words.length >= 2) {
          System.out.println(words[0] + "-->" + words[1]);
          englishToChinese.put(words[0], words[1]);
          chineseToEnglish.put(words[1], words[0]);
        } else {
          englishToChinese.put(words[0], null);
        }
      }
      br.close();
      
      for (String english : englishToChinese.keySet()) {
        System.out.println(english + "==>" + englishToChinese.get(english));        
      }
      
      Set<Map.Entry<String, String>> entrySet = englishToChinese.entrySet();
      for (Map.Entry e : entrySet) {
        System.out.println(e.getKey() + "==>" + e.getValue());
      }
    }
    public static void loadingProperties() {
//        Properties p = new Properties();
//        p.load("test.properties");
    }
    public static void main(String[] args) throws Exception {
        buildingArrays();
        buildingArrayLists();
        buildingHashMaps();
        displayHashMap();
        loadingProperties();
    }
}
