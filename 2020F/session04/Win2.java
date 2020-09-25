import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Win2 extends JFrame  {
    private JLabel disp;
    public Win2(String title, int w, int h, Color bg, Color fg) {
        super(title);
        setSize(w, h);
        Container c = getContentPane();
        c.setBackground(bg);
        c.setForeground(fg);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font f = new Font("Times", Font.BOLD, 32);
        disp = new JLabel("0");
        disp.setFont(f);
        c.add(disp, BorderLayout.NORTH);
        JButton b = new JButton("ok");
        b.addActionListener(new MyListener());
        c.add(b, BorderLayout.SOUTH);
        JPanel p = new JPanel();
        p.setBackground(Color.YELLOW);
        c.add(p, BorderLayout.CENTER);
        super.setVisible(true);
    }
    public static void main(String[] args) {
        new Win2("test1", 800,400, Color.BLUE, Color.WHITE);
    }

    // inner class : Win2$MyListener
    class MyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            disp.setText(disp.getText() + "yoho!");
        }
    }

}

