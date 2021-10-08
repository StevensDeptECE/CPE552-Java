/**
 *
 * @author dkruger
 */
public class ClassExamples {
    
}

//class A$B { // why is this a very bad name
  // Don't do this!   
//}

class A {
    class B {
        
    }
}

class Thing {
}

class A {
    private int x;
    protected int y;
    int z;
    public int w;
            
    A() {
       Thing t = new Thing() { // name = A$1 
           public void myMethod() {}
       };
    }
    public void f() {
        
    }
}
