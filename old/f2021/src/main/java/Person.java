/**
 *
 * @author dkruger
 */
public class Person implements java.io.Serializable {
  private String name;
  private int age;
  public String toString() { return name + " " + age; }
  public Person(String name, int age) { 
      this.name = name;
      this.age = age;
  }
}
