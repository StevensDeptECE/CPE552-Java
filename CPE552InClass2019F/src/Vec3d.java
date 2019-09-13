/**
 *
 * @author dkruger
 */
public class Vec3d {
    private double x,y,z;
            
    public Vec3d(double xi, double yi, double zi) {
        x = xi; y = yi; z = zi;
    }
    public Vec3d() {
        this(0,0,0);
    }
    public static Vec3d add(Vec3d a, Vec3d b) {
        return new Vec3d(); //TODO:
    }
    public static Vec3d sub(Vec3d a, Vec3d b) {
        return new Vec3d(); //TODO:
    }
    public static double dot(Vec3d a, Vec3d b) {
        return 0; //TODO:
    }
    
    // Not needed this week
    public static Vec3d cross(Vec3d a, Vec3d b) {
        return new Vec3d();
    }

    public static void main(String[] args) {
        Vec3d v1 = new Vec3d();
        System.out.println(v1);
        Vec3d v2 = new Vec3d(1,2,3);
        System.out.println(v1);
        Vec3d v3 = new Vec3d(4,1,-1);
        System.out.println(add(v2,v3));
        System.out.println(sub(v2,v3));
        System.out.println(dot(v2,v3));
    }
}
