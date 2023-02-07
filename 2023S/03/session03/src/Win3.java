import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Win3 {
    public static void main(String[] args) {
        JFrame f = new JFrame("hello window!");
        f.setTitle("new title");

        f.setSize(700,400);
        Container c = f.getContentPane();// WHY?????
        c.setBackground(Color.BLACK);
        JButton b;
        c.add(b = new JButton("ok"), BorderLayout.NORTH);
        b.addActionListener(new MyListener());
        JPanel p = new JPanel();
        c.add(p, BorderLayout.CENTER);
        p.setBackground(Color.YELLOW);
        p.setLayout(new GridLayout(3, 2, 10, 5));
        p.add(new JButton("hello"));
        p.add(new JButton("bye"));
        p.add(new JButton("大"));
        p.add(new JButton("大"));
        p.add(new JButton("大"));
        p.add(new JButton("大"));
        final double 大 = 1.234e+100; // 大


        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

class MyListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("yo!");
    }
}
