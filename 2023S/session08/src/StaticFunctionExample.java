public class StaticFunctionExample {
    private int x;
    public StaticFunctionExample(int v) { x = v; }
    public static void hello() {
        System.out.println("hello");
    }
    public void f() {
        System.out.println("f" + x);
    }
    public static void main(String[] args) {
        StaticFunctionExample a = new StaticFunctionExample(3);
        a.f(); //3
        StaticFunctionExample b = new StaticFunctionExample(5);
        b.f(); //5
        hello();
        StaticFunctionExample.hello();
    }
}
/*
   StaticClasses.main(  )



 */
