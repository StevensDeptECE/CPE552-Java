import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.*;

/**
 *
 * @author dkruger
 */
public class BeanEditor extends JPanel {
  private Object obj;
  public BeanEditor() {
    obj = null;
  }
  
  public void setBean(Class c) throws Exception {
    obj = c.newInstance(); // new PersonBean()  or new Elephant() ...
    Method[] methods = c.getMethods();
    int countFields = 0;
    for (Method m : methods) {
      if (m.getName().startsWith("set"))
        countFields++;
    }
    setLayout(new GridLayout(countFields, 1));
    
    for (Method m : methods) {
      String name = m.getName();
      if (!name.startsWith("set"))
        continue;
      System.out.println(name);
      Parameter[] params = m.getParameters();
      Class pclass = params[0].getClass();
      if (pclass == Integer.class) {
        add(new IntegerFieldEditor(m));
      } else if (pclass == String.class) {
        add(new StringFieldEditor(m));
      }
    }
  }
  class FieldEditor extends JTextField {
    protected Method m;
    FieldEditor(Method m) { this.m = m; }
  }
  class IntegerFieldEditor extends FieldEditor {
    public IntegerFieldEditor(Method m) {
      super(m);
      addActionListener(new ActionListener() {
        @Override public void actionPerformed(ActionEvent e) {
          try {
            Object[] parameters = { Integer.parseInt(getText())  };
            m.invoke(obj, parameters);
            System.out.print(obj);
          } catch(Exception e3) {
            e3.printStackTrace();
          }
        }
      }); 
    }
  }
  class StringFieldEditor extends FieldEditor {
    public StringFieldEditor(Method m) {
      super(m);
      addActionListener(new ActionListener() {
        @Override public void actionPerformed(ActionEvent e) {
          try {
            Object[] parameters = { getText()  };
            m.invoke(obj, parameters);
            System.out.print(obj);
          } catch(Exception e4) {
            e4.printStackTrace();
          }
        }
      });
    }
  }
}
