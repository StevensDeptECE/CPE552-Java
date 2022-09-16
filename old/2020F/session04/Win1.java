import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Win1 extends JFrame  {
    public Win1(String title, int x, int y, int w, int h, Color bg, Color fg) {
        super(title);
        super.setBounds(x, y, w, h);
        Container c = getContentPane();
        c.setBackground(bg);
        c.setForeground(fg);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font f = new Font("Times", Font.BOLD, 32);
        JLabel disp = new JLabel("0");
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
        new Win1("test1", 0,0, 800,400, Color.BLUE, Color.WHITE);
//        new Win1("test2", 500, 600, 1000, 500, Color.BLACK, Color.RED);
    }
    
}

class MyListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("yoho!");
    }
}