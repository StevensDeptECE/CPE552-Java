package session09;

/**
 * @author dkruger
 */
public class TestAccount {
    public static void main(String[] args) {
        Account a = new Account();
        a.deposit(1010);
        System.out.println(a.withdraw(500));
        System.out.println(a.withdraw(500));
        System.out.println(a.withdraw(500));
        System.out.println(a.getBalance());
    }
}
