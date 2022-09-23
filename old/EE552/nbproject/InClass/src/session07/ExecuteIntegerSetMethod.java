package session07;

import java.lang.reflect.Method;

/**
 * @author dkruger
 */
public class ExecuteIntegerSetMethod {
    public static void main(String[] args) throws Exception {
        Object obj = new PersonBean("Dov", "Kruger", 50);
        
        Class c = obj.getClass();
        Method m  = c.getMethod("setAge", int.class);
        m.invoke(obj, 21); // 21 --> new Integer(21)
        System.out.println(obj);
    }
}
