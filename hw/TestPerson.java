public class TestPerson {
	public static void main(String[] args) {
		Person p = new Person("Dov", "Kruger");
		System.out.println(p.getFirstName()); // should print "Dov"
		System.out.println(p.getLastName()); // should print "Kruger"
    System.out.println(p); // should print "Person firstname=Dov lastname=Kruger"
	}
}
