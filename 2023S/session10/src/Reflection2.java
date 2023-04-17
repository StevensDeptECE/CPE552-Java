import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.*;

public class Reflection2 {
    public static void findMatchingMethods(Class c) throws Exception {
        Method[] m = c.getMethods();

        ArrayList<String> getters = new ArrayList<>();
        ArrayList<String> setters = new ArrayList<>();
        HashMap<String, Method> map = new HashMap<>();
        HashSet<String> s = new HashSet<>();

        for (int i = 0; i < m.length; i++) {
            String name = m[i].getName();
            if (name.startsWith("get")) {
                getters.add(name);
                System.out.println(name);
            } else if (name.startsWith("set")) {
                setters.add(name);
                System.out.println(name);
                s.add(name);
            }
        }
        for (String get : getters) {
            String lookingForSet = get.replace("get", "set");
            if (s.contains(lookingForSet)) {
                System.out.println("Match using set!" + get.substring(3));
                // but do the types match?
                Method g = c.getMethod(get); // method with no parameters "getFIrstName"
                Class r = g.getReturnType();


                Method setter = c.getMethod(lookingForSet, r);
                if (setter != null) {

                }



            }
            for (String set : setters) {
                if (set.equals(lookingForSet)) {
                    System.out.println("Match! " + get.substring(3));
                }
            }
        }
    }
    public static void reflection(String className) throws Exception {
        Class c = Class.forName(className);
        System.out.println(c.getName());
        Object obj = c.newInstance();
        System.out.println(obj);
        findMatchingMethods(c);
                
    }
   public static void main(String[] args) throws Exception {
//      reflection("java.util.ArrayList<Integer>");
       reflection("edu.stevens.cpe552.Person");

    }
}