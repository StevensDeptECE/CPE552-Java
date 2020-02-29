import static java.lang.Math.*;
/**
 *
 * @author dkruger
 */
public class Quiz2Review {
    public static long sum(int n) {
       if (n <= 1) 
           return n;
       return n + sum(n-1);
    }
    public static void main(String [] args) {
        System.out.println(sum(3));
        System.out.println(sum(-3));
        System.out.println(sum(10));
        System.out.println(sum(1000));
        System.out.println(sum(10000));
        //System.out.println(sum(100000));
        
        Vector3d v1 = new Vector3d(2,3,4);
        Vector3d v2 = new Vector3d(1,1,1);
        Vector3d v3 = v1.add(v2);
        Vector3d v4 = Vector3d.add(v1,v2);
        System.out.println(v3);       
        
        double x = 0;
        double y = sin(x); // import static!
        y = Math.sqrt(x);
    }
}

class Vector3d {
    private int x,y,z;
    public Vector3d(int x, int y, int z) {
       this.x = x; this.y = y; this.z = z;
    }
    public String toString() {
       return '(' + x + "," + y + "," + z + ")";
    }
    public Vector3d add(Vector3d b) {
        return new Vector3d(b.x + x, this.y + b.y, z + b.z);
    }
    public static Vector3d add(Vector3d a, Vector3d b) {
        return new Vector3d(a.x+b.x,a.y+b.y,a.z+b.z);
    }
}




