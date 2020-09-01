public class MidtermReview3 {
	public static void main(String[]args) {
		A a1 = new A();
		B b1  = new B(); // instantiation is not legal for an abstract class
		C c1 = new C();
		D d1 = new D();
		d1.f();
	}
}

class A {}
abstract class B{}
interface C {
  public void f();
}

class D implements C {
	public void f() {

	}
}

class E extends B{

}
interface F extends C {
	public void g();
}
