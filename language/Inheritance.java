public class Inheritance { // automatically inherits from java.lang.Object

	public static void main(String[]args) {
		A a1 = new A();
		a1.f();
		B b1 = new B();
		b1.f();
	}
}

class A { // extends Object
	private int x;
	public int y;
	public void f() {
		System.out.println("f");
	}
	public A() {
		x = 0;
		y = 1;
	}
}

class B extends A {
	public B() {
		super();
	}
	@Override
	public void F() {
    super.f();
		System.out.println("b");
	}
}
