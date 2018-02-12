package session03;

/**
 *
 * @author dkruger
 */
public class Vec3D {
  public static void main(String[] args) {
    Vec3D a = new Vec3D(1,2,3);
    Vec3D b = new Vec3D(1.5,2.5,-3.2);
    System.out.println(a); // 1.0,2.0,3.0
    Vec3D c = a.add(b); // alternate syntax: static function add(a,b)
    System.out.println(c); // 2.5,4.5,-.2
    Vec3D e = a.sub(b); 
    System.out.println(e);
    // dot(a,b) = a.x*b.x + a.y*b.y+a.z*b.z
    double d = c.dot(a);
    System.out.println("dot=" + d);
    Vec3D f = a.neg(); // -1,-2,-3      
    System.out.println(f);
  }    
}
