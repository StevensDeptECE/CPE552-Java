/**
 *
 * @author dkruger
 */
public class LinkedList {
   //private class Node { // an inner class always has a pointer to the outer object     
   //}
   
   private static class Node { // this one does not (static inner class)
       int val;
       Node next;
   }
   private Node head; // initialized to binary zero
   
   public LinkedList() {
      head = null;
   }
   
   public void add(int v) {
       Node n = new Node();
       n.val = v;
       n.next = head;
       head = n;
   }
   
   public static void main(String[] args) {
       // class
       // abstract class (class which cannot be instantiated)
       // interface (abstract class with no data, no methods)
       // inner class (has pointer to outer class)
       // anonymous inner class new ActionListener() {
       
       // static inner class (no pointer to outer class)
       
        LinkedList myList = new LinkedList();
        myList.add(3);
        myList.add(1);
        myList.add(4);
        
        
        
   }
}
