package lesson13;

import homework13.SimpleThread;
import homework13.ThreadQueue;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 2; i++) {
            threadPool.submit(new Test());
        }

        threadPool.shutdown();
    }

    static class Test implements Callable {
        @Override
        public Object call() throws Exception {
            System.out.println(1);
            return null;
        }
    }
}
