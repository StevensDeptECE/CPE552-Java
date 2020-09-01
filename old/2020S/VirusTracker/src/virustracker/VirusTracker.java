package virustracker;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author dkruger
 */
public class VirusTracker extends JFrame {
    public VirusTracker() {
        super("Virus Tracker");
        setSize(1800, 1000); // TODO: how to set full screen?
        Container c = getContentPane();
        c.setBackground(Color.BLACK);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        VirusTracker v = new VirusTracker();
    }
    
}
