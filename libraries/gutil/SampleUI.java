/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dov
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SampleUI extends JFrame {
    private HashMap<String,Object> conf;
    public SampleUI() throws Exception {
        super("Sample UI");
        Container c = getContentPane();
        String[] names = {
            "rotateLeft",
            "rotateRight", 
           // {"cut", "paste"},
           // {"phone", "edit"}
            "circle",
            "pentagon",
            "filled_pentagon",
            "trash",
            "start5",
            "clock",
            "edit",
            "cloud",
            "power"
        };

        Toolbar tb = new Toolbar(names); //TODO: add conf and name to look up in conf
        c.add(BorderLayout.WEST, tb);
        setSize(1000,800);
        setVisible(true);
    }
    public static void main(String[] args) throws Exception {
        new SampleUI();
        
    }
    
}
