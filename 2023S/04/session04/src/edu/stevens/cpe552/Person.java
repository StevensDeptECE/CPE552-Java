package edu.stevens.cpe552;

public class Person {
    private String name;
    private class Heart {
        public    String getOwnerName() {
            return name; // how does it know?
        }

    }
    private Heart h;
    public Person(String n) {
        this.name = n;
        h = new Heart();
    }
}
