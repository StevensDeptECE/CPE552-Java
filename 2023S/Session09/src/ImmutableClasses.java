public class ImmutableClasses {
    public static void main(String[] args) {
        int z = 2 + 3; // compiler eliminates constant expressions 5

        String a = "abc"; // strings are immutable (cannot change)

        a = a + "d"; // s = "abcd"
        String b = a.replace("a", "x");
        System.out.println(a);
        System.out.println(b);

        String a2 = a;// a2 is the same object as a
        if (a == a2) {
            System.out.println("a == a2: Same object");
        }

        String a3 = a + "";
        if (a == a3) {
            System.out.println("a == a3: Same object");
        } else {
            System.out.println("NOT THE SAME");
            System.out.println("a.equals(a3)" + a.equals(a3));
        }

        int x = 2, y = 2;
        if (x == y) {
            System.out.println("Equality for integers is different");
        }



        String s1 = "abc";
        String s2 = "ab" + "c"; // "abc"  for strings only, they remove duplicates
        String s3 = "a" + "b" + "c"; // "abc"
        String s4 = "ab";
        s4 += "c";
        String s5 = "ab" + "c" + ""; // "abc"
        System.out.println("s1==s2" + (s1==s2));
        System.out.println("s1==s3" + (s1==s3));
        System.out.println("s1==s3" + (s1==s4));

        //IMMUTABLE: SLOW
        String s = "";
        for (int i = 0; i < 10000; i++)
            s += i;

        // not immutable. MUCH FASTER
        StringBuilder sb = new StringBuilder(60000);
        for (int i = 0; i < 10000; i++)
            sb.append(i);
    }
}
