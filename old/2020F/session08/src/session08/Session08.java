package session08;
import java.util.*;

/**
 *
 * @author dkruger
 */
public class Session08 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    ArrayList<String> a = new ArrayList<>();
    a.add("test");
    HashMap<String,Double> quotes = new HashMap<>();
    quotes.put("AAPL", 158.5);
    quotes.put("IBM", 152.5);
    
    System.out.println(a.get(0));
    System.out.println(quotes.get("AAPL"));
    quotes.put("AAPL", 161.25);
    System.out.println(quotes.get("AAPL"));
    
    for (Map.Entry<String, Double> entry : quotes.entrySet()) {
      System.out.println(entry.getKey() + "/" + entry.getValue());
    }
    //https://stackoverflow.com/questions/46898/how-do-i-efficiently-iterate-over-each-entry-in-a-java-map

      Iterator<Map.Entry<String, Double>> it = quotes.entrySet().iterator();
    while (it.hasNext()) {
      Map.Entry<String, Double> pair = it.next();
      System.err.println(pair.getKey() + "==>" + pair.getValue());
    }

    //quotes.forEach(k, v) -> System.out.println(k + "==>" + v);

    for (String key : quotes.keySet()) {
        System.out.println(key + "==>" + quotes.get(key));

        /*
long i = 0;
Iterator<Integer> itr2 = map.keySet().iterator();
while (itr2.hasNext()) {
    Integer key = itr2.next();
    i += key + map.get(key);
}
Using for and Map.Entry

long i = 0;
for (Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator(); entries.hasNext(); ) {
    Map.Entry<Integer, Integer> entry = entries.next();
    i += entry.getKey() + entry.getValue();
}

Using the Java 8 Stream API

final long[] i = {0};
map.entrySet().stream().forEach(e -> i[0] += e.getKey() + e.getValue());
Using the Java 8 Stream API parallel

final long[] i = {0};
map.entrySet().stream().parallel().forEach(e -> i[0] += e.getKey() + e.getValue());
*/    
    
    
  }
  
}
