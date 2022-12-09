public class Main {
/*
    Multithreading: each thread has a point of execution, and a stack





 */

   public static double fact(int n) {
       if (n <= 1)
           return 1;
       return n * fact(n-1);
   }

   public static int count(int n) {
       if (n == 0)
           return 0;
       return 1 + count(n-1);
   }



    public static void main(String[] args) {
       Thread t1 = new Thread() {
           public void run() {
               for (;;) {
                 System.out.println("bye");
                 try { Thread.sleep(1600); } catch (Exception e) {}
               }
           }

       };
        for (;;) {
            System.out.println("hello");
            try { Thread.sleep(1000); } catch (Exception e) {}
        }

    }
}