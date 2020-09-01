import java.util.*;

public class MidtermReview7 {
	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<>();
		shapes.add(new Circle(10,20, 5));
		shapes.add(new Line(10,20, 30,50));

		for (Shape s : shapes)
			System.out.println(s.area());

	}
}

abstract class Shape {
	protected int x,y;
	public Shape(int x, int y) { this.x = x; this.y = y; }
	public abstract  double area();
}

class Circle extends Shape {
	private int r;
  public Circle(int x, int y, int r) { super(x,y); this.r = r;}
	public double area() {
    return Math.PI * r*r;
	}
}

class Line extends Shape {
	private int x2,y2;
  public Line(int x, int y, int x2, int y2) {
		super(x,y); this.x2 = x2; this.y2 = y2;
	}
	public double area() {
    return 0;
	}
}
