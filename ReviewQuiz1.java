public ___class___  ReviewQuiz1 {
	__public___ static void main(__String[]args_____) {


	}
}

interface A {
	public void f() _;____
}

__interface______ B extends A {
  public void g();
}

___abstract class_____ C implements A {

}

___abstract class_____ D implements A {
	public void f() {
		System.out.println("test");
	}
}

___abstract class_____ E implements B {
	public void f() {
		System.out.println("test2");
	}
}

___class_____ F extends E {
	public void g() {
		System.out.println("test3");
	}
}
		
