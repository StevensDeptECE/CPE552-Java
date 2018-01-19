package edu.stevens.dkruger.gutil;
import java.awt.*;
import java.awt.event.*;

public class TestApp extends App {
	private void registerActions() {
		new Action("quit", new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		} );
		new Action("clear", new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("clear");
			}
		} );
	}
    public TestApp() {
    	super("Calculator", 600, 400, Color.BLUE,
    			new String[][]{
    					{"File", "New", "Open...", "Quit"},
    					{"Edit", "Cut", "Paste"},
    					{"Help", "About..."} 
    			}
    			);
    }

	public static void main(String[] args) {
		new TestApp();
	}
}
