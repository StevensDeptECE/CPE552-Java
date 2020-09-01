public class ClassTypeSummary {
  public static void main(String[] args) {
		A a1 = // ILLEGAL: new A();
		a1.f();

}

interface A {
  public void f(); // this is abstract EVEN THOUGH IT DOESN'T SAY SO!!!
}

abstract class B {
	private int x;
	public B() { x = 0; }
	public abstract void f();
	public void g() { System.out.println("g"); }
}

class C { // can be instantiated (can create an object using new C()

}

class D<T> {

}
