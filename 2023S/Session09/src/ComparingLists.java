import java.util.ArrayList;

public class ComparingLists {
    public static void main(String[] args) {
        int x[] = new int[10];
        for (int i = 0; i < x.length; i++)
            x[i] = new Integer(5); // don't do this! creates object, autounboxes, throws it out

        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 1; i <= 10; i++)
            a.add(i); // new Integer(i)
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < a.size(); i++)
            b.add(a.get(i).intValue() + 1);
        for (int i = 0; i < a.size(); i++)
            System.out.print(a.get(i).compareTo(b.get(i)) + " ");
    }
}
