package edu.stevens.cpe552;

public class VenusFlytrap implements Flower {
    private int teeth;
    @Override
    public void smell() {
        System.out.println("Ouch!");
    }
    public void countTeeth() {
        System.out.println("count teeth =" + teeth);
    }

}
