package homework13;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CounterThreadPool {

    final static int MAX_THREAD = 100;

    /**
     * Напишите программу, в которой запускается 100 потоков, каждый из которых вызывает метод increment() 1000 раз.
     * После того, как потоки завершат работу, проверьте, чему равен count . Если обнаружилась проблема, предложите ее решение.
     * @param args
     */
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(MAX_THREAD);

        ArrayList<Counter> listObj = new ArrayList<>();
        for (int i = 0; i < MAX_THREAD; i++) {
            listObj.add(new Counter());
        }
        int totalCount = 0;
        try {
            List<Future<Integer>> results = threadPool.invokeAll(listObj);
            for (Future<Integer> result : results) {
                System.out.println(totalCount += result.get());
            }
        } catch (InterruptedException|ExecutionException e) {
            e.printStackTrace();
        }
        threadPool.shutdown();
    }

}
