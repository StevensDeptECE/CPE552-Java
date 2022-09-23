package session07;

/**
 *
 * @author dkruger
 */
public class Vec3d {
    public double x,y,z;

    public Vec3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vec3d minus(Vec3d b) {
        return new Vec3d(x - b.x, y - b.y, z - b.z);
    }
    
    public double distSq(Vec3d b) {
        double dx = b.x - x, dy = b.y - y, dz = b.z - z;
        return dx*dx + dy*dy + dz*dz;
    }
    
    public double dist(Vec3d b) {
        return Math.sqrt(distSq(b));
    }
        
}
