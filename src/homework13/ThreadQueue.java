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

        private boolean queue = false;

        @Override
        public void run() {
            while (true) {
                synchronized(this){
                    while (queue) {
                        try {
                            System.out.println("start wait");
                            wait();
                        } catch (InterruptedException e) {
                            System.out.println("something wrong");
                        }
                    }
                    queue = true;
                    System.out.println(Thread.currentThread().getName());
                }
                queue = false;
                notifyAll();
                System.out.println(queue);
            }
        }
    }

}
