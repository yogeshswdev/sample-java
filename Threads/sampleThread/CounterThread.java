package Threads.sampleThread;

public class CounterThread implements Runnable {
    int num;

    CounterThread(int numPa) {
        num = numPa;
    }

    @Override
    public void run() {
        // print thrad number and counter
        System.out.println("Hello " + Thread.currentThread().getName() + "number " + num);

    }

}
