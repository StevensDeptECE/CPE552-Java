package session06;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class S02Button4 extends JFrame {
	private Container c;
	public S02Button4() {
		super("button window");
		setSize(600,400);
		c = getContentPane();
		JButton b = new JButton("ok");
		c.add(b, BorderLayout.CENTER);
		ActionListener a = new ActionListener() { // S02Button4$1
				public void actionPerformed(ActionEvent e) {
					c.setBackground(Color.RED);
					System.out.println("yoho");
				}
			};
		b.addActionListener(a);
	}
}

