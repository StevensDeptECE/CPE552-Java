class X {
	 private int a;
	 public X() { a = 0; }
}

interface Y {
	 void f();
	 void g();
}

abstract class Z implements Y {
	void f() { System.out.println("Yes"); }
	void h() { System.out.println("No"); }
}


public class S01QuizPart2 {
	public static void main(String[] args) {
		X x1 = null; //legal
		X x2 = new X(); //legal
		Y y1; // legal
		Y y2 = new Y(); // ILLEGAL ?cannot instantiate an interface
		Z z1; // legal
		Z z2 = new Z(); // cannot instantiate abstract class
	}
}
