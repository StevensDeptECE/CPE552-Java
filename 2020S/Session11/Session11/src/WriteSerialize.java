import java.io.*;
import java.util.*;

public class WriteSerialize {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("obj.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Person p = new Person("James", "Taylor", 1234567890);
			Person p2 = new Person("John", "Lennon", 5539231239L);
			ArrayList<Person> people = new ArrayList();
			for (int i = 0; i < 100; i++)
				people.add(p);
			people.add(p2);
			oos.writeObject(people);
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

	
