package sessionobjectorientedbasics;

import java.io.*;

/**
 * @author dkruger
 */
public class TestSerializeRead {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.ser"));
        Vector v = (Vector)ois.readObject();
        ois.close();
        System.out.println(v);
    }

}
