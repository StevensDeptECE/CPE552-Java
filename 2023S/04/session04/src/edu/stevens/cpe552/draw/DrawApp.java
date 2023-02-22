package edu.stevens.cpe552.draw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
    Shape

    Rect: x,y,w,h
    Circle x,y,r
    Triangle x, y, x2, y2, x3,y3


 */
public class DrawApp extends JFrame {
    private Shape[] shapes;
    public void paint(Graphics g) {
        for (int i = 0; i < shapes.length; i++)
            shapes[i].paint(g);
    }
    public DrawApp() {
        super("Draw app");
        shapes = new Shape[2];
        shapes[0] = new Triangle(0,35, 300,35, 150,200);
//TODO:        shapes[0] = new Rect(0,0, 300,200);
//TODO:        shapes[1] = new Circle(300,400, 200);
        shapes[1] = new Triangle(300,200, 600,400, 200,650);
        setSize(800,800);
        setVisible(true);

    }
    public static void main(String[] args) {
        new DrawApp();
    }

}
