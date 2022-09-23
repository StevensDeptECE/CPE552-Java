package session13;

/**
 *
 * @author dkruger
 */
public class Person implements Cloneable {
    private String firstName, lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {}

    public boolean equals(Object obj) {
        Person p = (Person)obj;
        return ...
    }

    public static void main(String[] args) {
        Person a = new Person("Dov", "Kruger");
        Person b = new Person("Dov", "Kruger");
        System.out.println(a == b);
        System.out.println(a.equals(b));
        Person c = b; // does not copy
        Person d = b.clone(); // look this up, make it work!
        System.out.println(d==b); // should be FALSE
    }
}
