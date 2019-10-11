public __________ A { // interface
	public void f();
}

public ____________ B ____________ A { // abstract class, implements
	private int x;
	public B() {x = 0; }
}

public ___________ C ___________ B { // abstract class, extends
	public abstract void g();
	public void f() {}
}

public _________ D {
	public void f();
	public void g();
}
public _______ E __________ D {
	public void f() {}
}

public _______ F __________ D {
	public void g() {}
}

public class G __________ E {
	public void g() {}
}
