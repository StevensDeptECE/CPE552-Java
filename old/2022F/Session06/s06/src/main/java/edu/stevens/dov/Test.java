package edu.stevens.dov;

class A {
  public A(int x) {
    System.out.println(x + "a");
  }
  public A() {
    System.out.println("test");
  }
  public void f() {
    System.out.println("A.f");
  }
}
class B extends A {
  public B(int a, int b) {
    System.out.println("b" + a + b);
  }
  public B() {
    super(3);
    System.out.println("x");
  }
  public B(String p) {
    this();
    System.out.println("p="+p);
  }
  public B(String a, String b) {
    this(3,4);
    System.out.println("p="+a+b);
  }
}
/**
 * @author DovKr
 */
public class Test {
  public static void main(String[] args) {
    A a1 = new A(3);
    B b1 = new B(4,2);
    B b2 = new B();
    B b3 = new B("yoho");
    C c1; // legal creation of a variable is always legal
    C c2 = null; // setting a variable to null is legal
    //C c3 = new C(); // instantiation: illegal
    //    C c4 = new D(); // D must be concrete and a CHILD OF C!!!
  }
}

abstract class C {}