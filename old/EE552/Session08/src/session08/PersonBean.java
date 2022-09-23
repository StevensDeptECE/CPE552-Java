package session08;

/**
 * @author dkruger
 */
// all objects must descend from java.lang.Object
public class PersonBean extends Object {
    private String firstName, lastName;
    private int age;
    
    public PersonBean() {}
    public PersonBean(String fName, String lName, int age) {
        firstName = fName; lastName = lName; this.age = age;
    }
    public int getAge() { return age; }
    public void setAge(int a) { age = a; }

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
    
    
    
}
