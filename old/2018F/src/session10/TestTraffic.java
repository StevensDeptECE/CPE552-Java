package session10;

import java.util.ArrayList;

/**
 *
 * @author dkruger
 */
public class TestTraffic {
    public static void main(String[] args) {
        Bus b = new Bus(50, 28); // 50mph, 28 passengers   payToll()
        Truck t = new Truck(65, 10000, 3); // 65mph, 10000kg 3 axles payToll()
        Car c = new Car(90, "red");  //payToll()
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = b;
        vehicles[1] = t;
        vehicles[2] = c;
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].payToll(); // polymorphism
/* DON'T DO THIS!!! YOU WILL REGRET IT -- LATER
if (v[i] instanceof Bus) {
                int n = ((Bus)v[i]).getPassengers();
            }
*/
        }
        for (Vehicle v : vehicles)
            v.payToll();
        ArrayList<Vehicle> vehicles2 = new ArrayList<>(1000000);
        vehicles2.add(new Car(25, "blue"));
        vehicles2.add(new Bus(44, 20));
        
        
        
    }
}
