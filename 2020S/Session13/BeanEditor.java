import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.lang.reflect.*;

public class BeanEditor extends JFrame {
	private Object obj;
	private JTextField tf;
	public BeanEditor() {
		super("Bean Editor");
		setSize(800,600);
		Container c = getContentPane();
		c.add(BorderLayout.SOUTH, tf = new JTextField());
		tf.setFont(new Font("Times", Font.PLAIN, 35));
		tf.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						String className = tf.getText();
						Class c = Class.forName(className);
						setBean(obj = c.newInstance());
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
				});
		setVisible(true);		
	}

	public void setBean(Object obj) {
		System.out.println(obj);
		JPanel p = new JPanel();
    Class c = obj.getClass();
		ArrayList<String> getters = new ArrayList<>();
		HashMap<String, String> setters = new HashMap<>();
    Method[] methods = c.getMethods();
		for (int i = 0; i < methods.length; i++) {
 			String methodName = methods[i].getName();
			if (methodName.startsWith("get"))
				getters.add(methodName);
			else if (methodName.startsWith("set"))
				setters.put(methodName, null);
		}
		for (String g : getters) {
			String correspondingSetter = "set" + g.substring(3); // strip off the "get" -> "MyAttribute"
			if (setters.containsKey(correspondingSetter)) {
				System.out.println(correspondingSetter);
			}

		}
		/*
		for (String m : getters)
			System.out.println(m);
		for (String m : setters)
			System.out.println(m);
		*/
		
		getContentPane().add(BorderLayout.CENTER, p);
	}

	public static void main(String[] args) {
		new BeanEditor();
	}
}
