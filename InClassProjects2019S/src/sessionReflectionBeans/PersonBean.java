package sessionReflectionBeans;

/**
 *
 * @author dkruger
 */
public class PersonBean {
    private String firstName, lastName;
    private int age;
    private long ssn;
    //private PersonBean[] children;
    
    public PersonBean(String fName, String lName, int age) {
        firstName = fName; lastName = lName; this.age = age;
    }
    public PersonBean() {
        firstName = "Dov";
        lastName = "Kruger";
        age = 52;
    } // firstName = null lastname = null age  = 0

    public int getX() { return 0; }
    public void setX(int x) {}
    public String toString() { return firstName + " " + lastName + " age=" + age; }

    /*
    public int getChildCount() { return children.length; }
    public PersonBean getChild(int i) { return children[i]; }
    public void setChild(int i, PersonBean p) { children[i] = p; }
    */
    
    
    public void setFirstName(String name) {
        firstName = name;
    }
    public String getFirstName() { return firstName; }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age + "";
    }

    public void setAge(String age) {
        this.age = Integer.parseInt(age);
    }
    public void setChildren(PersonBean[] children) {}
    public PersonBean[] getChildren() {}

}
