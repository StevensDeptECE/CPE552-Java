/**
 *
 * @author dkruger
 */
public class Quote {
    private String symbol;

    public static void main(String[] args) {
        Quote q1 = new Quote("IBM", 153.41);
        Quote q2 = new Quote("AAPL", 320.03);
        System.out.println(q1); // IBM price=153.41
        System.out.println(q2); // AAPL price=320.03
    }
}
