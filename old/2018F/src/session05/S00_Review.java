package session05;

/**
 *
 * @author dkruger
 */
public class S00_Review {
    public static void main(String[]args) {
        Person a = new Person("Dov", "Kruger", 50);
        System.out.println(a);
    }
}

//concrete class
class Person {
  private String firstName, lastName;
  private int age;
  public Person(String first, String last, int age) {
      firstName = first;
      lastName = last;
      this.age = age;
  }
  public String toString() {
      return "Person firstname=" + firstName + " lastname = " + lastName + " age=" + age;
  }
}
