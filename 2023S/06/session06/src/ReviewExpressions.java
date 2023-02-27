public class ReviewExpressions {
    public static void main(String[] args) {
        int a = 3 / 2 * 3;
        int b = 2 % 3 * 4;
        double c = 3 / 2;
        double d = 3 / 4 * 5;
        double e = 1 + 1e-50;
        boolean b1 = e == 1; // true!!! Ouch

        float sum1 = 0, sum2 = 0;
        for (int i = 1; i <= 100; i++)
            sum1 += 1.0/i;

        for (int i = 100; i > 0; i--)
            sum2 += 1.0/i;
        boolean b2 = sum1 == sum2;
        // a + b + c != a + (b + c) in floating point (associativity is NOT PRESERVED)
        int f = 5 % 8 + 6 % 8 + 8 % 8 + 9 % 8;
        System.out.println(1 + "/" + 2);
        System.out.println(1 + 2 + "/");
    }
}
