import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*; // Color, Font, Container


public class MyWin3 extends JFrame {
	public MyWin3() {
		super("MyWin3");
		super.setSize(800,800);
		Container c = getContentPane();
		c.setBackground(Color.BLUE);
		c.setForeground(Color.WHITE);
		Font f = new Font("Helvetica", Font.BOLD, 24);

		
		JButton b = new JButton("ok");
		b.setFont(f);
		c.add(b, BorderLayout.NORTH);

		JPanel p = new JPanel(); // blank region that holds other stuff
		p.setLayout(new GridLayout(3,3, 5, 10));
		String[] names = {"A", "B", "C", "1", "2", "3", "X", "Y", "Z"};
		for(int i = 0; i < names.length; i++) {
			b = new JButton(names[i]);
			b.setFont(f);
			p.add(b);
		}
		p.setBackground(new Color(150, 0, 150));
		c.add(p, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true); // this.
	}
	public static void main(String[] args) {
		new MyWin3();
	}
}
