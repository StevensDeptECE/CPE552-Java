package edu.stevens.cpe552;

public class TestAccount {
    public static void main(String[] args) {
        Account a = new Account(); // 0
        a.deposit(100);
        boolean status = a.withdraw(200);

        if (status) {
            System.out.println("Withdraw worked");
        } else {
            System.out.println("Withdraw failed");
        }
        System.out.println(a.getBalance());
        final long n = 100L;
        long t0 = System.nanoTime();
        for (long i = 0; i < n; i++) {
            a.deposit(1);
/*
            Thread t = new Thread() {
                public void run() {
                    a.deposit(1);
                }
            };
            t.start();
 */
        }
        long t1 = System.nanoTime();
        System.out.println((t1-t0)*1e-9);

        t0 = System.nanoTime();
        for (long i = 0; i < n; i++)
            a.withdraw(1);
        t1 = System.nanoTime();
        System.out.println((t1-t0)*1e-9);

        System.out.println(a.getBalance());
    }
}
