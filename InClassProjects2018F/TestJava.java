public class TestJava {


}

interface I {
	public void f();
}

abstract class A implements I {
  public void g() {
	}
}

class B extends A {
	public void f() {}
}

class C extends B {

}
