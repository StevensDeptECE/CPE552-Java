public class TestPerson2 {
	/*
		create a person object as shown containing a first name, last name,
		and two ArrayLists, one called likesFood and the other hatesFood

	 */
	public static void main(String[] args) {
		Person p = new Person("Dov", "Kruger");
		System.out.println(p.getFirstName()); // should print "Dov"
		System.out.println(p.getLastName()); // should print "Kruger"
		p.likes("sushi");
		p.likes("ice cream");
		p.hates("eggs");
    System.out.println(p);
		/* should print "Person firstname=Dov lastname=Kruger
                     likes: sushi, ice cream,
                     hates: eggs,

										Write code to traverse and display the list of likes and hates
										separated by commas. You may end with a comma
		*/
	}
}
