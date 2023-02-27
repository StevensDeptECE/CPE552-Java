import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Win1 extends JFrame {
    private Container c;
    public Win1(int w, int h, Color bg, String title) {
      super(title); // calls JFrame(title)
      setSize(w,h);
      c = getContentPane();
      c.setBackground(bg);
      setVisible(true);
      JButton b = new JButton("ok");
      c.add(b, BorderLayout.EAST);

      // ANONYMOUS INNER CLASS (same as inner class, but HAS NO NAME
      b.addActionListener(new ActionListener() { // name=Win1$1
          @Override public void actionPerformed(ActionEvent e) {
              c.setBackground(Color.RED);
          }
      });
    }
    class MyListener implements ActionListener {
        @Override public void actionPerformed(ActionEvent e) {
            c.setBackground(Color.RED);
        }
    }
    public static void main(String[] args) {
        new Win1(1000,700, Color.BLUE, "test");
    }
}

