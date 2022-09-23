package session13;

/**
 *
 * @author dkruger
 */
public class Identity {
    public static void main(String [] args) {
        int a = 2;
        int b = 3; // every object has a unique identity (address in memory)
        String s1 = "abc";
        String s2 = "def";
        
        if (s1 == s2) { // if s1 is the same location (identity) as s2
            
        }
        String s3 = "abc";
        if (s1 == s3) { // s1 IS the same object as s3 (optimization)
            System.out.println("same");
        }
        String s4 = "ab" + "c"; // SAME THING
        String s5 = "ab";
        s5 += "c";
        if (s1 != s5) {
            System.out.println("DIFFERENT OBJECTS!");
        }
        if (s1.equals(s5)) {
            System.out.println("Same letters");
        }

        Integer i1 = 5; // new Integer(5);
        Integer i2 = new Integer(5);
        System.out.println((i1 == i2) + "\t" + i1.equals(i2));
        i2 = i1;
        System.out.println(i1 == i2);
        int p = 5;
        int q = p;
    
        
    }
}
