package sessionobjectorientedbasics;

/**
 *
 * @author dkruger
 */
public class StringEfficiency {
    public static void main(String[] args) {
/*
        String s = "";
        // O(n^2)
        for (int i = 0; i < 1000000; i++) /// 10 + 100 + 1000 + ... + 6000000
          s = s + i;
        // s="0123456789" + 10 "012345678910"
        System.out.println(s);
        */
        
       StringBuilder b = new StringBuilder();
        for (int i = 0; i < 1000000; i++) /// 10 + 100 + 1000 + ... + 6000000
          b.append(i);
       System.out.println(b.toString());        
    }
}
