package edu.stevens.dov;

/**
 * @author DovKr
 */
public class OverloadingConstructors {
  public OverloadingConstructors(int a) {
  
  }
  public OverloadingConstructors(double b) {
  }
  void f(int x) {}
  void f(double x) {}
  public static void main(String[] args) {
    new OverloadingConstructors(2);
    new OverloadingConstructors(2.5);
    new OverloadingConstructors(2.2f);
    new OverloadingConstructors(2L);


  }
}

