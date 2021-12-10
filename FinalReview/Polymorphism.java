import java.util.*;
	
public class Polymorphism {
	public static void main(String[] args) {
		// every vehicle has a speed
		// Create a list of cars, trucks and Busses. Each must pay a toll
		// cars pay $15, Busses pay $4, Trucks pay $20 per axle
		Car c = new Car(55);
		Bus b = new Bus(40, 28); // bus goes 40mph and has 28 passengers
		Truck t = new Truck(90, 3, 10000.0); // speed and weight
		// put all these into a single list and make everyone payToll() polymorphically
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(c);
		vehicles.add(b);
		vehicles.add(t);
		vehicles.add(new Truck(22, 4, 25000));

		for (Vehicle v : vehicles) {
			v.payToll();
		}

	}
}

abstract class Vehicle {
	private int speed;

	public Vehicle(int s) { speed = s; }
	public abstract void payToll();

}

class Truck extends Vehicle {
	private double weight;
	private int axles;
	public Truck(int s, int axles, double w) {
		super(s);
		this.axles = axles;
		weight = w;
	}
	public void payToll() {
		System.out.println(axles * 20);
	}
}

class Car extends Vehicle {
	public Car(int s) {
		super(s);
	}
	public void payToll() {
		System.out.println(15);
	}	
}

class Bus extends Vehicle {
	private int numPassengers;
	public Bus(int s, int numPassengers) {
		super(s);
		this.numPassengers = numPassengers;
	}
	public void payToll() {
		System.out.println(4);
	}	
}
