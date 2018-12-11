package session13;

import java.util.Arrays;

/**
 *
 * @author dkruger
 */
public class Vec3d implements Comparable {
    private double x,y,z;
    public Vec3d(double x, double y, double z) {
        this.x = x; this.y = y; this.z = z;
    }
    public boolean equals(Vec3d v) {
        return x == v.x  && y == v.y && z == v.z;  
    }
    public int compareTo(Object obj) {
        Vec3d oth = (Vec3d)obj;
        if (x > oth.x) return 1;
        if (x < oth.x) return -1;
        return 0;
    }
    public static Vec3d add(Vec3d a, Vec3d b) {
        return new Vec3d(a.x + b.x, a.y + b.y, a.z + b.z);
    }
    

    public String toString() {
        return x + "," + y + "," + z;
    }

    public static void main(String [] args) {
        Vec3d v1 = new Vec3d(1,2,3);
        Vec3d v2 = v1;
        System.out.println(v1 == v2);
        Vec3d v3 = new Vec3d(1,2,3);
        System.out.println("v1 == v3: " + (v1 == v3) );
        System.out.println(v1.equals(v3));
        Vec3d[] arr = {v1, new Vec3d(3,1,0), new Vec3d(-2,2,1), v3};
        Arrays.sort(arr);
        for (Vec3d v : arr) {
            System.out.print(v + " ");
        }
        Vec3d v4 = add(v1,v2);
        
    }

}
