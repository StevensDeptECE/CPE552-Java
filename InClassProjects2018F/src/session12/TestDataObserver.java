package session12;

/**
 *
 * @author dkruger
 */
public class TestDataObserver {
    public static void main(String[] args) {
        Stock s = new Stock("AAPL", 102);
        TextObserver to = new TextObserver();
        to.subscribe(s);
        for (int i = 0; i < 10; i++)
            s.random();
    }
}
