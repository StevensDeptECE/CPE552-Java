package session07;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Properties;
import javax.swing.*;

/**
 *
 * @author dkruger

 DrawingApp represents the application contains UI: menus, buttons, etc drawing
 area is in a subsidiary class @see DrawingArea
 *
 */
public class DrawingApp extends JFrame {

    private DrawingArea drawing;
    private Properties prefs;

    private void buildMenus() {
        //JMenuBar b = 

    }

    private void buildToolbar() {
        JPanel p = new JPanel();
        JButton b = new JButton("Line Mode");
        p.setLayout(new GridLayout(6, 1));
        p.add(b);
        b = new JButton("Rect Mode");
        p.add(b);
        getContentPane().add(BorderLayout.WEST, p);
    }

    private void loadPrefs() {
        prefs = new Properties();
        try {
            FileReader fr = new FileReader("draw.conf");
            prefs.load(fr);
        } catch (IOException e) {
            prefs.setProperty("font", "Times");
            prefs.setProperty("fontSize", "24");
        }

        String fontFamily = prefs.getProperty("font");
        int fontSize = Integer.parseInt(prefs.getProperty("fontSize"));
        int bgColor = Integer.parseInt(prefs.getProperty("bgColor"), 16); // read in HEX
        System.out.println(fontFamily + "," + fontSize + "," + bgColor);

        int r, g, b;
        //  this is bgColor:   00000000rrrrrrrrggggggggbbbbbbbb
        r = bgColor >> 16; //  000000000000000000000000rrrrrrrr
        //  0000000000000000rrrrrrrrgggggggg
        //  00000000000000000000000011111111

        g = (bgColor >> 8) & 0xFF; //000000000000000000gggggggg
        b = bgColor & 0xFF;//  000000000000000000000000bbbbbbbb

    }

    private void savePrefs() {
        try {
            FileWriter fw = new FileWriter("draw.conf");
            prefs.store(fw, "string???");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public DrawingApp() {
        buildMenus();
        buildToolbar();
        loadPrefs();
        drawing = new DrawingArea();
        Container c = getContentPane();
        c.add(BorderLayout.CENTER, drawing);
        setSize(1000, 800);
        setVisible(true);
    }

    public static void main(String[] args) {
        DrawingApp d = new DrawingApp();
    }
}
