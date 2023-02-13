import javax.swing.*;

public class Win1 {
    public Win1() {
        JFrame f = new JFrame("test");
        f.setSize(600,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        Win1 w = new Win1();
        Win1 w2 = new Win1();
    }
}
