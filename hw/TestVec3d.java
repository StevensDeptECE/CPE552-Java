public class TestVec3d {
	public static void main(String[] args) {
		Vec3d v1 = new Vec3d(1.0, 2.1, 3.2); // x=1.0 y=2.1 z=3.2
		Vec3d v2 = new Vec3d(2.1, -1.1, 1.2);
		Vec3d v3 = v1.add(v2);
		Vec3d v4 = v1.scale(2.0);
    System.out.println(v3); // should print (3.1, 1.0, 2.0)
		System.out.println(v4); // should print (2.0, 4.2, 6.4)
	}
}
