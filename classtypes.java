class A {
	int x;
	private int x;
	protected void g() { System.out.println("f"); }
	public void f() { System.out.println("f"); }
}


class LinkedList {
	private static class Node { // LinkedList.Node
    Node next;
		int val;
	}

	private Node head;
}

class LinkedList2 {
	private static class Node { // LinkedList2.Node

	}
}

// the only place you can instantiate an inner class is in a method
// of the outer class
class MyWindow extends JFrame {
	private DrawArea draw;

	// inner class has a variable pointing to the outer class
	class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// in here we can access draw
		}
	}

	public MyWindow() {
		JButton b = new JButton("ok");
		b.addActionListener(  // anonymous inner class
												new ActionListener() { // MyWindow$2
													public void actionPerformed(ActionEvent e) {

													}
												}
												);
	}
}

class D {
	public static void main(String[] args) {
		ButtonListener b = new ButtonListener();
	}
}

interface F {
	public void f();
	public void g();
}

class J implements F {
	public void f() {}
	public void g() {}
}
	
abstract class G {
	private int x,y;
	public abstract void f();
}

class H extends g {
	public void f() { }

}



//new F()
//	new G();

interface K extends F {
	public void h();
}
