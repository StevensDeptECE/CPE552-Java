import java.util.*;

/**
 *
 * @author dkruger
 */
public class TestHashMap {
    public static void main(String[] args) {
        HashMap<String, Double> quotes = new HashMap<>();
        quotes.put("IBM", 149.84);
        quotes.put("AAPL",313.05);
        
        double price = quotes.get("AAPL");
        price = quotes.get("X");
    }
}
