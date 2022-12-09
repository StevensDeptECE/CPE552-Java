public class Primes extends Thread {
    private int start, step, end;
    private int result;
    public Primes(int start, int step, int end) {
        this.start = start;
        this.step = step;
        this.end = end;
    }
    public void run() {
        int count = 0;
        outer:
        for (int i = start; i <= end; i += step) {
            for (int j = 3; j < i; j++) {
                if (i % j == 0)
                    continue outer;
            }
            count++;
        }
        result = count;
    }
    int getCount() { return result; }

    public static void main(String[] args) {
        //count primes from 1 to n=1000000000
        int count = 1;        // 2 is prime
        int numCPUs = 4;
        int step = numCPUs * 2;
        int end = 400000;
        Primes p[] = new Primes[numCPUs]; // allocate numCPUs threads
        long t0 = System.nanoTime();
        for (int i = 0; i < numCPUs; i++) {
            p[i] = new Primes(3+2*i, numCPUs*2,end);
            p[i].start();
        }

        for (int i = 0; i < numCPUs; i++) {
            try {
                p[i].join();
            } catch(Exception e) {
                e.printStackTrace();
            }
            count += p[i].getCount();
        }
        long t1 = System.nanoTime();
        System.out.println(count);
        System.out.println((t1-t0)*1e-9);

    }



}
