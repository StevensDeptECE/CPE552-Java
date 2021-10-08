______ A {             // abstract class
	private int x;
	public abstract void f();
}
______ B ______ A {  // abstract class B extends A {
	private int x;
	public B() { x = 99; }
}
______ C { //interface C
	public void f();
	public void g();
}
______ D _____ C { // class D implements C
	public void f() {}
	public void g() {}
}
public class test {
	public static void main(String[]args) {
    A a1;
		A a2 = new A(); // illegal: cannot instantiate abstract class
		B b1 = new B();
		B b2 = new B(2);
		C c1 = new C(); // ILLEGAL: cannot instantiate interface

		// new class here test$1
		C c2 = new C() { // ILLEGAL: cannot instantiate abstract class
				public void f() {}
			};

		D d1 = new D();

		D d2 = new D() { // test$2
				public void g() { System.out.println("something else"); }
			}
	}

}
