import java.util.*;

public class Optimization {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>();
        final int n = 1000000;
        for (int i = 0; i < n; i++)
            x.add(i);
        //remove even elements from array
//        for (int i = 0; i < n/2; i++)
//            x.remove(i);

        int j = 0;
        for (int i = 0; i < x.size(); i++)
            if (i % 2 != 0) { // 1, 3, 5, 7 ...
                x.set(j, x.get(i));
                j++;
            }
        for (int i = n-1; i > n/2; i--)
            x.remove(i);
    }

}
