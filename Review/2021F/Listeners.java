import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Listeners extends JFrame {
	public Listeners() {
		super("This is my window title"); // call my parent's constructor
		Container c = getContentPane();

		JButton b = new JButton("ok");
		// add an anonymous inner class that prints hello every time this button is pressed
    b.addActionListener(new ActionListener() { // class Listeners$1 implements ActionListener {
				public void actionPerformed(ActionEvent e) {
					System.out.println("hello");
				}
			} );



		c.add(b, BorderLayout, EAST);
    b = new JButton("test2");
		// add an inner class (NOT ANONYMOUS) that prints TEST every time this button is pressed
    b.addActionListener(new MyListener());
		
		setSize(600,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Listeners();
	}

	class MyListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
			System.out.println("TEST");
		}
	}
}
