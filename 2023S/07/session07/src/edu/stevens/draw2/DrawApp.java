package edu.stevens.draw2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawApp extends JFrame {
    private DrawArea drawArea;
    public DrawApp() {
        super("Stevens Draw");
        setSize(1000,800);
        Container c = getContentPane();
        c.add(BorderLayout.CENTER, drawArea = new DrawArea());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel toolbar = new JPanel();
        toolbar.setBackground(Color.RED);
        toolbar.setLayout(new GridLayout(1,5));
        JButton b = new JButton("circle");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawArea.setMode(new CircleMode());
            }
        });
        toolbar.add(b);
        b = new JButton("rectangle");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawArea.setMode(new RectMode());
            }
        });
        toolbar.add(b);
        b = new JButton("line");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawArea.setMode(new LineMode());
            }
        });
        toolbar.add(b);
        c.add(BorderLayout.NORTH, toolbar);
        setVisible(true);
    }
    public static void main(String[] args) {
        new DrawApp();
    }
}
