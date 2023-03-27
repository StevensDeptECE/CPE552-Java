public class DifferentKindsOfClasses {
}

interface A {
  public  void f();
}

interface D extends A {
    public void g();
}
// must be either abstract class or class
abstract class B implements A {
    private int x;
    public B(int x) { }
}

class C extends B {
        public void f() {}
}

interface Airplane {
    public void fly();
}
class Myplane extends Airplane {
    public void fly() {
    }
    public void land() {}
}

class F16 implements Airplane {
    public void fly() {}
     void fireMissile() {}
}

public class Test {
    public static void main(String []args) {
        A a1; // nul// __________________
        A a2 = null; // legal
        A a3 = new A(); // illegal
        A a4 = new B(2); // illegal B is abstract
        Airplane a5 = new Myplane();
        Airplane a6 = new F16();
        //Myplane p = new F16();
        //p.land();

        //F16 q = new Myplane();
        //q.fireMissile();
        //F16 q = new Airplane();
        //q.fireMissile();
    }
}

