import javax.swing.*;
import java.awt.*;

public class Win3 extends JFrame {
    public Win3() {
        super("bezier viewer");
        setSize(1000,800);
        setVisible(true);
        Container c = getContentPane();
        c.add(new BezierViewer(), BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        new Win3();
    }

}
