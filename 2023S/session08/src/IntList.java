public class IntList {
    static class Node { // inner class points to the outer class
        int val;
        Node next;
    }
    Node head;

    public IntList() { head = null; } // list is empty
    public void add(int v) {
        Node n = new Node();
        n.val = v;
        n.next = head;
        head = n;

    }

    public static void main(String[] args) {
        IntList a = new IntList();
        for (int i = 0; i < 10; i++)
            a.add(i); // 0 1 2 3 4 5 6 7 8 9
    }
}
