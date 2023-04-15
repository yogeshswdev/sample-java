package Threads.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainThread {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 100; i++) {
            CounterThread cntObj = new CounterThread(i);
            executor.execute(cntObj);
        }
    }

}
