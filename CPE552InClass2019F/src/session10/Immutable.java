public class Immutable {
	public static void main(String[] args) {
		String s = "abc";

		s += "def";

		Integer i = new Integer(4);
		Integer i2 = 5;
		i2 = i2 + 3; // i2 = new Integer(i2.intValue() + 3)

		//identity
		int x = 2;
		int y = 3;
		System.out.println(x == y);
		Integer j = i;

		System.out.println(j==i); // same object!
		j = new Integer(4);
		System.out.println(j==i); // false
		System.out.println(j.equals(i)); // true


		String s1 = "abc";
		String s2 = "abc";
		int z = 2 + 3; // evaluates to constant 5
		System.out.println(s1==s2);// true
		String s3 = "ab" + "c"; // --> "abc"
		System.out.println(s1==s3);//true
		String s4 = "ab";
		System.out.println(s1.equals(s3));//true
		s4 += "c";
		System.out.println(s1==s4);
		String s5 = new String("abc");
		System.out.println(s1 == s5);
	}
}
