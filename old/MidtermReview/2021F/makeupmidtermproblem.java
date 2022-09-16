public class makeupmidtermproblem {
	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<>();
		animals.add(new Cow("Mabel"));
	}
}

abstract class A {
	private int x;
	public A(int x) { this.x = x; }
	public abstract void f();
}

abstract class B extends A {  // because we inherit f()
	private int y;
	public B(int x, int y) {
		super(x);________________

     this.y = y;_______________
		}
  }
}

class C extends B {
	public C(int x, int y) {
		super(x,y);
		
	}
	public void f() {}
}

interface D {
  public void f();
}

A a1;
A a2 = null;
A a3 = new A(2); // ILLEGAL not allowed to instantiate an abstract class
A a4 = new B(1,2); // ILLEGAL
B b1 = new B(2,3); // ILLEGAL
C c1 = new C(2,3); // LEGAL

D d1; // LEGAL
D d2 = new C(); //


public abstract class Animal {
	private String name;
	public Animal(String name) { this.name = name; }
	public abstract void noise();
}

public class Cow extends Animal {
  public void noise() {
		System.out.println("Moo");
		public Cow(String name) { super(name); }
		
}

	public class Tiger extends Animal {
  public void noise() {
		System.out.println("Meow");
}


		
