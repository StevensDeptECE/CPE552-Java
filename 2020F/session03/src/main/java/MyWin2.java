import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*; // Color, Font, Container


public class MyWin2 extends JFrame {
	public MyWin2() {
		super("MyWin2");
		super.setSize(800,800);
		Container c = getContentPane();
		c.setBackground(Color.BLUE);
		c.setForeground(Color.WHITE);
		JButton b = new JButton("ok");
		c.add(b, BorderLayout.WEST);
		b = new JButton("cancel");
		c.add(b, BorderLayout.EAST);
		
		setVisible(true); // this.
	}
	public static void main(String[] args) {
		new MyWin2();

	}
}
