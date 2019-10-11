public class InterfaceExamples {
	public static void main(String[] args) {
		Airplane a[] = new Airplane[2];
		a[0] = new ElectricPlane(100); // 100 KW-h   "ElectricPlane battery=xx
		a[1] = new JetPlane(10000); // kg fuel       "JetPlane fuel= 9995 kg

		// fly for ElectricPlane subtracts 1 from battery charge
		// fly for JetPlane subtracts 10kg fuel
		for (int i = 0; i < 4; i++) {
  		for (Airplane p : a) {
				p.fly();
				System.out.println(p);
			}
		}
			
	}

}

interface Airplane {
	public void fly();
	public void takeoff();
	public void land();
}

class ElectricPlane implements Airplane {
	private double charge;
	ElectricPlane(double charge) {
		this.charge = charge;
	}
  public void fly() {
		charge--;
	}

	@Override
	public void takeoff() {
	}

	@Override
	public void land() {

	}
	public String toString() {
		return "ElectricPlane battery=" + charge;
	}
}
