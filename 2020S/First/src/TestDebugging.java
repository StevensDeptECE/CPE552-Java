/**
 *
 * @author dkruger
 */
public class TestDebugging {
    public static void main(String[] args) {
        float sum = 0.0f;
        for (long i = 1; i <= 80000; i++) {
            if (i > 79999)
                System.out.print(i + " ");
            sum += 1.0 / (i*i);
        }
        System.out.println(Math.sqrt(6*sum));        
    }
}
