public class AbstractClassExample {
	public static void main(String[] args) {
		Plane p = new Plane(1000);
		PassengerPlane pp = new PassengerPlane(1000);
		pp.fly();
		pp.serveCoffee();
		
		FighterPlane fp = new FighterPlane(1000);
		fp.fly();
		//ILLEGAL		fp.serveCoffee();


	}
}

abstract class Plane {
	private double fuel;
	public Plane(double fuel)  { this.fuel = fuel; }

	public void fly() { fuel--;}
}

class FighterPlane extends Plane {
	public FighterPlane(double fuel)  { super(fuel); }
	public void shoot() { System.out.println("Shoot"); }
}

class PassengerPlane extends Plane {
	public PassengerPlane(double fuel)  { super(fuel); }

	public void serveCoffee() {System.out.println("ServeCoffee"); }
}
