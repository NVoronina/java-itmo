package homework13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadQueue {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 2; i++) {
            threadPool.submit(new Name());
        }

        threadPool.shutdown();
    }

    static class Name implements Runnable {
        boolean queue = false;

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                synchronized(this) {
                    while (queue) {
                        try {
                            wait(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    queue = true;

                    System.out.println(Thread.currentThread().getName());

                    queue = false;
                    notifyAll();
                }
            }
        }
    }
}
