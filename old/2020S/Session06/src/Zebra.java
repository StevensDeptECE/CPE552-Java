/**
 *
 * @author dkruger
 */
public class Zebra {
    private String name;
    private static int count = 0;
    public Zebra(String name) {
        this.name = name;
        count++;

    }
    
    public void finalize() {
        System.out.println(name + " please don't kill me!");
        count--;
    }
    
    public String toString() {
        return "Zebra " + name + " count=" + count;
    }
    public static void f() {
        Zebra temp = new Zebra("Fred");
        System.out.println(temp);
    }
    public static void main(String[] args) {
        Zebra z1 = new Zebra("Bob");
        System.out.println(z1);
        for (int i = 0; i < 100; i++) {
            f();
            System.gc();
        }
        Zebra z2 = new Zebra("Alice");
        Zebra z3 = new Zebra("Eve");
        System.out.println(z2);
        System.out.println(z3);
        z1 = null;
        z2 = null;
        z3 = null;
    }
    
}
