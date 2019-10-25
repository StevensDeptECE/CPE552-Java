public class ListTest2 {
	public static void main(String[] args) {
		int[] b = new int[1000000]; // single block of 4M bytes
		ArrayList<Integer> c = new ArrayList<>(1000000); // a single block of 1M pointers
		// each pointer is pointing to a separate Integer object (12 bytes) (16M bytes)
		c.set(0, new Integer(0));
		ArrayList<Integer> a = new ArrayList<>();
		for (int i = 0; i < 100; i++)
			a.add(new Integer(i));

		int sum = 0;
		for (int i = 0; i < a.size(); i++)
			sum += a.get(i).intValue();

		for (int i = 0; i < a.size(); i++)
			sum += a.get(i); 
