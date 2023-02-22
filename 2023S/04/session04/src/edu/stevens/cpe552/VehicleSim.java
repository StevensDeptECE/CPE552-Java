package edu.stevens.cpe552;

interface A {
    void f();
}
public class VehicleSim {
    public static void main(String[] args) {
        Car c = new Car(55, "red");
        Bus b = new Bus(28, 32);
        Truck t = new Truck(70, 20000.0);
        // ILLEGAL: Vehicle v = new Vehicle(10);
        // ILLEGAL: A a1 = new A();
        Vehicle[] vehicles = {c, b, t};
        for (int i = 0; i < vehicles.length; i++)
            System.out.println(vehicles[i].payToll()); //polymorphism
        X x1 = new X();
    }
}
