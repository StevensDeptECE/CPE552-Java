package edu.stevens.server;

import java.util.ArrayList;

public class Person { // must be public to be a bean
    private String firstName;
    private String lastName;
    private int age;
    private Person father;
    private Person mother;
    private ArrayList<Person> children;

    public Person() {} // must have public default constructor OR serializable
 //   public Person(String firstName, String lastName, int age) {}

    public void setFirstName(String name) { firstName = name; }
    public String getFirstName() { return firstName; }
    public void setLastName(String name) { lastName = name; }
    public String getLastName() { return lastName; }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public ArrayList<Person> getChildren() {
        return children;
    }
    public void setChildren(ArrayList<Person>) {
        return children;
    }

    public void setChild(int i, Person p) { children.set(i, p); }
    public Person getChild(int i) { return children.get(i); }

}
