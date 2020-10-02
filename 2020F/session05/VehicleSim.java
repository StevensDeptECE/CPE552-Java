import java.util.ArrayList;

public class VehicleSim {
    public static void main(String[] args) {
        Vehicle [] vehicles = new Vehicle[3];
        vehicles[0] = new Car(55, "red");
        vehicles[1] = new Car(65, "blue");
        vehicles[2] = new Truck(90, 10000.0);

        for (int i = 0; i < vehicles.length; i++) {
          System.out.println(vehicles[i]);
          vehicles[i].payToll();
        }

        ArrayList<Vehicle> vehicles2 = new ArrayList<Vehicle>();
//same but less typing        ArrayList<Vehicle> vehicles2 = new ArrayList<>();
        vehicles2.add(new Car(55, "red"));
        vehicles2.add(new Car(65, "blue"));
        vehicles2.add(new Truck(90, 10000.0));
        for (int i = 0; i < vehicles2.size(); i++) {
            System.out.println(vehicles[i]);
            vehicles[i].payToll();
          }
  
    }
}

abstract class Vehicle {
    protected int speed;
    public Vehicle(int s) { speed = s; }
    public abstract void payToll();
}

class Car extends Vehicle {
    private String color;
    public Car(int s, String c) {
        super(s);
         color = c;
    }
    public String toString() {
        return "Car speed=" + speed + " color=" + color;
    }
    public void payToll() {
        System.out.println("$15");
    }
}

class Truck extends Vehicle {
    private double weight;
    public Truck(int s, double w) {
        super(s);
        weight = w;
    }
    public void payToll() {
        System.out.println("$20");
    }
}