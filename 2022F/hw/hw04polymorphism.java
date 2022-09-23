/*
  Trucks have a weight, a speed, and # of axles
  Cars have a speed, and a color
  ex class Car {
      private String color;
      }
  Bus has a number of passengers and a speed

  all objects must pay a toll
  trucks pay $20/axle
 */


public class hw04polymorphism {
    public static void main(String[] args) {
	
	Truck t = new Truck(55, 4000.0, 5);
	Car c = new Car(85, "red");
	Bus b = new Bus(45, 28);

	double p = t.payToll(); // pays 5* 20 = $100
	p = c.payToll();        // pay 18
	p = b.payToll();        // bus pays $4

	// create an array of cars, busses, trucks

	//print out the toll as they go into the tunnel
    }
}
