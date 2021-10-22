public class Follow1 {
	private int a, b;
	public Follow1(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("A");
	}

	public Follow1(int a) {
		this.a = a;
		this.b = 17;
		System.out.println("B");
	}
	public String toString() { return a + b + ""; }
	
	public static void main(String[] args) {
		Follow1 f = new Follow1(1,2);
		System.out.println(f);
		Child c = new Child(1,2,3);
		System.out.println(c);
	}
}

class Child extends Follow1 {
	private int c;
	public Child(int a, int b, int c) {
		super(a,b);
		this.c = c;
		System.out.println(c + 1);
	}
	public String toString() { return super.toString() + "c=" + c; }
}
