/**
 *
 * @author dkruger
 */
public class ImmutablePractice {
  public static void main(String[] args) {
    // identity, immutability, comparison
    Integer a = 5; // new Integer(5);
    a = 6; // replace the old Integer (new Integer(6))
    int x = 5;
    
    x = 6;
    
    Double d = 2.3; // new Double(2.3)
    
    // the fact that Strings are immutable means sharing them is no problem
    String s1 = "abc"; // new String("abc");
    String s2 = "abc"; // s2 = s1
    s1 += "d"; // does not change s2 s1 = "abcd"

// this is slow because string is immutable    
    for (int i = 0; i < 10000; i++)
      s1 += i;
    
    // what do we do instead?
    StringBuilder b = new StringBuilder(10000 * 4);
    for (int i = 0; i < 10000; i++)
      b.append(i);
    System.out.println(b); // calls b.toString()
    Integer c = 6;
    System.out.println(a == c); // identity  NOT the same
    System.out.println(a.equals(c));
    System.out.println(a.intValue() == c.intValue());
    
    s1 = "abc";
    s2 = "abc";
    System.out.println(s1 == s2); // true
    String s3 = "ab" + "c";
    System.out.println(s1 == s3); // true
    String s4 = "ab";
    s4 += "c";
    System.out.println(s1 == s4); // false
    System.out.println(s1.equals(s4)); // true

    MyImmutableFoot mf1 = new MyImmutableFoot();
    MyImmutableFoot mf2 = new MyImmutableFoot();
    System.out.println(mf1 == mf2); // false
    System.out.println(mf1.equals(mf2)); // true (now that we wrote method equals)
    System.out.println(mf1.equals("test")); //IllegalCastException
  }
  
}


class MyImmutableFoot {
  private int x;
  public MyImmutableFoot() {
    x = 5;
  }
  public int getX() { return x; }
  public boolean equals(Object obj) {
    return x == ((MyImmutableFoot)obj).x;
  }
}