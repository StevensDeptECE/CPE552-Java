package session07;
public class Overrideexample {
	public static void main(String[] args) {
		A a1 = new A();
		a1.f();

		B b1 = new B();
		b1.f();
		
	}

}

class A {
	public void f() { System.out.println("f"); }
}

class B extends A {
	@Override
	public void g() { System.out.println("B"); }
}
