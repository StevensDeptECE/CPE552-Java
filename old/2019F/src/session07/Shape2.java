public class Shape2 {
	public static void main(String[] args) {
		Circle c1 = new Circle(10);
		System.out.println(c1.area());
		System.out.println(c1.perimeter());
		Rect r1 = new Rect(8, 5);
		System.out.println(r1.area());
		System.out.println(r1.perimeter());

		Shape a[] = new Shape [4];
		a[0] = c1;
		a[1] = r1;
		a[2] = new Circle(22.5f);
		a[3] = new Circle(11.2f);
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i].area());
	}
}
/*
abstract class Shape {
	public abstract float area();
	public abstract double perimeter();
}
*/

interface Shape {
	public float area();
	public double perimeter();
}

class Circle implements Shape {
	private float r;
	public Circle(float radius) { r = radius; }
	public float area() { return (float)(Math.PI * r * r); }
	public double perimeter() { return 2*Math.PI * r; }
}

class Rect implements Shape {
	private float L,W;
	public Rect(float L, float W) {
		this.L = L; this.W = W;
	}
	public float area() { return L*W; }
	public double perimeter() { return 2*(L+W); }
}


