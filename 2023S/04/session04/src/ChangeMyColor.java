import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChangeMyColor extends JFrame {
    private Container c;
    public ChangeMyColor() {
        super();
        setSize(500,400);
        setVisible(true);
        c = getContentPane();
        JButton b = new JButton("ok");
        c.add(b, BorderLayout.NORTH);
        b.addActionListener(new MyActionListener());
    }

    // inner class
    class MyActionListener implements ActionListener {
        @Override public void actionPerformed(ActionEvent e) {
            JButton x = (JButton)e.getSource();
            x.setBackground(Color.YELLOW);
            c.setBackground(Color.RED);
        }
    }

    public static void main(String [] args) {
        new ChangeMyColor();
    }

}


