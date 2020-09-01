import java.io.*;
import java.util.*;

public class ReadSerialize {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("obj.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<Person> people = (ArrayList<Person>)ois.readObject();
			for (Person p : people) {
				System.out.println(p);
			}
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

	
