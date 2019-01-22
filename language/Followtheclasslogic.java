interface F {
  public void f();
}
	
abstract class A implements F {
  public A() {
    System.out.print("A");
  }
  public void f() { System.out.println("a"); }
	public abstract void g();
}

class B extends A {
	public B(int x) {
		System.out.print("B");
	}
	public B() {
		System.out.print("B2");
	}
	public void f() { System.out.println("b"); }
	public void g() { System.out.println("c"); }
}

public class Followtheclasslogic {
	public static void main(String[] args) {
		F f1 = new B();
		f1.f();
		A a1 = new B();
		a1.g();
		a1.f();
		F f2 = new F() {
				public void f() { System.out.println('f'); }
			};
		f2.f();
		System.out.println(f1==f2);
	}
}
