package sessionobjectorientedbasics;

/**
 * @author dkruger
 */
public class ThreadJoin {
    public static void main(String[] args) throws Exception {
        MyThread t = new MyThread(1,500);
        MyThread t2 = new MyThread(501,1000);
        t.start();
        t2.start();
        
        t.join();
        t2.join();
        // both threads have completed
        System.out.println(t.getResult());
        System.out.println(t2.getResult());
    }
    
    
    private static class MyThread extends Thread {
        private int start, end;
        private int result;
        public MyThread(int start, int end) { this.start = start; this.end = end; }
        public void run() {
            result = end;
        }
        public int getResult() { return result; }
    }
}
