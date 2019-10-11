package session07;
import java.awt.event.*;
import javax.swing.*;

public class Buttons {
	public static void main(String[] args) {
		JButton b = new JButton("test");
		b.addActionListener(  new MyObj() );
	}

}

class MyObj implements ActionListener {
  public void actionPerformed(ActionEvent e) {
		System.out.println("Button pressed!");
	}

}
