package session12;

class Person {
  private String first, last;
  public Person(String f, String l) { first = f; last = l; }
  public boolean equals(Person p) {
    return this.first.equals(p.first) && this.last.equals(p.last);
  }
}

/**
 *
 * @author dkruger
 */
public class Session12 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Person p1 = new Person("Dov", "Kruger");
    Person p2 = p1; // what does this do?
    Person p3 = new Person("Dov", "Kruger");
    System.out.println(p1 == p2);
    System.out.println(p1 == p3);
    System.out.println(p1.equals(p3));

  }
  
}
