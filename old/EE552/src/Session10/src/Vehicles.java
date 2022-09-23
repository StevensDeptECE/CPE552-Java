/**
 *
 * @author dkruger
 */
abstract class Vehicle {
    private int speed;
    
    public Vehicle(int speed) { this.speed = speed; System.out.print('e');}
    public Vehicle() { speed = 0; System.out.print('d');}
    public int getSpeed() { return speed; }
    public abstract void payToll();
}

class Car  extends Vehicle {
    private String color;
    
    public Car(int speed, String color) {
        super(speed);
        System.out.print('c');
        this.color = color;
    }
    public Car(String color) {
        super();
        System.out.print('b');
        this.color = color;
    }
    public Car() {
        this("red");
        System.out.print('a');
    }
        
    public String getColor() { return color; }
    public void payToll() {
       System.out.println("$15"); 
    }
}

class Bus extends Vehicle {
    private int numPassengers;
    
    public void payToll() {
       System.out.println("$4"); 
    }
    public Bus(int speed, int numPassengers) {
        super(speed);
        this.numPassengers = numPassengers;
    }
}

class Truck extends Vehicle {
    private double weight;
    private int axles;
    public void payToll() {
       System.out.println("$" + (15 * axles)); 
    }

    public double getWeight() { return weight; }
    public Truck(int speed, double w, int axles) {
        super(speed);
        weight = w;
        this.axles = axles;
    }
}



public class Vehicles {
    public static void main(String[] args) {
      Car c1 = new Car();
      Car c2 = new Car("blue");
      Car c3 = new Car(28, "yellow");
      //c3.payToll(); // known at compile time
      Truck t1 = new Truck(55, 10000.0, 4);
//      t1.payToll();
      
      int[] a = new int[5];
      Car[] c = new Car[5];
      c[0] = new Car(55, "Red");
/*
      //c[0].getWeight();
      c[1] = new Truck(55, 10000, 4);
      c[1].getColor();
  */
      Vehicle[] v = new Vehicle[5];
      v[0] = new Car(55, "red");
      v[1] = new Truck(92, 10000, 3);
      v[2] = new Truck(92, 10000, 2);
      v[3] = new Bus(44, 20);
      v[4] = new Car(99, "green");

      System.out.println("\n\n");
      for (int i = 0; i < v.length; i++) {
         System.out.println(v[i].getSpeed());
          v[i].payToll();
      }
      for (Vehicle v2 : v) {
          v2.payToll();
      }
      
      
    }
}




