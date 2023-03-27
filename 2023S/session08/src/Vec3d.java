public class Vec3d {
    public double x,y,z;

    public Vec3d(double x, double y, double z) {
        this.x = x; this.y = y; this.z = z;
    }

    public static Vec3d add(Vec3d a, Vec3d b) {
        return new Vec3d(a.x+b.x, a.y+b.y, a.z+b.z);
    }

    // left side is called this
    public Vec3d add(Vec3d b) {
        return new Vec3d(this.x + b.x, this.y + b.y, this.z + b.z);
    }

    public static void main(String[] args) {
        Vec3d a = new Vec3d(1,2,30);
        Vec3d b = new Vec3d(4,5,6.5);
        Vec3d c = Vec3d.add(a,b);


    }

}
