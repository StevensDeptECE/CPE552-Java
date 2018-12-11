package session12;

import java.util.ArrayList;

/**
 *
 * @author dkruger
 */
public class Market {
    private ArrayList<Stock> prices;
    public Market() {
        prices = new ArrayList<>();
        prices.add(new Stock("AAPL, 128"));
        prices.add(new Stock("IBM", 100.2));
    }
    
}
