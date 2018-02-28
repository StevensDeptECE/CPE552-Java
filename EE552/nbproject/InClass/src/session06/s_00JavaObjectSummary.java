package session06;

/**
 *
 * @author dkruger
 */
public class s_00JavaObjectSummary {
    public static void main(String[] args) {
      A a1 = new A();
      a1.f();
    }
  
}

// concrete class
class A {
  private int x;
  private void g() {}
  A() {
  }
  public void f() {   g();  g();  g();}
}

// class that cannot be instantiated (cannot say new B())
abstract class B {
  private int x;
  public B() {} // may have a constructor
}

class C extends B { // class C IS_A B (is a kind of B)
  private int y;   
}









