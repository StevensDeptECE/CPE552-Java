import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author dkruger
 */
public class Win4 extends JFrame {
    private JTextField tf;
    private void buildMenu() {
        JMenuBar mb = new JMenuBar();
        JMenu m = new JMenu("File");
        JMenuItem mi = new JMenuItem("Quit");
        mi.addActionListener(
           new ActionListener() { //name = Win4$1
               public void actionPerformed(ActionEvent e) {
                   System.exit(0);
               }
           }
        );
        m.add(mi);
        mb.add(m);
        setJMenuBar(mb);
    }
    public Win4(Color bg, int w, int h) {
        super("My Window"); // super must be the first line of constructor
        this.setSize(w,h);
        Container c = getContentPane();
        Font f = new Font("Times", Font.BOLD, 28);
        c.setBackground(bg);
        JButton b = new JButton("test");
        b.addActionListener(new MyListener());
        Font f2 = new Font("Helvetica", Font.BOLD, 72);
        JButton b2 = new JButton("1");
        b2.setFont(f2);
        MyListener2 mylistener = new MyListener2();
        b2.addActionListener(mylistener);
        c.add(b, BorderLayout.EAST);
        c.add(b2, BorderLayout.CENTER);
        JLabel text = new JLabel("hello there");
        text.setFont(f);
        c.add(text, BorderLayout.NORTH);
        tf = new JTextField("01234571258125.1241");
        c.add(tf, BorderLayout.SOUTH);
        JScrollBar sb = new JScrollBar(JScrollBar.VERTICAL, 0, 16, 0, 255);
        c.add(sb, BorderLayout.WEST);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildMenu();
        setVisible(true);
    }
    public static void main(String[] args) {
        new Win4(new Color(255,0,0), 800, 600);
    }
    class MyListener2 implements ActionListener {
    @Override public void actionPerformed(ActionEvent e) {
        tf.setText(tf.getText() + "1"  );
    }
}

}

class MyListener implements ActionListener {
    @Override public void actionPerformed(ActionEvent e) {
        System.out.println("yo!");
    }
}




