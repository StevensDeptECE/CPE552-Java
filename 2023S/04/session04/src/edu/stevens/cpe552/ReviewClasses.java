package edu.stevens.cpe552;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.util.*;

public class ReviewClasses {
    private int x;
    private String test;
    public ReviewClasses() {
            new A(); // A contains a hidden reference to the outer class

    }
    public void finalize() {}

    public void f() {}

    // inner class
    class A { // Name is ReviewCLasses$A

    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        ArrayList<Integer> a = new ArrayList<>();
        ReviewClasses r = new ReviewClasses();
        System.gc();

    }
}

interface Student {
    public void takeTest();
    public void doHomework();
}

interface DataStructuresStudent {
    public void code();
}

class X implements Student {
    public void takeTest() { //TODO:
         }
    public void doHomework(){
        //TODO:
    }
}






