package session06;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class S02Button3 extends JFrame {
	private Container c;
	public S02Button3() {
		super("button window");
		setSize(600,400);
		c = getContentPane();
		JButton b = new JButton("ok");
		c.add(b, BorderLayout.CENTER);
		b.addActionListener(new MyListener());
	}
	// static inner class DOES NOT have a pointer to the outer class
	// THEREFORE IT CANNOT refer to anything in the outer class
	static class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//this would be an error			c.setBackground(Color.RED);
			System.out.println("yoho");
		}
	}

}

