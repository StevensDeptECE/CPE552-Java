public class Geometry {
	public static void main(String[] args) {
		ArrayList<Rect> shapes = new ArrayList<>();
		shapes.add(new Rect(10, 20, 100, 50));
		shapes.add(new Circle(50, 22, 80, 50));

		
		for (int i = 0; i < shapes.size(); i++)
			if (shapes[i].contains(20,30)) {
				System.out.println("contains " + shapes[i]);
			}
	}
}
