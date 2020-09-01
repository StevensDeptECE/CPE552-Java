package session05;

/**
 * @author dkruger
 */
public class ConcreteClass {
    private int x;
    private float y;
    private String name;
    public ConcreteClass() {
       x = 0; y = 2.5f; name "Fred"; 
    }
    public static void main(String[] args) {
        ConcreteClass c = new ConcreteClass();//instantiate
}

abstract class Vehicle {
    private int speed;
    public Vehicle(int s) { speed = s; }
    public abstract void payToll();
}

class Car extends Vehicle {
    private int speed;
    public Car(int speed, String color) {
        this.speed = speed;
        
    }
    public void payToll() {
        System.out.println("pay $15");
    }
}

class Bus extends Vehicle {
    private int speed;
    public Bus(int speed, int numPassengers) {
        this.speed = speed;
    }
    
    public void payToll() {
        System.out.println("pay $4");
    }
    public class inner {
        
    }
    public static class inner2 {
        
    }
}

interface Professor {
  public void lecture();
  public void officeHours();  
}

