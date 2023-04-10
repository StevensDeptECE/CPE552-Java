import java.io.*;
public class Car implements Serializable {
    String model;
    Person p;
    public Car(String model, Person p) {
        this.model = model;
        this.p = p;
    }
}
