package finalReview;

/**
 *
 * @author dkruger
 */
public class Regex {
    public static void main(String[] args) {
        int a = 0;
        int abc = 1;
        int abc123 = 2;
        int Abzzz_qqq = 3;
        int _abc = 4;
        Pattern p = Pattern.compile("[a-zA-Z_][\\w_]*");
        
        // /[aeiou][pxq]*    matches: a e i o u  ap ax aq ep ex eq eqqqxpxpxpxp
        
    }
    
}
