import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*; // Color, Font, Container


public class MyWin4 extends JFrame {
	public MyWin4() {
		super("MyWin4");
		super.setSize(800,800);
		Container c = getContentPane();
		Font f = new Font("Helvetica", Font.BOLD, 24);
		JTextField tf = new JTextField("0");
		tf.setFont(f);
		c.add(tf, BorderLayout.SOUTH);
		JLabel lab = new JLabel("testing testing 123");
		lab.setFont(f);
		c.add(lab, BorderLayout.NORTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true); // this.
	}
	public static void main(String[] args) {
		new MyWin4();
	}
}
