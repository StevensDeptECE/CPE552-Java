public class MidtermReview {
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--)
            System.out.print(i);
        System.out.println();

        int sum = 3; // 3 + 1 + 2 + 3+4+5
        for (int x = 1; x <= 5; x++) // x=1,2,3,4,5,6
            sum += x;
        System.out.println(sum); //

    }
}

/*
  10
  9
  8
  ...

 1 2 3 4 5
 2 4 6 8 10
 3 6 9 12 15
 4 8 12 16 20
 5 10 15 20 25



 */
