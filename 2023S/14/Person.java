public class Person { // Not People
    private String firstName;
    private String lastName;
    private int    id;
    public Person() {
         firstName = "";
         lastName = "";
         id = 0;
    }
    public String getFirstName() { return firstName; }
    public void setFirstName(String f) {
        firstName = f;
    }
    public String getLastName() { return lastName; }
    public void setLastName(String L) {
        lastName = L;
    }
}