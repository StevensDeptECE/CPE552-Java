interface A {
	public void a();
}
interface B extends A {
	public void b();
}
	
abstract class C implements B {
	private int x;
	public C() { x = 0; }
	
}

class X {
}

class Y extends X {}

class D implements B { // since D does not inherit from a class parent=Object
	private int y;
	public D(int y) { super(); this.y = y; } // super calls Object()
	public void a() {
		System.out.println("Da");
	}
	public void b() {
		System.out.println("Db");
	}
}

main() {
	D d1 = new D(3);
}

class MyCalc extends JFrame {
}

abstract class Shape {
	private int x,y;
  public abstract void draw();
}

class Rect extends Shape {
  public void draw() {

	}
}

class Circle extends Shape {
  public void draw() {

	}

}

class Line extends Shape {
	private int x,y;
  public void draw() {

	}

}

ArrayList<Shape > shapes;


