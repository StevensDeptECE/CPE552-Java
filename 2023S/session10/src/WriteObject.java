import java.io.*;
import java.util.*;

public class WriteObject {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("list.ser"));
        Person p = new Person("Dov", 56);
        Person p2 = new Person("Justin", 22);
        Car c1 = new Car("Honda", p);
        Car c2 = new Car("Tesla",  p2);
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(p);
        objects.add(p2);
        objects.add(c1);
        objects.add(c2);

        oos.writeObject(objects);
        oos.close();
    }
}
