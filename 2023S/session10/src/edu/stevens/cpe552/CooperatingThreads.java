package edu.stevens.cpe552;

public class CooperatingThreads {
    public static void main(String[] args) throws Exception {
        MyComputeThread t1 = new MyComputeThread(1, 50000);
        MyComputeThread t2 = new MyComputeThread(50001, 100000);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        // you will not be here until both threads complete
        int answer = t1.getAnswer() + t2.getAnswer();
    }
}

class MyComputeThread extends Thread {
    private int a,b;
    private int answer;
    public MyComputeThread(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int getAnswer() { return answer; }
    public void run() {
        System.out.println("a=" + a + " b=" + b);

    }

}
