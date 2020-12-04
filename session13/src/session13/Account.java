//package session13;

public class Account {
	private long balance; // TODO: in real life, NEVER USE DOUBLE FOR $$$
	// read: "the salami technique"
		
	public Account() {

	}

	public synchronized boolean withdraw(long amt) {
		if (amt > balance)
			return false;
		balance -= amt;
		return true;
	}

	public synchronized void deposit(long amt) {
		balance += amt; // what happens if amt <0???
	}

	public synchronized long getBalance() {
		return balance;
	}
	private static class Deposits extends Thread {
		private Account a;
		private long n;
		public Deposits(Account a, long n) {
			this.a = a;
			this.n = n;
		}
		public void run() {
			for (long i = 0; i < n; i++)
				a.deposit(1); // read in 1000 + 1 --> 1001
		}
	}
	// balance = 1000
	private static class Withdrawals extends Thread {
		private Account a;
		private long n;
		public Withdrawals(Account a, long n) {
			this.a = a;
			this.n = n;
		}
		public void run() {
			for (long i = 0; i < n; i++)
				a.withdraw(1); // read in 1000 - 1 -->999
		}
	}

	public static void main(String[] args) {
		Account a = new Account(); // start with no money
		if (a.withdraw(500)) {
			System.out.println("withdraw worked");
		}
		final long n = 100000L;
		Thread t1 = new Deposits(a, n);
		t1.run();
		//		t1.start();
		try {
			Thread.sleep(1000);
		} catch(Exception e) {
		}
		Thread t2 = new Withdrawals(a, n);
		t2.run();
		//		t2.start();

		a.deposit(1000);
		System.out.println(a.getBalance());
		if (a.withdraw(200)) {
			System.out.println("withdraw worked");
		}
		System.out.println(a.getBalance());
	}
}
