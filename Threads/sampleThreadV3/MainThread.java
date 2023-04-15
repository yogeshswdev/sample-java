package Threads.sampleThreadV3;

public class MainThread {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            // CounterThread cntObj = new CounterThread(i);
            // Thread t = new Thread(cntObj);
            // t.start();

            // new Thread(new CounterThread(i)).start();

            int num = i;

            new Thread(new Runnable() {
                public void run() {
                    // print thrad number and counter
                    System.out.println("Hello " + Thread.currentThread().getName() + "number " + num);
                }
            }).start();
        }
    }
}
