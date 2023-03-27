public class Main {
    public static void main(String[] args) {
        Person p = new Person("Dov", "Kruger");
        Person p2 = new Person("Shucheera", "Prasad");
        System.out.println(p); // should print "Dov Kruger"

    }
}

class Person {
    // member variables store data inside the object
    private String firstName, lastName;
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String toString() {
        return firstName + " " + lastName;
    }
}