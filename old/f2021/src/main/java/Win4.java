/*
 * License: Do anything you want with this code
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 
/**
 *
 * @author dkruger
 */
// JFrame is a class
public class Win4 extends JFrame {
	public Win4(String title, Color bg, Color fg, int w, int h) {
		setTitle(title);
		setSize(w, h);
		JButton b = new JButton("ok");
		b.addActionListener(new DoSomething());
		
		Container c = getContentPane();
		c.setBackground(bg);
		c.setForeground(fg);
		c.add(b, BorderLayout.EAST);
		addWindowListener(new MyWindowKiller()  );
		setVisible(true);
	}
	public static void main(String[] args) {
		new Win4("My Window", Color.BLUE, Color.RED, 800, 600);
		//		new Win3("Win2", Color.RED, Color.BLACK, 300, 200);
	}
}
// ActionListener is an interface you can implement multiple interfaces (LATER)
class DoSomething implements ActionListener {
	public void actionPerformed(ActionEvent e) {
    System.out.println("hello");
	}
}

class MyWindowKiller extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
