package sesion06;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class S02Button2 extends JFrame {
	private Container c;
	public S02Button2() {
		super("button window");
		setSize(600,400);
		c = getContentPane();
		JButton b = new JButton("ok");
		c.add(b, BorderLayout.CENTER);
		b.addActionListener(new MyListener());
	}
	// inner class has a pointer to the outer class
	// it can refer to anything in the outer class
	class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//out class:  S02Button2.this   inner class: this
			
			c.setBackground(Color.RED);
			System.out.println("yoho");
		}
	}

}

