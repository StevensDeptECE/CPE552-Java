import java.util.*;
import java.io.*;

public class DataStructures {
	public static void main(String[] args) {
		int[] a = new int[10];
		int[] b = {4, 5, 6};

		for (int i = 0; i < b.length; i++)
			System.out.println(b[i]);

		ArrayList<Integer> list = new ArrayList<>(1000000);
		for (int i = 0; i < 5; i++)
			list.add(i); // add(new Integer(i))

		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));

		for (Integer i : list)
      System.out.println(i);

		for (Iterator<Integer> it = list.iterator(); it.hasNext(); ) {
			Integer i = it.next();
			System.out.println(i);
		}

		HashMap<String, Integer> words = new HashMap<>();
		int count = 0;
		try(Scanner s = new Scanner(new FileReader("dict.txt"))) {
			while (s.hasNext()) {
				words.put(s.next(), count++);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		Integer x = words.get("Zebra");
		System.out.println(x);

		for (String word : words.keySet()) {
			System.out.println(word + "==>" +	words.get(word));
		}

		for (Map.Entry<String, Integer> entry : words.entrySet()) {
       String key = entry.getKey();
       Integer value = entry.getValue();
			 System.out.println(key + "==>" + value);
		}
	}

}
