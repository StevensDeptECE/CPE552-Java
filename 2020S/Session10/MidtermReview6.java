/*
public interface Runnable {
	public void run();
}
*/

public class MidtermReview6 {
	public MidtermReview6() {
		// what is this called? Anonymous inner class  name=
		Runnable run = new Runnable() { // MidtermReview6$1
				public void run() { System.out.println("tired!"); }
			};
	}
}
