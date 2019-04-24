package sessionReflectionBeans;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 * @author dkruger
 */
public class BeanEditor extends JPanel {
    private final static Class[] setparams = { String.class };
    private Object obj;
    private ArrayList<String> attributes;
    private ArrayList<Method> getMethods;
    private ArrayList<Method> setMethods;
    private void buildAttributes() {
        Class c = obj.getClass();
        System.out.println(c.getName());
        System.out.println(c.getSimpleName());
        Method[] methods = c.getMethods();
        ArrayList<String> getters = new ArrayList<>(),
                setters = new ArrayList<>();
        for (Method m : methods) {
            System.out.println(m.getName());
            String name = m.getName();
            if (name.startsWith("get"))
                getters.add(name.substring(3));
            else if (name.startsWith("set"))
                setters.add(name.substring(3));
        }
        System.out.println("Matching:");
        for (String n : getters) {
           if (setters.contains(n)) {
               System.out.println(n);
               
               try {
                       getMethods.add(c.getMethod("get" + n, null));  //getXXXX()
                   setMethods.add(c.getMethod("set" + n, new Class[] { String.class }));
               } catch (Exception e) {
                   e.printStackTrace();
               }
           }
        }
        
    }
    public BeanEditor(Object obj) throws Exception {
        this.obj = obj;
        buildAttributes();
        setLayout(new GridLayout(attributes.size(), 2));
        for (int i = 0; i < attributes.size(); i++) {
           Method m = getMethods.get(i);
           Object val = m.invoke(obj, null);
           add(new JLabel(attributes.get(i)));
           JTextField f = new JTextField(val.toString());
           f.addActionListener(new SetBeanAttribute(setMethods.get(i)));
           add(f);
            
        }
    }
      
    class SetBeanAttribute implements ActionListener {

        private Method setMethod;

        public SetBeanAttribute(Method m) {
            setMethod = m;
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                setMethod.invoke(obj, setparams);
                System.out.println(obj);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }


    
    public static void main(String[] args) throws Exception {
        JFrame f = new JFrame();
        f.setSize(1000,600);
        Container c = f.getContentPane();
        c.add(BorderLayout.CENTER, new BeanEditor(new PersonBean("test", "test", 123)));
        f.setVisible(true);
        
    }
}
