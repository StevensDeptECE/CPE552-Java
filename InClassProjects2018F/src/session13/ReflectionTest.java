package session13;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.HashMap;
/**
 * @author dkruger
 */
public class ReflectionTest {
    public static void getAttributes(Class c) throws NoSuchMethodException {
        Method[] methods = c.getMethods();
        ArrayList<String> getters = new ArrayList<>();
        HashMap<String, Method> setters = new HashMap<>();
        for (int i = 0; i < methods.length; i++) {
            String name = methods[i].getName();
            if (name .startsWith("get"))
                getters.add(name);
            else if (name.startsWith("set"))
                setters.put(name, c.getMethod(name, String.class));
        }
        for (int i = 0; i < getters.size(); i++) {
            String name = getters.get(i).substring(3);
            Method setter = setters.get(name);
            if (setter != null) {
                System.out.println(setter);
            }
        }
    }
    public static void main(String[] args) throws Exception {
        String className = "session13.JavaBean1";
        Class c = Class.forName(className);
        System.out.println("Your class is named: " + c.getName());
        Method[] methods = c.getMethods();
        for (Method m : methods) {
            System.out.println("method: " + m.getName());
        }

        Constructor constructor = c.getConstructor();
        Object obj = constructor.newInstance();
        
        
        
        Method m = c.getMethod("setName", java.lang.String.class);
        m.invoke(obj, "abc");
        getAttributes(c);
    }
}
