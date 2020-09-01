package session10;

public class ThreadTest {
	public static void main(String[] args) {
		Thread t = new PrintEven(3, 90000000);
		t.start();
		Thread t2 = new PrintEven(1000000000,150000000);
		t.start();
	}

}

class PrintEven extends Thread {
	private int start, end;
  public SumEven(int start, int end) {
		this.start = start; this.end = end;
	}

	public void run() {
		if (start % 2 != 0)
			start++;
		if (end % 2 != 0)
			end--;
		long sum = 0;
    for (int i = start; i <= end; i += 2)
			System.out.println(i);
	}
}
