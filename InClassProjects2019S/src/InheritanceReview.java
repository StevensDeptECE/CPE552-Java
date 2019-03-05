/**
 *
 * @author dkruger
 */
public class InheritanceReview {
    public static void main(String[] args) {
        // java.lang is automatically imported
       java.lang.Object obj = new Object();
       System.out.println(obj);
       
    }
}

class A { // extends Object
  private int x;
  public A() { x = 0; }
  public int getX(){ return x; }
}

class B extends A {
  private int y;
  public B(int y) {
      super(); // call the parent constructor
      this.y = y;
  }
  public int getY() { return y; }
}
