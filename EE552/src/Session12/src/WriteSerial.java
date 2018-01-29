import java.io.*;

class Robot implements java.io.Serializable {
  float x,y,z;
 static final long serialVersionUID = 1L;
  public Robot(float x, float y, float z) {
    this.x = x; this.y = y; this.z = z;
  }
 public float getX() { return x; }
  public String toString() { return "Robot " + x + "," + y + "," + z; }

/*
  private void writeObject(ObjectOutputStream out) throws IOException {
    out.writeFloat(x);
    out.writeFloat(y);
    out.writeFloat(z);
  }
  private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
     
     
     
  }
  */
}
/**
 *
 * @author dkruger
 */
public class WriteSerial {
  public static void main(String[] args) {
    try {
      Robot r = new Robot(1,2,3);
      ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("out.ser"));
      oos.writeObject(r);
      oos.close();
    } catch(Exception e) {
        e.printStackTrace();
    }
  }
}
