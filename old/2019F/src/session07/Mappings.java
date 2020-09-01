package session07;
import java.util.*;

public class Mappings {
	public static void main(String[] args) {
		HashMap<String, double[]> quotes = new HashMap<>();
		quotes.put("AAPL", new double[] {236.21, 232.95, 237.64});
		quotes.put("BIDU", new double[] {104.66, 105.97, 107.30});

		System.out.println(quotes.get("AAPL")[0]);
	}
}
