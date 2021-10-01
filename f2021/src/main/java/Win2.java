/*
 * License: Do anything you want with this code
 */

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author dkruger
 */
public class Win2 {
	public Win2() {
		JFrame f = new JFrame();
		f.setSize(800,600);
		JButton b = new JButton("ok");
		Container c = f.getContentPane();
		c.add(b, BorderLayout.EAST);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new Win2();
	}
}
