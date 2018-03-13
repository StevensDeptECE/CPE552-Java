package session07;
import java.lang.reflect.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * @author dkruger
 */
public class BeanEditor extends JFrame {
  private Object edit;
//  private JTextField tf[];
  private String[] getAttributeList(Object edit) {
    Class c = edit.getClass();
    Method[] methods = c.getMethods();
    HashSet<String> getters = new HashSet<>();
    HashSet<String> setters = new HashSet<>();
    for (int i = 0; i < methods.length; ++i) {
      String name = methods[i].getName();
      if (name.startsWith("get"))
        getters.add(name.substring(3));
      else if (name.startsWith("set"))
        setters.add(name.substring(3));
    }
    int countAttributes = 0;
    String[] attributes = new String[getters.size()];
    for (String a : getters) {
      if (setters.contains(a)) {
        attributes[countAttributes++] = a;
      }
    }
    return attributes;
  }
  public BeanEditor(Object edit) {
    super("Bean Editor");
    this.edit = edit;
    setSize(800,700);
    Container c = getContentPane();
    String[] attributes = getAttributeList(edit);
    int countAttr = 0;
    for (countAttr = 0; countAttr < attributes.length; ++countAttr)
      if (attributes[countAttr] == null)
        break;  
    Font f = new Font("Times", Font.BOLD, 28);
    c.setLayout(new GridLayout(countAttr, 2));
    // either the entire array is full of attributes
    // or countAttr is the location of the first null
    for (int i = 0; i < countAttr; i++) {
      JLabel lab = new JLabel(attributes[i]);
      lab.setFont(f);
      c.add(lab);
      JTextField tf = new JTextField();
      tf.addActionListener(new SetAField(attributes[i]));
      tf.setFont(f);
      c.add(tf);
    }
    setVisible(true);   
  }
  public static void main(String[] args) {
    PersonBean p = new PersonBean();
    new BeanEditor(p);
    System.out.println(p);    
  }

  class SetAField implements ActionListener {
    private String methodName;
    public SetAField(String attr) {
      methodName = "set" + attr;
    }
    public void actionPerformed(ActionEvent e) {
      Class c = edit.getClass();
      try {
        Method m = c.getMethod(methodName, String.class);
        if (m == null)
          return;
        JTextField tf = (JTextField)e.getSource();
        m.invoke(edit, tf.getText());
        System.out.println(edit);
      } catch (NoSuchMethodException e2) { 
        e2.printStackTrace();
      } catch (IllegalAccessException e3) {
        e3.printStackTrace();
      } catch (InvocationTargetException e4) {
        e4.printStackTrace();
      }
    }
  }

}






















