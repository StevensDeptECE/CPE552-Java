# 2022F Final Review

1. Built in data types
  a. int
  b. long
  c. short
  d. char
  e. byte
  f. float
  g. double
```java
midtern
int a = 3 / 4 * 5;
int b = 5 / 3 * 4;
double c = 5 / 2 * 4;
double d = 5 / 2 * 4.0;
double e = 5 / 2.0 * 4;
int f = 4 % 4 + 3 % 4 + 3 % 2 + 8 % 3;
char g = (char)('x'+ 1);
int h = (int)_______5.2;
```


2. Compound data types
  1. arrays int[] a;   int a[]
  1. objects

```java
public class A { // parent is Object
    private int a;
    protected void g() {}

    public A() {}
}

public class B extends A {
    // protected in parent can be used by child
    // constructor

    public B() {
        super(); // this is by default

    }
    public B(int x) {
        this(); // calls the constructor B()

    }    
}

public abstract class C {
    private int a;
    public void f() {}
    public abstract void g();
}

Make sure you can solve the following
______________ A {
    public void f();
}

______________ B _________ A {
    public void f() {}
}

______________ C __________A {
    public abstract void g();
}

______________ D _________ C {
    public void g() {}
}

______________ E _________ D{
    public void f() {}
}

class MyWin {

    public MyWin() {
        JButton b = new JButton("ok");
        b.addActionListener(
            new ActionListener() { // MyWin$1
                public void actionPerformed(ActionEvent e) {

                }
            }
        );
        b.addActionListener(
            new ActionListener() { // MyWin$2
                public void actionPerformed(ActionEvent e) {

                }
            }
        );

    }

}


// anonymous inner class
Thread t = new Thread() { // name of class is 
    public void run() {

    }
};

// static inner class

```

3. Write Functions
// sum arrays
// function calls

4. Object Oriented Programming
// Polymorphism

5. Rules: Beans, Immutable
  1. Write a Java Bean with attributes firstName, lastName

  ```java
  public class X {
    private String firstName;
    public X() {}
    public void setFirstName(String n) { firstName = n;}
    public String getFirstName() { return firstName; } 
  }

  String s = "hello";

  String s2 = s;
  s2 += "test"


  String s = "";
  for (int i = 0; i < 10000000; i++)
  s += i;

  StringBuilder b = new StringBuilder(60000000);
  for (int i = 0; i < 10000000; i++)
    b.append(i);  

  ```