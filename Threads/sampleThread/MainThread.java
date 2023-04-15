package Threads.sampleThread;

public class MainThread {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            CounterThread cntObj = new CounterThread(i);
            Thread t = new Thread(cntObj);
            t.start();
        }
    }
}
