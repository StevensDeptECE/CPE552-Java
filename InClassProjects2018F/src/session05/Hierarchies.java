package session05;

/**
 *
 * @author dkruger
 */
public class Hierarchies {
    public static void main(String[] args) {
      Car c1 = new Car(55, "red");
      Bus b1 = new Bus(40, 22);
      Truck t1 = new Truck(25, 10000, 3);
// illegal: cannot instantiate      Vehicle v = new Vehicle();
      Spaceship s = new Spaceship(10000);
      
      System.out.println(c1);
      System.out.println(b1);
      System.out.println(t1);
      c1.payToll();
      b1.payToll();
      t1.payToll();
       
      Vehicle [] v = new Vehicle[3];
      v[0] = c1;
      v[1] = t1;
      v[2] = b1;
      for (int i = 0; i < v.length; i++)
          v[i].payToll();
      
    }
}

abstract class Vehicle {
    private int speed;
    public Vehicle(int s) { 
        speed = s;
    }
    public abstract void payToll();
}

class Car extends Vehicle { // is a kind of 
    private String color;
    public Car(int speed, String color) {
        super(speed);
        this.color = color;
    }
    public void payToll() {
      System.out.println(10);
    }
}

class Bus extends Vehicle {
    private int numPassengers;
    public Bus(int speed, int numPassengers) {
        super(speed);
        this.numPassengers = numPassengers;
    }
    public void payToll() {
      System.out.println(3);
    }
}

class Truck extends Vehicle {
    private double weight;
    private int numAxles;
    public Truck(int speed, double weight, int numAxles) {
        super(speed);
        this.weight = weight;
        this.numAxles = numAxles;
    }
    public void payToll() {
      System.out.println(20*numAxles);
    }
}

class Spaceship extends Vehicle {    
    public Spaceship(int speed) {
        super(speed);
    }
    public void payToll() {
       System.out.println("1000"); 
    }
}
