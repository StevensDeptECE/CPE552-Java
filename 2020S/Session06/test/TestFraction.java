/**
 *
 * @author dkruger
 */
public class TestFraction {
    public static void main(String[] args) {
        Fraction a = new Fraction(1,2);
        Fraction b = new Fraction(3); // 3/1
        Fraction c = new Fraction(); // 0/1
        
        System.out.println(a); // 1/
/*
        bad idea: do not build a big string out of pieces
        (immutable)
        String s = "";
        for (int i = 0; i < 10000; i++)
            s = s + a.toString();
        System.out.println(s);
*/
        StringBuilder sb = new StringBuilder(300000);
        for (int i = 0; i < 100000; i++)
            a.append(sb);
        //System.out.println(sb.toString());


}    
}
