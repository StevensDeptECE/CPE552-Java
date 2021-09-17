import static Math.*;

public class HomeworkVec3d {





	// You may not change main
	public static void main(String[] args) {
		HomeworkVec3d v1 = new HomeworkVec3d(1.0, 2.5, 3.0); // x=1, y=2.5,z=3
		final HomeworkVec3d v2 = new HomeworkVec3d(2.1, 1.2, -1.2);
		HomeworkVec3d v3 = v1.add(v2);
		System.out.println(v3);
		HomeworkVec3d v4 = v1.sub(v2); 
		System.out.println(v4);
		double m = v1.abs(); // absolute value (length)
		double y = Math.sqrt(2.0);
		double y2 = sqrt(3);

		HomeworkVec3d v5 = v1.neg();
		System.out.println(v5);
	}
}
