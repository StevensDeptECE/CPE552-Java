import java.util.*;
//import static Math.*;
public class AirSim {
	private ArrayList<Airplane> airplanes;

	public AirSim() {
		airplanes = new ArrayList<>(); // empty simulation
		FighterPlane f = new FighterPlane(150.0, 30,3, 10); // fuel=150, x=30,y=3, shots=10
		PassengerPlane p = new PassengerPlane(400.0, 10, -4, 237); // fuel=400, x=10, y-=4 passengers = 237
		airplanes.add(f);
		airplanes.add(p);
		p.fly(25,0);
		f.fly(25,0); // fighter plane will shoot the passenger plane, which will crash
		f.shoot(this);
	}
	public void remove(double x, double y) {
		for (int i = 0; i < airplanes.size(); i++) {
			Airplane e  = airplanes.get(i);
			double dx = e.getX() - x, dy = e.getY() - y;
			double dist = Math.sqrt(dx*dx+dy*dy);
			
			if (dist < 2 && dist > 0) {
				e.crash();
				airplanes.remove(i);
			}
		}
	}
	
	public static void main(String[] args) {

		//all planes can crash(). print a message and the plane is gone
		//  planes can crash if they run out of fuel, or if they are shot down
		
		//		Airplane a = new Airplane(100.0, 0.0,0.0); // fuel = 100, x = 0, y = 0
		//a.fly(15, 7); // sqrt(15^2 + 7^2) this is how much fuel you used
    AirSim sim = new AirSim();
	}
}
