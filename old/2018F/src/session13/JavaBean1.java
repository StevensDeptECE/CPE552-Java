package session13;

/**
 * @author dkruger

Every Java bean must be:
* 1. Public (so other code can see it)
* 2. Must have either a default constructor or be serializable


*/
public class JavaBean1 extends Object {
    private String name;
    private int age;
    private double x, y, z;

    public JavaBean1(String n, int a, double x, double y, double z) {
        
    }
    public JavaBean1() { name = ""; age = 0; }    
    
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void setAge(int a) { age = a; }
    public int getAge() { return age; }
    public String toString() { return name + " age=" + age; }
}
