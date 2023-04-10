public class IdentityComparison {
    public static void main(String[] args) {
        int[] a = new int[1000];
        for (int i = 0; i < 1000; i++)
            a[i] = i;
        float[] b = new float[1000];
        float x = 0;
        for (int i = 0; i < 1000; i++, x += 0.1)
            b[i] = x;
        for (float f : b) {
            if (Math.abs(f-10.5) < 0.00000001) {
                System.out.println(f);
            }
        }
        for (int i = 0; i < b.length; i++)
            if (Math.abs(b[i]-10.5) < 0.000001)
                b[i] = 9.8f;
    }
}
