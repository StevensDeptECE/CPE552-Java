 ____________  A { // what is A?
	public void f();
}

 __________  B ________ A {
	public abstract void g();
	int x;
	B(int x) { this.x = x; }
}

______ C __________ B {
	public void f() { System.out.println("I implemented it!"); }
	public void g() { System.out.println("I implemented it!"); }
	C(int x) { ______ (x) }
}

______ D __________ B {
	public void g() { System.out.println("I implemented it!"); }
	D(int x) { ______ (x) }
}



class X  extends CLASS {}
class Z implements INTERFACE {}
