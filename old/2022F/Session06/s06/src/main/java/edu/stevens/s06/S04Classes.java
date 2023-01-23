package edu.stevens.s06;

// S04Classes is a concrete class
public class S04Classes {
    // default constructor
    //public S04Classes() {}
    public static void main(String[] args) {
        S04Classes a = new S04Classes(); // calls default constructor
        //Shape s = new Shape();
        Shape s = null;
        s = new Circle();
        s.getArea();
        A a1 = new A();// a_________
        B b1 = new B();// a b__________
    }
}

abstract class Shape {
    public abstract double getArea();
}
class Circle extends Shape {
  public double getArea() { return 0; }
}

class A {
  public A() { 
    System.out.println("a");
  }
}
class B extends A {
  public B() {
    System.out.println("b");
  }
}

