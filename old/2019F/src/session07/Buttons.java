package session07;
import java.awt.event.*;
import javax.swing.*;

public class Buttons {
	public static void main(String[] args) {
		JButton b = new JButton("test"); // instantiation
		b.addActionListener(  new MyObj() );
		b = new JButton("test2");
		b.addActionListener( new ActionListener() { // Buttons$1
				public void actionPerformed(ActionEvent e) {
					System.out.println("test2");
				}
			});
		b = new JButton("test3");
		b.addActionListener( new ActionListener() { // Buttons$2
				public void actionPerformed(ActionEvent e) {
					System.out.println("test3");
				}
			});
	}

}

class MyObj implements ActionListener {
  public void actionPerformed(ActionEvent e) {
		System.out.println("Button pressed!");
	}
}
