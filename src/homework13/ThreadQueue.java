package homework13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadQueue {

    /**
     * Напишите программу, в которой создаются два потока, каждый из которых выводит по очереди на консоль своё имя.
     * Начать можно с написания своего класс-потока, который выводит в
     * бесконечном цикле свое имя. Потом придется добавить синхронизацию с помощью wait() и notify().
     * @param args
     */
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
            while (true) {
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
