import java.lang.reflect.*;
/**
 *
 * @author dkruger
 */
public class ListBeanAttributes {
    public static void main(String[] args) throws Exception {
        Object obj = new Quiz();
        
        Class c = obj.getClass();
        System.out.println(c.getName());
        Method[] methods = c.getMethods();
        for (int i = 0; i < methods.length; i++) {
           System.out.println(methods[i].getName());
        }
        
        
    }
}
