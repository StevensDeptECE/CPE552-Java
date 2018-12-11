package session06;

/**
 * @author dkruger
 */
public class S00_ReviewClassesAbstractAndInterfaces {
    public static void main(String[] args) {
        
        
    }
}


interface Y {
    public void y();
}

abstract class___________________________ X implements Y {
    private int x;
    public X() {}
    public int get() {
        return x;
    }
}

class F extends X {
    public void y() {
        
    }
}

F f1 = new F(5);


class A{
}

abstract class B {
   
}

interface ActionListener {
    public void actionPerformed(ActionEvent e);
}

class D implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        
    }
}
