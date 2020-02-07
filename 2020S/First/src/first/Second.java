package first;

/**
 *
 * @author dkruger
 */
public class Second {
    public static void main(String[] args) {
        System.out.println(first.First.f(3));
    }
}

class Foo {
    public static void g() {
        System.out.println("g");
    }
}