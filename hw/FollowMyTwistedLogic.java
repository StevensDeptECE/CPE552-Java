public class FollowMyTwistedLogic {
	public static void main(String[]) {
		A a1;// DOES NOTHING
		A a2 = null;// DOES NOTHING
		A a3 = new B(2);
		a3.f();
		a3 = new C(4);
		a3.f();
	}
}

abstract class A {
	int x;
	A(int x) { this.x = x; System.out.print("a" + x); }
	public abstract void f();
}

class B extends A {
	public B(int v) {
		super(v);
		System.out.print("B");
	}
  public void f() { System.out.print('b'); }
}

class C extends B {
	public C(int v) {
		super(v);
		System.out.print("C");
	}
  public void f() { super.f(); System.out.print('c'); super.f(); }
}

