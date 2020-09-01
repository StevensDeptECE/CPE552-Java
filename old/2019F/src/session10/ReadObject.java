package session10;

import java.io.*;

/**
 * @author dkruger
 */
public class ReadObject {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"));
            Person p = (Person)ois.readObject();
            Person p2 = (Person)ois.readObject();
            System.out.println(p == p2);
            System.out.println(p.equals(p2));
            ois.close();
        } catch(Exception e)  {
            e.printStackTrace();
        }
        
    }
    
}
