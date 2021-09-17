import javax.swing.*;
import java.awt.*;
public class S03Swing2 {
	public static void main(String[] args) {
		JFrame f = new JFrame("my window title");
		int thisIsMyLongVariableName;
		f.setSize(600,400);
		Container c = f.getContentPane();
		JButton b = new JButton("Ok");
    c.add(b, BorderLayout.EAST);
		c.add(new JButton("yoho!"), BorderLayout.WEST);
		JLabel disp = new JLabel("test display");
		Font font = new Font("Times", Font.PLAIN, 20);
		disp.setFont(font);
		c.add(disp, BorderLayout.NORTH);
		c.add(new JTextField("texting..."), BorderLayout.SOUTH);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}
}
