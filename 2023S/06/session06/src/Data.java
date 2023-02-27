import java.sql.Array;
import java.util.*;

public class Data {
    public static void main(String[] args) {
//        Vec3d v; // v= null
//        v.x = 5;
        int a; // on the stack
        double b = 2.5; // on the stack
        int[] c = new int[100];
        c[0] = 23;
        c[1] = 419;
        c[99] = 555000;

        System.out.println(c[5]);



        c = new int[10];
        // no one is looking at array[100]

        c = null; // no one is looking at the array [10] elements
        System.gc();

        c = new int[100];
        for (int i = 0; i < 100; i++)
            c[i] = i;
        c[100] = 592;
        //Out of Bounds Exception: c[101] ++;
        int x = 5;
        Integer y = 4; // y = new Integer(4);

        ArrayList<Integer> list = new ArrayList<>(  q00); // default size=10
        for (int i = 0; i < 100; i++) {
            list.add(i); // it grows! // autoboxing
//            list.add(new Integer(i));
        }
        ArrayList<String> words = new ArrayList<>();
        words.add("hello");
        words.add(String.valueOf(5));

        //HashMap<String, Double> quotes = new HashMap<>();
        //    quotes.put("AAPL", 154.23);
    }
}
