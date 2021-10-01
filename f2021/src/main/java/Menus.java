import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 
/**
 * @author dkruger
 */
public class Menus extends JFrame {
	public Menus() {
		super("Menu Example");
		setSize(500, 300);
		JMenuBar mb = new JMenuBar();
		JMenu m = new JMenu("File");
		JMenuItem mi = new JMenuItem("Quit");
		mi.addActionListener(
												 new ActionListener() {
													 public void actionPerformed(ActionEvent e) {
														 System.exit(0);
													 }
												 }
												 );
		m.add(mi);
		mb.add(m);
		setJMenuBar(mb);
		addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			} );
		setVisible(true);
	}
	public static void main(String[] args) {
		new Menus();
	}
}
