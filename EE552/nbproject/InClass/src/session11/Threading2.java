package session11;

/**
 * @author dkruger
 */
public class Threading2 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Hello", 1000);
        MyThread t2 = new MyThread("Goodbye", 2000);
        t1.start();
        t2.start();
//        t1.join(); // this would wait for thread 1 to complete
        System.out.println("Quitting");
    }
}

class MyThread extends Thread {
    private String msg;
    private int delay;
    
    public MyThread(String msg, int delay) {
        this.msg = msg;
        this.delay = delay;
    }

    @Override
    public void run() {
        for (;;) {
            System.out.println(msg);
            try {
                Thread.sleep(delay);
            } catch(Exception e) {
            }
        }
    }
}