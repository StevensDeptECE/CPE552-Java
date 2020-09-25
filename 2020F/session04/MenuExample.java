import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuExample extends JFrame  {
    private JPanel showColor;
    private JSlider red, green, blue;
    public MenuExample(String title, int w, int h, Color bg, Color fg) {
        super(title);
        setSize(w, h);
        Container c = getContentPane();
        JMenuBar mb = new JMenuBar();
        JMenu m = new JMenu("File");
        JMenuItem mi = new JMenuItem("open...");
        mi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser();
                fc.showOpenDialog(MenuExample.this);
            }
        }
        );
        m.add(mi);
        mb.add(m);
        setJMenuBar(mb);
        super.setVisible(true);
    }
    public static void main(String[] args) {
        new MenuExample("test1", 800,400, Color.BLUE, Color.WHITE);
    }
}

