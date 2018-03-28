
package session08;

class A {
  private int x;
  public A() { x = 2; }
  public A(int x) { this.x = x; }
  public int getX() { return x; }
}

class B extends A {
  private int y;
  public B() {
    super();    
  }
}

// if you specify a constructor, new must match
class C {
  private int x;
  public C(int x) { this.x = x; }
}

class D {
  private int x;
}

/**
 * @author dkruger
 */
public class Session08 {
    public static void main(String[] args) {
        A a1; // null
        a1 = new A(); // x = 2
        A a2 = new A(19); // x = 19
        C c1 = new C(6);
        D d1 = new D();
    }
    
}
