import java.io.*;

/**
 * @author dkruger
 */
public class SerialReader {
    public static void main(String[] args) throws Exception {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.ser"))) {
            
            Person p1 = (Person)ois.readObject();
            Person p2 = (Person)ois.readObject();
            System.out.println(p1);
            System.out.println(p2);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
