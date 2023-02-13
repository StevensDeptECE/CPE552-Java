import javax.swing.*;
import java.awt.*;
public class Win2 extends JFrame { // Win2 IS_A JFrame
    public Win2(String title, int w, int h, Color bg) {
        super(title);
        this.setSize(w,h);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setBackground(bg);
        setVisible(true);
    }

    public static void main(String[] args) {
        Win2 w = new Win2("test", 800, 600, Color.BLACK);
        Win2 w2 = new Win2("hello", 600, 400, Color.RED);
    }
}
