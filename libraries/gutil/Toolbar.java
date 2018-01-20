/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author dov
 */
public class Toolbar extends JPanel {
    public Toolbar(String[][] names) throws Exception {
        int rows = names.length, cols = names[0].length;
        String suffix = "32.png";
        setLayout(new GridLayout(rows,cols));
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                ImageIcon img = new ImageIcon("img/" + names[i][j] + suffix);
                JButton b = new JButton(img);
                b.setToolTipText(names[i][j]);
                add(b);
            }
        }
    }
    public Toolbar(String[] names) throws Exception {
        int rows = names.length, cols = 1;
        setLayout(new GridLayout(rows,cols));
        for (int i = 0; i < rows; ++i) {
            ImageIcon img = new ImageIcon("img/" + names[i] + ".png");
            JButton b = new JButton(img);
            b.setToolTipText(names[i]);
            add(b);
        }
    }
    
}
