/**
 *
 * @author dkruger
 */
public class Account implements java.io.Serializable {
    private String firstName;
    private String lastName;
    private double balance;
    private long accountid; // this is not directly set/getable but still a java bean
    
    public Account() {}
    public void setFirstName(String fname) {
        firstName = fname;
    }
    public String getFirstName() { return firstName; }
    
    public void setLastName(String lname) {
        lastName = lname;
    }
    public String getLastName() { return lastName; }
    
    public void setBalance(double balance) { this.balance = balance; }
    public double getBalance() { return balance; }
}
