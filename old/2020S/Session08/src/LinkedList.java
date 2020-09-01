/**
 *
 * @author dkruger
 */
public class LinkedList {
    private class Node {//INNER CLASS (POINTER TO LINKEDLIST
       int val;
       Node next;
       Node(int v, Node n) { 
           val = v; next = n;
       }
    }
    private Node head;
    public LinkedList() {
        head = null;
    }
    public void addFront(int v) {
        head = new Node(v, head);
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for (int i = 0; i < 10000; i++)
            list.addFront(i);// warmup
        list = new LinkedList();
        long t0 = System.nanoTime();
        for (int i = 0; i < 5000000; i++)
            list.addFront(i);
        long t1 = System.nanoTime();
        System.out.println("Elapsed: " + (t1-t0)*1e-9);
    }
}
