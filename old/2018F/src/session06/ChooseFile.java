package session06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author dkruger
 */
public class ChooseFile extends JFrame {
    public ChooseFile() {
        super("testing");
        setSize(600,400);
        Container c = getContentPane();
        JButton b = new JButton("open file");
        b.addActionListener(new java.awt.event.ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                int returnVal = chooser.showOpenDialog(ChooseFile.this);
            }
              
          });

        c.add(b, BorderLayout.CENTER);
        setVisible(true);
    }
    public static void main(String[] args) {
        new ChooseFile();
    }
}
