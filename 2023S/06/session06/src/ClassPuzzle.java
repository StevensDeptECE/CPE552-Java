public class ClassPuzzle {
    private int x;

    public ClassPuzzle(int a, int b) {
        x = a + b;
        System.out.print("CP" + x);
    }
    public ClassPuzzle(int a) {
        x = a - 1;
        System.out.print("X" + x);
    }
    public String toString() {
        return "hello";
    }
    public void f() {
        System.out.print("x");
    }
    public static void main(String[] args) {
        ClassPuzzle cp = new ClassPuzzle(5,4);
        cp.f();
        ClassPuzzle c2 = new ClassPuzzle(3);
        cp2.f();
        B b1 = new B(2,6);
        b1.f();
        System.out.println(b1);
    }

}

class B extends ClassPuzzle {
    public B(int a, int b) {
        super(a,b);
        System.out.print("q");
    }
    public String toString() {
        return x + "?";
    }
    public void f() {
        System.out.print("y");
        super.f();
    }
}
