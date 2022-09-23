public class Account {
	private double balance;
	public Account() { balance = 0; }

	/*
		"race condition"

		thread 1           thread2
    read balance=0     read balance =0
    +1                 +1
    write balance=1    write balance = 1

	 */
	
	public synchronized void deposit(double amt) {
		balance += amt;
	}

	public synchronized boolean withdraw(double amt) {
		if (amt < balance) {
			balance -= amt;
			return true;
		}
		return false;
	}

	public double getBalance() {

		synchronized(this) {

		}
		return balance;
	}

	public static void main(String[] args) {
		Account a = new Account();
		final int n = 1000000000;

		Thread t1 = new Thread() {
				public void run() {
					for (int i = 0; i < n; i++)
						a.deposit(1.0);
				}
			};
		t1.start();
		/*
		Thread t2 = new Thread() {
				public void run() {
					for (int i = 0; i < n/2; i++)
						a.withdraw(1.0);
				}
			};
		*/
		Thread t2 = new Thread() {
				public void run() {
					for (int i = 0; i < n/2; i++)
						a.deposit(1.0);
				}
			};
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch(InterruptedException e) {

		}
		System.out.println(a.getBalance());

	}
}
