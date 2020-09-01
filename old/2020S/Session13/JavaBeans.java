/**
 *
 * @author dkruger
 */
public class JavaBeans {
    public static void main(String[] args) {
        Account a = new Account();
        a.setFirstName("Dov");
        a.setLastName("Kruger");
        a.setBalance(1000.0);
    
        System.out.println(a.getFirstName());
        System.out.println(a.getLastName());
        System.out.println(a.getBalance());
    }
}
