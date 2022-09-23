package session07;

/**
 *
 * @author dkruger
 */
public class Person {
  private String firstName;
  private String lastName;
  private int age;
  
  public Person() { }
  public Person(String fName, String lName, int age) {
    firstName = fName;
    lastName = lName;
    this.age = age;
  }
  public String toString() {
    return "Person firstName=" + firstName + 
           " lastName =" + lastName + 
           " age=" + age;
  }
  public static void main(String[] args) {
    Person p = new Person();
    Person p2 = new Person("Moshe", "Kruger", 16);
    System.out.println(p);
    System.out.println(p2);
  }
}






