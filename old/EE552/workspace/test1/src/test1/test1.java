package test1;

public class test1 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 10; i++) {
			if (i == 9) {
				System.out.println("PROBLEM");
				
			}
			sum += i;
		}
		System.out.println(sum);
	}
}
