public class CarSales {

	private static class CarInfo {
		public int quantity;
		public double price;
		public CarInfo(int quantity, double price) {
			this.quantity = quantity;
			this.price = price;
		}
	}
	private double cash;
	private HashMap<String, CarInfo> stock; // "Jeep" --> 20, 340000
	                                        // "Insight" -->10, 17000

	public CarSales() {
		cash = 1000000;
		stock = new HashMap<>();
	}

	public void buyWholesale(String name, int qty, double price) {
		stock.put(name, new CarInfo(qty, price));
	}

	public void sell(String name, double price) {
		CarInfo c = stock.get(name);
		if (c == null) {
			System.out.println("Sorry, we do not have " + name);
		} else {
			c.qty--;
			cash += price;
		}
	}
	public static void main(String[] args) {
		CarSales sales = new CarSales(); // start with $1M
		sales.buyWholesale("Jeep", 20, 34000);
		sales.buyWholesale("Insight", 10, 17000);
		sales.sell("Jeep", 50000);
		sales.sell("Tesla", 90000);
		System.out.println(sales); // print how much money you have, and inventory
	}
}
