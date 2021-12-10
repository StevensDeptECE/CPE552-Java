public class ObjectProperties {
	public static void main(String[] args) {
		String s = "abc"; // strings and Integer/Double/Float are IMMUTABLE

		Double d = 5; // new Double(5);

		//Identity: all objects are in a unique location in memory
		Double d2 = 5;
		if (d != d2) {
			System.out.println("d is NOT THE SAME OBJECT as d2");
		}
		if (d.equals(d2)) {
			System.out.println("d has the SAME VALUE as d2");			
		}		
	}

}

class MyImmutable {
	private int x, y;
	private String s;
	public MyImmutable() {
		x = 2; y = 5;
		s = "abc";
	}
	public String getMyName() { return s; }
}
