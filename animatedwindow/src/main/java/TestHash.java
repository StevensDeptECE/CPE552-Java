/**
 * @author dkruger
 */
import java.util.*;
public class TestHash {
    public static void main(String[] args) {
        int prices[] = new int[100];
        
        HashMap<String,Double> quote = new HashMap<>();
        quote.put("X", 155.21);
        quote.put("IBM", 108.0);
        quote.put("AAPL", 125.51);
        
        Double v = quote.get("AAPL");
        if (v != null) {
            double d = v;
        }
            
        
        v = quote.get("X");
        for (Map.Entry<String,Double> e : quote.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
	}

        
        TreeMap<String,Double> quote2 = new TreeMap<>();
        quote2.put("X", 155.21);
        quote2.put("IBM", 108.0);
        quote2.put("AAPL", 125.51);

        
        for (Map.Entry<String,Double> e : quote2.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
	}
    }
}
