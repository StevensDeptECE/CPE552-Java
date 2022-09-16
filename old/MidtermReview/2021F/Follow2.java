public class Follow2 {
	public static void main(String[] args) {
		//		A a1 = new A();
		A a2 = new B(); // base class reference pointing to derived class
		a2.f();
		A a3 = new C();
		a3.f();
		A a4 = new D();
		a4.f();
    // "BCD"
		ArrayList<A> mylist = new ArrayList<>();
		mylist.add(a2);
		mylist.add(a4);
		mylist.add(a4);
		mylist.add(a3);
    for (A element : mylist) {
			element.f(); // polymorphism , output = ______
		}
	}

}

abstract class A {
	public abstract void f();
}

class B extends A {
  public void f() {
		System.out.print("B");
	}
}

class C extends A {
  public void f() {
		System.out.print("C");
	}
}

class D extends B {
  public void f() {
		System.out.print("D");
	}
}
