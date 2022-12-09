package edu.stevens.s11;

import java.io.*;

/**
 * @author DovKr
 */
public class SerializeWrite {
  public static void main(String [] args) throws Exception {
    Person p = new Person("Dov", "Kruger");
    ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("Person.ser")));
    oos.writeObject(p);
    oos.close();
    
  }
}
