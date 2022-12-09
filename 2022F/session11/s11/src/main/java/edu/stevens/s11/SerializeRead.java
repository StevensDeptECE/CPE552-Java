package edu.stevens.s11;

import java.io.*;

/**
 * @author DovKr
 */
public class SerializeRead {
  public static void main(String [] args) throws Exception {
    
    ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("Person.ser")));
    Person p = (Person)ois.readObject();
    ois.close();
    System.out.println(p.firstName + " "  + p.lastName);
    
  }
}
