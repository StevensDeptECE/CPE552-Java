/**
 * @author dkruger
 */
public class MidtermReview {
   public static void main(String[] args) { 
		 edu.stevens.MidtermReview2 x;
   }
}

interface A {
    public void f();
}

// any class that contains an abstract method is an abstract class
abstract class B implements  A {
   public B() { System.out.println("yi!"); }
}

// classes EXTENDS a parent class
class C  extends B {
	@Override
  public void f() {    }
   
}

class X { // class X does not inherit therefore its parent is... Object
  public void f() { System.out.println("X"); }
}

class Y extends X {
	@Override
  public void F() {System.out.println("Y"); }
}

class Hello {
	public static void main(String[] args) {
		X x1 = new X();
		x1.f();
		
		Y y1 = new Y();
		y1.f();
	}
}
