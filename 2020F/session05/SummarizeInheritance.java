public class SummarizeInheritance {
  public static void main(String[] args) {
    A a1 = new A();
    A a2 = a1;
    a1.f();
    // variables are references to objects. assigning them does not copy the object

    B b1 = new B(); // A then B
    b1.f();
    b1.g();
  }
    
}

class A {
    private int x,y; // private data within the object
    class Inner {

    }
    public A() {
        System.out.print("Constructor A");
    }
    public void f() {
        System.out.print("f");
    }
    protected int z;
    int w;
}

class B extends A { // B is a kind of A   B IS_A A
    private int z;
    public B() {
        System.out.print("B");
    }
    public void g() {
        System.out.print("g");
    }
}

class Airplane {
    public void fly() {}
}

class PassengerAirplane extends Airplane {
    public void serveCoffee() {}
}

class Box {
//    private double x,y,z, L, W, H;
//    private float x,y,z, L, W, H;
//    private float x1,y1,z1, x2,y2,z2;
}

//class MyWin extends JFrame implements Runnable, Cloneable, Friable {

//}