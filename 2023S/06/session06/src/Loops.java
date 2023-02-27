public class Loops {

    public static void main(String[] args) {
        // 1. write a function to sum integers from a to b inclusive. FOr example
        // sum(3, 5) = 3 + 4 + 5 = 12
        System.out.println(sum(15, 19));

        int a = 11;
        for (int i = 3; i < 22; i += 4)
            a += i;
        System.out.println(a);

        int b = 3;
        for (int i = 3; i < 22; i += 4)
            if (i < 8)
                b *= i;
             else
                 b++;
        System.out.println(b);

    }


}
