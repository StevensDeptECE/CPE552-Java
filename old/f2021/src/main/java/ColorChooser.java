import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 
import javax.swing.event.*; 
/**
 * @author dkruger
 */
public class ColorChooser extends JFrame {
	private JPanel p;
	private JSlider r,g,b;
	public ColorChooser() {
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 4));
		c.add(r = new JSlider());
		ChangeListener vc = new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					int red = r.getValue();
					int green = g.getValue();
					int blue = b.getValue();
					Color c = new Color(red, green, blue);
					p.setBackground(c);
				}
			};
		
	  r.addChangeListener(vc);
		c.add(g = new JSlider());
		g.addChangeListener(vc);
		c.add(b = new JSlider());
		b.addChangeListener(vc);
		c.add(p = new JPanel());
		addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			} );
		setVisible(true);
	}
	public static void main(String[] args) {
		new ColorChooser();
	}
}
