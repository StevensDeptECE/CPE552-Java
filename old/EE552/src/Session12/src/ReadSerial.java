import java.io.*;

/**
 *
 * @author dkruger
 */
public class ReadSerial {
  public static void main(String[] args) {
    try {
      ObjectInputStream ois = new ObjectInputStream(new FileInputStream("out.ser"));
      Robot  r = (Robot)ois.readObject();
      ois.close();
      System.out.println(r);
    } catch(Exception e) {
        e.printStackTrace();
    }
  }
}
