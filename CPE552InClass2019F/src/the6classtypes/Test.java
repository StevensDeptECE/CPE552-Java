package the6classtypes;

public class Test {
  private JTextField display;
  public void f() {
    A a1 = new A();
  }
  public class A { // inner class A cannot exist without a context of the outer class
    public void g() {
      Test.this.display
    }
  }
  private static class B{ // Test.B

  }

  public static void main(String[] args) {
    Test t1 = new Test();
    t1.f();
    //    Test.A = new Test.A();
    Test.B b1 = new Test.B();
  }
}

