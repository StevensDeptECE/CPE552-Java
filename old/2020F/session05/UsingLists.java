import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UsingLists {
    static void buildList(List<Integer> list) {
        for (int i = 0; i < 1000000; i++)
          list.add(i);
    }


    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<>(); // a single block of contiguous memory (a growable array)
        num1.add(5);
        num1.add(6);
        num1.add(7);
        buildList(num1);

        LinkedList<Integer> num2 = new LinkedList<>();
        num2.add(5);
        num2.add(6);
        num2.add(7);
        buildList(num2);

    }
}
