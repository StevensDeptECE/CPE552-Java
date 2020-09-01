public class Shapes {
	public  static void main(String[] args) {
		Circle c = new Circle(100,200, 50);
		System.out.println(c.area());
		Rect r = new Rect(200,300, 25, 3);
		System.out.println(r.area());
	}
}

abstract class Shape {
  private double x,y;
	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() { return x; }
	public double getY() { return y; }
	public abstract double area();
}

class Circle extends Shape {
	private double radius;
	public Circle(double x, double y, double r) {
		super(x,y);
		radius = r;
	}
	public double area() {
		return Math.PI * radius * radius;
	}
}

class Ellipse extends Circle {
	private double radius2;
	public Ellipse(double x, double y, double radius, double radius2) {
		super(x, y, radius);
		this.radius2 = radius2;
	}
}

class Rect extends Shape {
	private double L, W;
	public Rect(double x, double y, double L, double W) {
		super(x,y);
		this.L = L;
		this.W = W;
	}
  public double area() {
		return L*W;
	}
}
class Line {
	private double x1, y1, x2, y2;
	public Line(double x1, double y1, double x2, double y2) {
		this.x1 = x1; this.y1 = y1;
		this.x2 = x2; this.y2 = y2;
	}
}
