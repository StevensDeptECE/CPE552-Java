# CPE552 2023S Java Final Study Guide

## Basic Language

1. integer operations
1. floating point
1. Infinity and Nan
1. Loops
1. If statements
1. primitive types
   * int
   * long
   * short
   * byte
   * boolean
   * float
   * double
   * char
1. Calling functions, parameter passing

```java
public class A {
    public static void f(int x) {
        System.out.println(x+1);
    }
    public static void main(String[] args) {
        f(3); // call a static function
        // from outside the class
        // A.f(3)
    }
}
```

## Object-Oriented Programming
1. Defining a class
  * Naming Conventions
     * Class names start with cap letter: CamelCaseLikeThis
     * Variable names start with lowercase letter
         lowerCaseStarting
     * Names may not start with number 123ABC
1. Instantiating a class
   MyObject obj = new MyObject(2,3);
1. Call a method on a class
1. Call a method polymorphically using an abstract class or interface
1. Inherit a class from a class, abstract class, or interface
1. The 6 types of classes:
   * class
   * abstract class
   * interface
   * inner class
   * anonymous inner class
   * static inner class
   ```java
    class A {}

    abstract class B {
        public abstract void f();
    }

    interface C {
        public void g();
    }

    public class Outer {
        public class E {} // inner: Outer$E
        public Outer() {
            ActionListener a = new ActionListener() { // anonymous inner class  Outer$1
                public void actionPerformed(ActionEvent e) {}

            };

        }
    }


   ```
1. Packages
   * Be able to import
   * Be able to define your own package
   ```java
    package edu.stevens.dov;
    import java.util.ArrayList; 
    public class A {  // edu.stevens.dov.A
    }

   ```

## Properties of Objects
1. Immutable: Integer, String, Double (object does not change because no method will change it)
1. Identity == vs. .equals
1. Special case for strings:
  ```java
  String a1 = "abc"; String a2 = "a"+  "bc";
    //here a1 == a2 but only for strings compiled from constants 
  ```
## Collection Classes
1.  new BufferedReader(new FileReader("filename));
1.  ArrayList (fast for building sequential list)
1.  LinkedList (fast for insertion and deletion in the middle)
1.  HashMap (key and value, fast lookup)
1.  TreeMap (not as fast as HashMap, but sorted by key)  
1. Example problems
   * Read in a file and Build an array list of all the lines
   * Read in a file of dictionary words, and map each word to a number  "apple" --> 1, "bear" --> 2, ... 


## Java Beans
1. Rules for Java Beans
   * Must be public
   * Must have default constructor (not exactly, can also be serializable)
   * Must have matching public get/set methods

## Exception Handling
```java
try {


}catch (SQLException ex) {
    // print out something with this one
} catch (Exception e) {
    e.printStackTrace();
} finally {
    // this is called whether there is an exception or not
}
```

More modern Java syntax (not on test)
```java
try ( ....  ) {

} catch ()

```