package session07;

/**
 *
 * @author dkruger
 */
public class PersonBean {
  private String firstName;
  private String lastName;
  private int age;
  
  public PersonBean() { }
  public PersonBean(String fName, String lName, int age) {
    firstName = fName;
    lastName = lName;
    this.age = age;
  }
  public String toString() {
    return "Person firstName=" + firstName + 
           " lastName =" + lastName + 
           " age=" + age;
  }
  
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String name) {
    firstName = name;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  
  public static void main(String[] args) {
    PersonBean p = new PersonBean();
    PersonBean p2 = new PersonBean("Moshe", "Kruger", 16);
    System.out.println(p);
    System.out.println(p2);
  }
}






