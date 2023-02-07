public class Person {

    private String firstName, lastName;

    public Person(String firstName, String lName){
        this.firstName = firstName;
        this.lastName = lName;
    }
    public Person() {
        this("Dov", "Kruger"); // call the constructor above with two parameters
    }
    public Person(String firstName) {
        this(firstName, "Kruger"); // same, call the constructor with 2 params
    }

    public static Person theProf() { // Person.theProf()
        return new Person("Dov", "Kruger");
    }

}
