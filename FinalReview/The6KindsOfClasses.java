public class The6KindsOfClasses {
	public static void main(String[] args) {
		Outer out1 = new Outer();
		out1.f();
		Abby a1 ;
		Abby a2 = null;
    
	}

}

class Outer {
	public void f() {
		Inner in = new Inner(); // the inner class can only be instantiated inside a method
		ActionListener a = new ActionListener() {
				public void actionPerformed(ActionEvent e) {

				}
			};
		/*
        class Outer$1 implements ActionListener {
  				public void actionPerformed(ActionEvent e) {

	  			}
         }
       ActionListener a = new Outer$1();

		 */
	}
	class Inner {
		public Inner() {
		}
	}
}

class Outsider {
	void f() {
		// illegal: new Inner(); can't do this, Inner is not MY inner class
	}
}

abstract class Abby {
	private int x;
	public Abby() {
		this.x = x;
	}
	public void f() {}

	public abstract void g(); // abstract class may have abstract methods
}


interface Int {
  public void f(); // no need to say abstract
	public abstract void g();

}
