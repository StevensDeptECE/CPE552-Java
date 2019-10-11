package session07;
import java.awt.event.*;

public class AnonymousInnerClasses {
	public static void main(String[] args) {
		ActionListener a1 = new ActionListener() { //  AnonymousInnerClasses$1
				public void actionPerformed(ActionEvent e) {
					
				}
			};
		ActionListener a2 = new ActionListener() { //  AnonymousInnerClasses$2
				public void actionPerformed(ActionEvent e) {
					
				}
			};
	}
}

class MyListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {

	}
}
