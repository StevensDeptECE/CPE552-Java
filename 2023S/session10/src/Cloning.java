public class Cloning {
    public static void main(String[] args) throws Exception {
        A a1 = new A();
        a1.x = 2; a1.y = 3;
        A a2 = a1; // NOT A COPY
        a1.x = 9;
        System.out.println(a2.x); // should print 9

        A a3 = a1.clone(); // this makes a copy if you implement CLonable
        a1.y = 99;
        System.out.println(a3.y); // proof of copy
    }
}

class A implements Cloneable{
    int x,y;
    public A clone() throws CloneNotSupportedException {
//        A a = new A();
//        a.x = x;
//        a.y = y;
//        return a;
        return (A)super.clone();
    }
}
