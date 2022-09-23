import java.io.*;

/**
 * @author dkruger
 */
public class SerialWriter {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.ser"))) {
            Person p1 = new Person("Dov", 55);
            Person p2 = new Person("Fan", 23);
            oos.writeObject(p1);
            oos.writeObject(p2);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
