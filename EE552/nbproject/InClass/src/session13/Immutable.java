package session13;

/**
 * Demonstration of immutable objects (objects that do not change)
 * @author dkruger
 */
public class Immutable {
    
    String f(){
        StringBuilder temp = new StringBuilder();
        temp.append("this").append(num).append("that");
        return temp.toString();
        return "this" + num + "that";
    }
    String g() {
        return f() + h();
    }
    
    void f(StringBuilder b) {
        b.append("this").append(num).append("that");
    }
    void g(StringBuilder b) {
        f(b); h(b);
    }
    
    
    
    String a = "abc";
    a += "def";
    System.out.println(a);
    String s = "";
    for (int i = 0; i < 1000000; i++)
      s = s + 'a'; // 1 + 2 + 3 + 4 + ..n = n(n+1)/2

    StringBuffer buf = new StringBuffer(1024*1024);
      buf.append('a');
    String s2 = buf.toString();
    
    StringBuilder buf = new StringBuilder(1024*1024);
      buf.append('a');
    String s2 = buf.toString();
    
    
}
