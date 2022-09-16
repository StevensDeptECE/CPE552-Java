public class FighterPlane extends Airplane {
	private int shots;
	public FighterPlane(double fuel, double x, double y, int shots) {
		super(fuel, x, y);
		this.shots = shots;
	}

	public void shoot(AirSim simulation) {
		if (shots > 0) {
			shots--;
			simulation.remove(x,y);
		}
	}

	public void crash() {
		System.out.println("I crashed! ");
		fuel = -1; // this is how we die!
	}
}
