//every program automatically imports: import java.lang.*;

public class Classes { // All classes inherit from : extends java.lang.Object 
	public static void classInstantiation() {
		Classes c1; // all variables in Java are initialized to binary 0
		// int --> 0 long --> 0 boolean --> false double -->0.0  object --> null
		Classes c2 = null;
		Classes c3 = new Classes(); // calls default constructor
		//		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3); // println(Object obj) calls obj.toString()
	}
	public static void callingMethods() {
		A a1 = new A(3);  //kA
		a1.f();
		B b1 = new B(2, 3); // kmAB
		b1.f();
		A a2 = new B(3, 4);
		a2.f();             //kmAB
		C c1 = new C();
	}
  public static void main(String[] args) {
		classInstantiation();
		callingMethods();
	}
}

class A {
	private int x;
	public A(int x) {
		System.out.print("k");
		this.x = x;
	}
	public void f() {
		System.out.println("A");
	}
}

class B extends A { // B IS_A A  (B is a kind of A)
	private int y;
	public B(int x, int y) {
		super(x); // call parent constructor
		System.out.print("m");
		this.y = y;
	}
	public B(int x, int y, int z) {
		this(x,y);
    System.out.println(z);
	}
	public void f() {
		super.f();
		System.out.println("B");
	}
}

class C extends A {
  public C() {
		super(2); // must give parent a number to match constructor
	}
}
