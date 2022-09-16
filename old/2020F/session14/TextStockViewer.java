import java.util.*;

public class TextStockViewer implements Observer {
	private ArrayList<Stock> stocks;

	public TextStockViewer() {
    stocks = new ArrayList<>();
	}

	public void subscribe(Stock s) {
		s.subscribe(this);
		stocks.add(s);
	}

	public void unsubscribe() {
		for (Stock s : stocks)
			s.unsubscribe(this);
	}

	public void update(Data d) {
		Stock s = (Stock)d;
    System.out.println(s.getPrice());
	}
  public static void main(String[] args) {
		Stock s1 = new Stock("AAPL", 123);
		Stock s2 = new Stock("BAIDU", 158);
		Stock s3 = new Stock("IBM", 182);
		TextStockViewer sv = new TextStockViewer();
		sv.subscribe(s1);

		s1.setPrice(124);
		s2.setPrice(160);
		s1.setPrice(122);
		sv.unsubscribe();
	}

}
