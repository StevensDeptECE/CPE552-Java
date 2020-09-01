public class LinkedList {
  private static class Node { // LinkedList.Node
    int v;
    Node next;
    public Node(int v, Node n) { this.v = v; next = n; }
  }

  private Node head;

  public LinkedList() { head = null; }
  public void addFirst(int v) {
    head = new Node(v, head);
  }
  public static void main(String[] args) {
    LinkedList a = new LinkedList();
    a.addFirst(3);
    a.addFirst(1);
  }
}

