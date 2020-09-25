import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class ColorChooser extends JFrame  {
    private JPanel showColor;
    private JSlider red, green, blue;
    public ColorChooser(String title, int w, int h, Color bg, Color fg) {
        super(title);
        setSize(w, h);
        Container c = getContentPane();
        c.setBackground(bg);
        c.setForeground(fg);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ChangeListener cl = new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                //System.out.println(red.getValue() + "," + green.getValue() + "," + blue.getValue());
                showColor.setBackground(new Color(red.getValue(), green.getValue(), blue.getValue()));
            }
        };

        red = new JSlider(SwingConstants.VERTICAL, 0, 255, 0);
        red.addChangeListener(cl);
        green = new JSlider(SwingConstants.VERTICAL, 0, 255, 0);
        green.addChangeListener(cl);
        blue = new JSlider(SwingConstants.VERTICAL, 0, 255, 0);
        blue.addChangeListener(cl);

        showColor = new JPanel();
        c.setLayout(new GridLayout(1, 4, 5, 0));
        c.add(red);
        c.add(green);
        c.add(blue);
        c.add(showColor);
        
        super.setVisible(true);
    }
    public static void main(String[] args) {
        new MenuExample("test1", 800,400, Color.BLUE, Color.WHITE);
    }
}

