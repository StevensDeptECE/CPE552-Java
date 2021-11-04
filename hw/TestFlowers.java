/*
	This is a test of polymorphism
	Implement an abstract base class Flower and classes Rose and Venus Flytrap
	to 
 */
public class TestFlowers {
	public static void main(String[] args) {
		//		Flower f = new Flower(); cannot instantiate abstract class! this should be error
		// 
		Flower f = new Rose();
		f.smell(); // print out: "nice"
		f = new VenusFlytrap();
		f.smell(); // print out: "ouch!"
	}
}
