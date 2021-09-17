import javax.swing.*;
import java.awt.*;
public class S04Swing3 {
	public static void main(String[] args) {
		JFrame f = new JFrame("my window title");
		f.setSize(800,600);
		Container c = f.getContentPane();
		JPanel p = new JPanel();
		c.add(p, BorderLayout.CENTER);
		p.setLayout(new GridLayout(3,3));
		for (int i = 0; i < 9; i++) {
			JButton b = new JButton("" + i);
			p.add(b);
		}			
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}
}
