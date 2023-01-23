package edu.stevens.session08;

/**
 * @author DovKr
 */
public class Test {
  // 
  public static double dot(double x, double y[]  ){
    double[] ans = new double[x.length];
    for (int i = 0; i < x.length; i++)
      ans[i] = x[i] + y[i];
    return ans;
  }
  public static void main(String[] args) {
    final double a[] = {1,3,3.5, 5};
    final double[] b = {1,-2,0, 1};
    double d = dot(a,b);
    Vec3d v1 = new Vec3d(1,2,3);
  double m = v1.square();    
  double mag = v1.abs();
  }
}

class Vec3d {
  private double x,y,z;
  public Vec3d(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }
  double square() {
    return x*x + y*y + z*z;
  }
  
  double abs() {
    return Math.sqrt(x*x + y*y + z*z)
  }
  Vec3d add(Vec3d r) {
    return = new Vec3d(x + r.x, y + r.y, z + r.z);
  }
}

//public
abstract class Vehicle {
  public abstract double payToll();
}

class Truck extends Vehicle {
  private double weight;
  private int axles; 
  private int speed;
  public Truck(double w, int a, int s) {
    weight = w;
    axles = a;
    speed = s;
  }
  @Override 
  public double payToll() {  
    return 20 * axles;
  }
}

class TestPolymorphism {
  public static void main(String) 
}