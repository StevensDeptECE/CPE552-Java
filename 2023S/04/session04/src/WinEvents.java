import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WinEvents extends JFrame {
    public WinEvents(String title, int w, int h, Color bg) {
        super(title);
        setSize(w, h);
        Container c = getContentPane();
        c.setBackground(bg);
        this.addWindowListener(new MyWindowListener());
        setVisible(true);
    }
    public static void main(String[] args) {
        new WinEvents("test", 700,400, Color.GREEN);
    }

}

class MyWindowListener implements WindowListener {
    @Override public void windowOpened(WindowEvent e) {}
    @Override public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override public void windowClosed(WindowEvent e) {}
    @Override public void windowIconified(WindowEvent e) {
        System.out.println("hello!");
    }
    @Override public void windowDeiconified(WindowEvent e) {
        System.out.println("we are back!");
    }

    @Override public void windowActivated(WindowEvent e) {}
    @Override public void windowDeactivated(WindowEvent e) {}
}
