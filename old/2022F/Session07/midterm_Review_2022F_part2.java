
public class Airplane {
	private float fuel;

	public Airplane(float fuel) {
    this.fuel = fuel;
		System.out.println("Airplane constructor");
	}
	private void crash() {
		System.out.println("crash!");
	}
	public void fly() {
		fuel--;
		if (fuel <= 0) {
			crash();
		}
	}
}

class PassengerPlane extends Airplane {
  private float coffee;
	public PassengerPlane(float fuel, float coffee) {
    super(fuel);		// on midterm! make sure you know this!
		this.coffee = coffee;
		System.out.println("PassengerPlane constructor");
	}

	public void serveCoffee() {
		coffee--;
		if (coffee <= 0) {
			System.out.println("passengers complain!");
		}
	}
}


public class TestAirplanes {
	public static void main(String[] args) {

		Airplane a = new Airplane(); // __________
		Airplane a2; // __________
		Airplane a3 = new Airplane(52); // prints____________
    PassengerPlane p = new PassengerPlane(52, 13); //AirplaneCOnstructor PassengerPlane constructor
		
	}
}
