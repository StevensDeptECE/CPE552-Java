import javax.swing.*;
import java.awt.*;

public class BezierViewer extends JPanel {
    public void paint(Graphics g) {
        g.drawLine(0,0, 100,100);
        g.drawRect(0,0, 100,100);
        g.setColor(Color.RED);
        g.fillRect(100,100, 50,25);
    }


}
