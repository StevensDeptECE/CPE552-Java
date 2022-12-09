public class WriteMemory implements Runnable {
    private byte[] b;
    private int numBytes;
    private int numIterations;
    public WriteMemory(int numBytes, int numIterations) {
        this.numBytes = numBytes;
        this.numIterations = numIterations;
        this.b = new byte[numBytes];
    }

    public void run() {
        byte[] b = new byte[numBytes];
        for (byte i = 0; i < numIterations; i++) {
            for (int j = 0; j < numBytes; j++)
                b[j] = i;
        }
    }





    public static void main(String[] args) {
        final int numBytes = 1024*1024*256;
        final int numIterations = 50;
        Thread t1 = new Thread(new WriteMemory(numBytes, numIterations));
        Thread t2 = new Thread(new WriteMemory(numBytes, numIterations));
        Thread t3 = new Thread(new WriteMemory(numBytes, numIterations));
        Thread t4 = new Thread(new WriteMemory(numBytes, numIterations));

        long tstart = System.nanoTime();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        long tend = System.nanoTime();
        System.out.println((tend-tstart)*1e-9);
    }
}
