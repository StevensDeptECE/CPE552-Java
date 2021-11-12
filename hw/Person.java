public class Person {
	private String firstName, lastName;
	private ArrayList<String> likesFood;
	private ArrayList<String> hatesFood;
	
	public Person(String firstName, String lName){
		this.firstName = fName;
		lastName = lName;
		likesFood = new ArrayList<>();
		hatesFood = new ArrayList<>();
	}

	public void likes(String name) {
		likesFood.add(name);
	}

	public void hates(String name) {
		likesFood.add(name);
	}

	public String toString() {
		StringBuilder s = new StringBuilder(1024*1024);
		s.append("Person firstName=").append(firstName);
		s.append(" lastName=").append(lastName);
		s.append("\nlikes:");
		for (String like : likesFood)
			s.append(like).append(",");
		for (String hate : hatesFood)
			s.append(hate).append(",");
		return s.toString();
	}
}
