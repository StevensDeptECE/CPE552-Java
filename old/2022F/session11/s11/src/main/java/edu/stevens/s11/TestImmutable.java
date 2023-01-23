package edu.stevens.s11;

/**
 * @author DovKr
 */
public class TestImmutable {
  public static void main(String[] args) {
    String s1 = "abc";
    String s2 = s1;
    System.out.println((Object)s1);
    s1 = s1 + "d";
    System.out.println(s1 == s2);
    System.out.println(s1.hashCode());
    s1 += "e";
    System.out.println((Object)s1);
    Integer i1 = 3; // Integer is IMMUTABLE
    System.out.println((Object)i1);
    Integer i2 = i1;
    i1 = 4;
    System.out.println((Object)i1);
    System.out.println(i1 == i2);
    i1 = i1 + 3;
    System.out.println((Object)i1);
  }
}
