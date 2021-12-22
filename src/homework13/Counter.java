package homework13;

import java.util.concurrent.Callable;

public class Counter implements Callable<Integer> {

    int count = 0;

    public void increment() {
        count++;
    }

    public Integer getCount() {
        return count;
    }

    @Override
    public Integer call() throws Exception {

        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < 1000; i++) {
            this.increment();
        }
        return this.getCount();
    }

}
