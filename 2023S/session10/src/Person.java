import java.io.*;

public class Person implements Serializable {
    String firstName;
    int age;
    public Person(String name, int age) {
        firstName = name;
        this.age = age;
    }
    public void f() {}
}
