import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author dkruger
 */
public class TextEd extends Win2 {
    public TextEd() {
        super(1000,800, Color.RED, Color.BLACK, "Text Editor");
        JTextArea a = new JTextArea(80, 25);
        a.setText("whatever");
        String x = a.getText();
        Container c = getContentPane();
        c.add(BorderLayout.CENTER, a);
        Font f = new Font("Times", Font.PLAIN, 44);
        JMenuBar mb = new JMenuBar();
        JMenu m = new JMenu("File");
        mb.add(m);
        JMenuItem mi = new JMenuItem("Save");
        mi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Save");
            }
            
        });
        m.add(mi);
        setJMenuBar(mb);
        a.setFont(f);
        setVisible(true);
    }
    public static void main(String[] args) {
        new TextEd();
    }
}
