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
public class Win5 extends JFrame {
	public Win5(String title, Color bg, Color fg, int w, int h) {
		setTitle(title);
		setSize(w, h);
		JButton b = new JButton("ok");
		b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("hello");
				}
			} );
		
		Container c = getContentPane();
		c.setBackground(bg);
		c.setForeground(fg);
		c.add(b, BorderLayout.EAST);
		addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			} );
		setVisible(true);
	}
	public static void main(String[] args) {
		new Win5("My Window", Color.BLUE, Color.RED, 800, 600);
	}
}
