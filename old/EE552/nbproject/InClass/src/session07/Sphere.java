package session07;

/**
 *
 * @author dkruger
 */
public class Sphere implements Shape3d {
    public Vec3d center;
    public double r;

    public Sphere() {
        this(new Vec3d(0,0,0), 0);
    }

    public Sphere(Vec3d center, double r) {
        this.center = center;
        this.r = r;
    }    

    @Override
    public Sphere boundingSphere() {
        return this;
    }

    @Override
    public boolean contains(Vec3d v) {
        return center.distSq(v) < r*r
    }

}
