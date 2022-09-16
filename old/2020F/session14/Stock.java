public class Stock extends Data {
	private String symbol;
	private double price;

	public Stock(String symbol, double p) {
		this.symbol = symbol;
		this.price = p;
	}

	public void setPrice(double p) {
		price = p;
		changed();
	}
	public double getPrice() {
		return price;
	}
	public String toString() {
		return symbol + " price=" + price;
	}
}
