package session06;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class S02Button3b extends JFrame {
	private Container c;
	public S02Button3b() {
		super("button window");
		setSize(600,400);
		c = getContentPane();
		JButton b = new JButton("ok");
		c.add(b, BorderLayout.CENTER);
		b.addActionListener(new MyListener(this));
	}
	// static inner class DOES NOT have a pointer to the outer class
	// THEREFORE IT CANNOT refer to anything in the outer class
	static class MyListener implements ActionListener { // S02Button3b$MyListener
		private S02Button3b window;
		public MyListener(S02Button3b window) {
      this.window = window;
		}
		public void actionPerformed(ActionEvent e) {
			window.c.setBackground(Color.RED);
			System.out.println("yoho");
		}
	}

}

