import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 
/**
 * @author dkruger
 */
public class ButtonChangesColor extends JFrame {
	private Container c;
	public ButtonChangesColor() {
		super("Click the button to change the color");
		setSize(500, 300);
		c = getContentPane();
		c.setBackground(Color.BLUE);
		JButton b = new JButton("ok");
		b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// this is an INNER CLASS
					c.setBackground(Color.RED);
					//					c.repaint();
				}
			} );
		
		c.add(b, BorderLayout.SOUTH);
		addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			} );
		setVisible(true);
	}
	public static void main(String[] args) {
		new ButtonChangesColor();
	}
}
