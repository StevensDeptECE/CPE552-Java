package session10;

/**
 * @author dkruger
 */
public class PersonBean { // MUST BE PUBLIC
    private String firstName, lastName;
    private int age;
    private int ssn;
    
    public PersonBean() { // default constructor
    }
    
    public void setFirstName(String v) {
        firstName = v;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String v) {
        lastName = v;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setAge(int v) {
        age = v;
    }
    
    public int getAge() {
        return age;
    }
    
    public Person[] getChildren() {
        return null;
    }
    
    public void setChildren(Person [] children) {
    }
    
    public void setChild(int i, Person p) {
        //children[i] = p;
    }
    public Person getChild(int i) {
        return null;
    }
}
