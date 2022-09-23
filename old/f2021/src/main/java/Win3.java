/*
 * License: Do anything you want with this code
 */

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author dkruger
 */
public class Win3 extends JFrame {
	public Win3(String title, Color bg, Color fg, int w, int h) {
		setTitle(title);
		setSize(w, h);
		JButton b = new JButton("ok");
		Container c = getContentPane();
		c.setBackground(bg);
		c.setForeground(fg);
		c.add(b, BorderLayout.EAST);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Win3("My Window", Color.BLUE, Color.RED, 800, 600);
		//		new Win3("Win2", Color.RED, Color.BLACK, 300, 200);
	}
}
