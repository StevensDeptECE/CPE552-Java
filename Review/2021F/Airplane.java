abstract public class Airplane {
	protected double fuel;
	protected double x, y;

	public Airplane(double fuel, double x, double y) {
		this.fuel = fuel;
		this.x = x;
		this.y = y;
	}
	public void fly(double toX, double toY) {
		double dx = toX - x, dy = toY - y;
		double dist = Math.sqrt(dx*dx + dy*dy);
		fuel -= dist;
		if (fuel < 0)
			crash();
	}

	abstract public void crash();
	public double getX() { return x; }
	public double getY() { return y; }
}
