import java.awt.*;
import javax.swing.*;
/**
 *
 * @author dkruger
 */
public class Win2 {
    public static void createWindow() {
        JFrame f = new JFrame("my window");
        f.setSize(800,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        createWindow();
        createWindow();
    }
}
