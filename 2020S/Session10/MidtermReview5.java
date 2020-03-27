import java.awt.event.*;

public class MidtermReview5 {
	public MidtermReview5() {
		A a1 = new A();
		// anonymous inner class
		ActionListener a = new ActionListener() { // MidtermReview5$1
				public void actionPerformed(ActionEvent e) {

				}

			};
		ActionListener a2 = new ActionListener() { // MidtermReview5$2
				public void actionPerformed(ActionEvent e) {

				}

			};
	}
	public static void main(String[] args) {
		
	}
	class A { // inner class has a refernece to the outer object
		// built in pointer to MidtermReview5
	}
	static class B { // does not have a reference to the outside class

	}
}

class X {
	public void f() {
		new A();
	}
}

