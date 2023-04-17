import java.io.*;
import java.lang.reflect.*;
import java.util.Scanner;

public class Reflection {
   public static void main(String[] args) throws Exception {
    //    Class c = Person.class;
        BufferedReader br = new BufferedReader(new FileReader("classNames.txt"));
        Scanner s = new Scanner(br);
        while (s.hasNext()) {
            String name = s.next();
            Class c2 = Class.forName(name);
            System.out.println(c2.getName());
            Method[] methods = c2.getMethods();
            for (Method m : methods)
                System.out.println(m.getName());
        }
    }
}