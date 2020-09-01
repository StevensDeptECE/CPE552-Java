package session06;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class S02Button5 extends JFrame {
	private Container c;
	public S02Button5() {
		super("button window");
		setSize(600,400);
		c = getContentPane();
		JButton b = new JButton("ok");
		c.add(b, BorderLayout.CENTER);
		
		b.addActionListener( new ActionListener() { // S02Button5$1
				public void actionPerformed(ActionEvent e) {
					c.setBackground(Color.RED);
					System.out.println("yoho");
				}
			} );
	}
}

