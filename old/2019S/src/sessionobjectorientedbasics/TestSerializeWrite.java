package sessionobjectorientedbasics;

import java.io.*;

/**
 * @author dkruger
 */
public class TestSerializeWrite {
    public static void main(String[] args) throws Exception {
        Vector v = new Vector(1,2,3);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.ser"));
        oos.writeObject(v);
        oos.close();
    }

}
