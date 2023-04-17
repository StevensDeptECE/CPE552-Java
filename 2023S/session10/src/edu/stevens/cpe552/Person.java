package edu.stevens.cpe552;

import java.io.Serializable;

public class Person implements Serializable {
    private String firstName;
    private String lastName;
    private int age;
    public Person() {
        this("", "", 0);
    }
    public Person(String fname, String lname, int age) {
        firstName = fname;
        lastName = lname;
        this.age = age;
    }
    public void f() {
        age = 99;
    }

    public void setX(int x) {}
    public String getX() { return "no!"; }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
