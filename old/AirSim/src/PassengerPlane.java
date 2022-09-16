public class PassengerPlane extends Airplane {
	private int passengers;
	public PassengerPlane(double fuel, double x, double y, int passengers) {
		super(fuel, x, y);
		this.passengers = passengers;
	}

	public void crash() {
		System.out.println("I crashed! dead=" + passengers);
		fuel = -1; // this is how we die!
	}
}
