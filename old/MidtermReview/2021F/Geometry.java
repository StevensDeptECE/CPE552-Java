public class Geometry {
	public static void main(String[] args) {
		ArrayList<Rect> shapes = new ArrayList<>();
		shapes.add(new Rect(10, 20, 100, 50));
		shapes.add(new Rect(50, 22, 80, 50)); // these intersect

		for (int i = 0; i < shapes.size(); i++)
			for (int j = i+1; j <= shapes.size(); j++)
				if (shapes[i].intersects(shapes[j])) {
					System.out.println("Intersection " + shapes[i] + ", " + shapes[j]);
				}
		

	}
}
