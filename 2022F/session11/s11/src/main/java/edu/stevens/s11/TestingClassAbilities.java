package edu.stevens.s11;

/**
 *
 * @author DovKr
 */
class A {  // inherits from??? Object
  public double x,y,z;
  public A(double x, double y, double z) { this.x = x; this.y = y; this.z = z; }
}

class B implements Cloneable { 
  public double x,y,z;
  public B(double x, double y, double z) { this.x = x; this.y = y; this.z = z; }
  public B clone() { return new B(x,y,z); }
}

public class TestingClassAbilities {
  public static void main(String[] args) {
    A a1 = new A(1,3,5); // a1.x = 1 a1.y = 3 a1.z = 5
    A a2 = a1; // is a2 a copy of a1?
    a1.x = 99;
    System.out.println(a2.x);
    
    B b1 = new B(1,2,3);
    B b2 = (B)b1.clone();
    System.out.println(b2.x);
    
  }
}
