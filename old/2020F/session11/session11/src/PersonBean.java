/**
 *
 * @author dkruger
 */
public class PersonBean { // 1. Java Bean must be public
  private int age;
  private String firstName;
  private String lastName;

  public PersonBean() {
    firstName = null;
    lastName = null;
    age = 0;
  }
  /*
  public PersonBean(String firstName, String lastName, int age) {
    
  }
  */
  public int getAge() { // 3. return type of get must correspond to parameter of set
    return age;
  }

  public void setAge(int age) { // 2. must have matched public set and get method
    this.age = age;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
  public String toString() {
    return firstName + " " + lastName + " " + age;
  }
 
  public static void main(String[] args) {
    PersonBean pb = new PersonBean();
    System.out.println(pb);
    pb.setFirstName("Dov");
    pb.setLastName("Kruger");
    pb.setAge(30);
    System.out.println(pb);
  }
}
