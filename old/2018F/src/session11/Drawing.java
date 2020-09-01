package session11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author dkruger
 */
public class Drawing extends JFrame {
    private DrawArea d;
    private void buildMenus() {
        JMenuBar b = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem mi = new JMenuItem("Save");
        mi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    d.save("test.draw");
                } catch(Exception e2) {
                    System.out.println("Can't write file");
                }
            }
        });
        file.add(mi);

        mi = new JMenuItem("Open");
        mi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    d.open("test.draw");
                    repaint();
                } catch(Exception e2) {
                    System.out.println("Can't write file");
                }
            }
        });
        file.add(mi);

        b.add(file);
        setJMenuBar(b);
    }
    private void buildToolbar(Container c) {
        JPanel toolbar = new JPanel();
        toolbar.setBackground(Color.blue);
        toolbar.setLayout(new GridLayout(10,2));
//        toolbar.add(new ModeButton(new RectMode()));
//        toolbar.add(new ModeButton(new LineMode()));
//        toolbar.add(new ModeButton(new CircleMode()));

        c.add(toolbar, BorderLayout.WEST);
    }
    public Drawing(int w, int h) {
        super("2018F Class Drawing Project");
        buildMenus();
        Container c = getContentPane();
        buildToolbar(c);
        c.add(d = new DrawArea(), BorderLayout.CENTER);
        setSize(w,h);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               System.exit(0); 
            }
        });
        setVisible(rootPaneCheckingEnabled);
    }
    public DrawArea getDrawArea() { return d; }
    public static void main(String[] args) {
        Drawing d = new Drawing(1000,800);
    }
}
