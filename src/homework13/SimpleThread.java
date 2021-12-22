package homework13;

public class SimpleThread extends Thread {

    /**
     * 1.Напишите программу, в которой запускается 10 потоков и каждый из них выводит числа от 0 до 100.
     * 2.Выведете состояние потока перед его запуском, после запуска и во время выполнения.
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(new SimpleThread());
            System.out.println(t.getState());
            t.start();
            System.out.println(t.getState());
        }
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getState() + " " + i);
        }
    }
}
