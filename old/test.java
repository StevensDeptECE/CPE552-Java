import java.awt.*.;

public class test extends Component {
	public static void sleep(int delay) {
		try {
			Thread.sleep(delay);
		} catch(InterruptedException e) {
		}
	}

	public void f() throws DivideByZero {
    if () {
			throw new DivideByZero();
		}
	}

	public void paint(Graphics g) {

	}
	
	public static void main(String[] args) {
		test t1 = new test();
		try {
			t1.f();
		} catch(DivideByZero e) {
			e.printStackTrace();
		}
		sleep(1000);
	}
