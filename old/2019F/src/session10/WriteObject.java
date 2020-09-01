package session10;

import java.io.*;

/**
 * @author dkruger
 */
public class WriteObject {
    public static void main(String[] args) {
        try {
            Person p = new Person("Dov", "Kruger", 52);
            Person p2 = new Person("Dov", "Kruger", 52);
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"));
            oos.writeObject(p);
            oos.writeObject(p2);
            oos.close();
        } catch(Exception e)  {
            e.printStackTrace();
        }
        
    }
    
}
