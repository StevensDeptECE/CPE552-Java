import java.io.*;

public class Person implements Serializable {
	private String firstName;
	private String lastName;
	private long phone;
	public Person(String fName, String lName, long phone) {
		firstName = fName; lastName = lName; this.phone = phone;
	}
  public String toString() { return firstName + " " + lastName + " " + phone; }
}
