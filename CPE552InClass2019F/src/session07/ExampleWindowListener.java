package session07;
import javax.swing.*;
import java.awt.event.*;

public class ExampleWindowListener extends JFrame {
	public ExampleWindowListener() {
		super("title of the window");
		setSize(600,400);
		addWindowListener(new MyWindowListener());
		setVisible(true);
	}
	public static void main(String[] args) {
		new ExampleWindowListener();
	}
}

class MyWindowListener extends WindowAdapter {
	@Override
  public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
