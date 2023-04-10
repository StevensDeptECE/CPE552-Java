public class HW2IntList {
    private int[] a;

    public HW2IntList(int n) {
        a = new int[n];
    }

    int size() {
        return a.length;
    }
    public void set(int i, int v) {
        a[i] = v;
    }

    //O(n) bad! we need a better way
    public void add(int v) {
        int[] old = a; // remember the old one
        a = new int[old.length+1];
        for (int i = 0; i < old.length; i++)
            a[i] = old[i];
        a[old.length] = v;
    }
    public int get(int i) {
        return a[i];
    }
    public static void main(String[] args) {
        HW2IntList list1 = new HW2IntList(10);
        list1.set(0,5);
        System.out.println(list1.get(0));
        list1.set(1, 19);
        list1.set(11, 50);
        System.out.println(list1.get(12));
    }

}
