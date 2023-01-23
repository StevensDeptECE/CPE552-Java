package edu.stevens.mavenproject1;

/**
 * @author DovKr
 */
public class StaticData {
  public static void main(String[] args) {
    Zebra z = new Zebra("Fred");
    System.out.println(z);
  }
}

class Zebra extends java.lang.Object{
private String name;
  public Zebra(String name) {
    this.name = name; 
  }
  public String toString() {
    return "Zebra: name=" + name; 
  }
}