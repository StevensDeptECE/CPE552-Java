public class Review {

}

class A {

}

interface B {
	public void f();
}

abstract class C {
	public abstract void g();
}

abstract class D implements B {
	private int x;
}

class E {
	public E() { // constructor
		JButton b = new JButton("ok");
		b.addActionListener(new ActionListener() { //anonymous inner class E$1
				public void actionPerformed(ActionEvent e) {
				}
			} );
	}
	class Inner { // inner class, name E$Inner
		// the inner class has a hidden variable pointing to E

	}
	static class Inner2 { // static inner class name is E$Inner2, no pointer

	}
}

/*
	all primitive data types: int, long, short, char, boolean,    float, double

  wrapper classes: Integer, Long, Short, Character, Boolean, Float, Double
      immutable

  java.lang.String  is also immutable

  String a = "abc";
  String b = "a" + "bc";

  System.out.println(a==b)

  Know about StringBuilder

  StringBuilder b = new StringBuilder(100000);
  for (int i = 0; i < 50000; i++)
    b.append(i);

  is better than:

  String s = "";
  for (int i = 0; i < 50000; i++)
    s += i;

  ArrayList<T>
  HashMap<String, Object> m = new HashMap<>()

  Iterators

  for (Map.Entry<String,Object> e : m.entrySet())  
            System.out.println("Key = " + e.getKey() + 
                             ", Value = " + e.getValue()); 

  for (String name : m.keySet())  
            System.out.println("key: " + name + m.get("name")); 



  Cloneable, Comparable

  Java bean

  Thread t = new Thread() {
    public void run() {

    }
  }
  t.start();

  Thread t = new Thread(runnable)


 */
