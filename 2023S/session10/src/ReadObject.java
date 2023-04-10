import java.io.*;
import java.util.*;

public class ReadObject {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("list.ser"));
        ArrayList<Object> objects = (ArrayList<Object>)ois.readObject();
        for (Object x : objects)
            System.out.println(x);
        ois.close();
    }
}
