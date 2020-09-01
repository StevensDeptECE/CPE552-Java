import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class DataManip {
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<>();
		for (int i = 1; i <= 100000; i++)
			strings.add("test" + i);

		/*
		// do not use this method of traversal for anything but ArrayList
		for (int i = 0; i < strings.size(); i++)
			System.out.println(strings.get(i)); // O(n^2)

		for (Iterator<String> i = strings.iterator(); i.hasNext(); ) {
			String s = i.next();
			System.out.println(s);
		}

		for (String s : strings) {
			System.out.println(s);
		}
		*/
		HashMap<String, Integer> dict = new HashMap<>();
		dict.put("the", 1); // autoboxes: creates new Integer(1)

		Integer count = dict.get("the");
		count = count + 1; // autoboxes new Integer(1 + 1);
		dict.put("the", count);
		
    System.out.println(dict.get("and"));		
    System.out.println(dict.get("the"));
		for (int i = 0; i < 100000; i++)
			dict.put("test"+i, i);
		System.out.println(dict.size());

		System.out.println(dict.get("test50000"));

		dict.put("AAPL", 192);
		dict.put("IBM", 106);
		System.out.println(dict.get("AAPL));
		
	}
}
