package session06;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class S02Button1 extends JFrame {
	public S02Button1() {
		super("button window");
		setSize(600,400);
		Container c = getContentPane();
		JButton b = new JButton("ok");
		c.add(b, BorderLayout.CENTER);
		b.addActionListener(new MyListener());
	}
}

class MyListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
    System.out.println("yoho");
	}
}
