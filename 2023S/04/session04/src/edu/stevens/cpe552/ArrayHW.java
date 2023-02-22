package edu.stevens.cpe552;

public class ArrayHW {

    // compute the mean (sum of elements / length)
    public static double mean(int[] x) {
        //TODO: compute the mean as double precision, it is not a whole number!
        return 0;
    }

    // function must use a loop, you cannot assume you know the length of the array
    public static void reverse(int x[]) {
        //TODO: reverse the array
        //TO do this you need to know how to swap two value
        int temp = x[0];
        x[0] = x[7]; //x[0]  =89
        x[7] = temp;
    }

    public static void print(int [] x) {
        for (int i = 0; i < x.length; i++)
            System.out.print(x[i] + " ");
        System.out.println();
    }


    public static void main(String[] args) {
        int[] x = {85, 90, 95, 96, 97, 81, 28, 89};
        double average = mean(x);
        System.out.println(average);
        reverse(x); // x should become 89, 28, 81, 97, 96, 95, 90, 85
        print(x);
        int[] y = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 9, 31, 1251, 2, 232};
        reverse(y);
        print(y);
    }


}
