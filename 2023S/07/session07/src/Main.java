import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] a = {5, 4, 3, 2, 1}; // equivalent to new int[] {5,4,3,2,1};
        int a2[] = new int[100]; // all zeros
        boolean b[] = new boolean[5];
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i]);
        System.out.println();
        for (int x : a) { // python syntax
            System.out.print(x + " ");
        }
        ArrayList<String> d = new ArrayList<>();
        d.add("hello");
        d.add("bye");
        for (String s : d) {
            System.out.println(s);
        }

        // 1. Write a loop to sum array a using for (int i = ...
        // 2. Write a loop to sum array a using python-style for

        ArrayList<Integer> c = new ArrayList<>();
        // 3. write code to put the even numbers from 1 to 100 into the array (2,4,6,8,...100)
        // 4. write code to print out every element in the arraylist using for (int i = 0; ...
        // 5. write code to print out using python-style for

    }
}