package edu.stevens.s11;

/**
 * @author DovKr
 */
public class Person implements java.io.Serializable {
  public String firstName;
  public String lastName;
  public Person(String fname, String lname) {
    firstName = fname;
    lastName = lname;
  }
}
