public class Threads {
    public static void main(String[] args) {
        Thread t1 = new MyThread();
        t1.start();
        Thread t2 = new Thread(() -> {
            while(true)
            try {
                Thread.sleep(250);
                System.out.println("bye");
            }catch(InterruptedException e) {
            }
        });
        t2.start();
    }
}

class MyThread extends Thread {
    public void run() {
        for (;;) {
            System.out.println("hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}