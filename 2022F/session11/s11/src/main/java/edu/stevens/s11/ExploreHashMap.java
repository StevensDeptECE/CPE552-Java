package edu.stevens.s11;

import java.util.*;

/**
 *
 * @author DovKr
 */
public class ExploreHashMap {

  public static void main(String[] args) {
    //map   a --> b
    HashMap<String, Double> m = new HashMap<>();
    m.put("IBM", 147.54);
    m.put("BIDU", 95.97);
    m.put("AAPL", 151.29);

    Double price = m.get("AAPL");
    if (price != null) {
      System.out.println(price);
      double x = price.doubleValue();

    }
    for (String key : m.keySet()) {
      System.out.println(key);
    }

    for (Map.Entry<String, Double> entry : m.entrySet()) {
      String key = entry.getKey();
      Double value = entry.getValue();
      System.out.println(key + "==>" + value);
    }

    TreeMap<String, Double> m2 = new TreeMap<>();
    m2.put("IBM", 147.54);
    m2.put("BIDU", 95.97);
    m2.put("AAPL", 151.29);
    for (Map.Entry<String, Double> entry : m2.entrySet()) {
      String key = entry.getKey();
      Double value = entry.getValue();
      System.out.println(key + "==>" + value);
    }

    
  }
}
