import java.util.*;
/**
 *
 * @author dkruger
 */
public class ListCopy {
    public static void main(String [] args) {
			ArrayList<Integer> list = new ArrayList<>();
			list.add(3);
			list.add(1);
			list.add(4);

			ArrayList<Integer> list2 = (ArrayList<Integer>)list.clone();

			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i) == list2.get(i));
				System.out.println(list.get(i).equals(list2.get(i)));
			}
			// 3 1 4
			// 3 1 4

			ArrayList<Elephant> a = new ArrayList<>();
			a.add(new Elephant("Fred"));
			a.add(new Elephant("Ginger"));
			ArrayList<Elephant> b = (ArrayList<Elephant>)a.clone();

			a.get(0).setName("Bob");

			for (Elephant e : b) {
				System.out.println(e);
			}

			
    }
}

class Elephant {
	private String name;
	public Elephant(String name) {
		this.name = name;
	}
	public String toString() { return "Elephant " + name; }
	public void setName(String newName) { name = newName; }
}
