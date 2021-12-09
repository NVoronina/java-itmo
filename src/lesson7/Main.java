package lesson7;

import lesson6.Movable;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            private int i = 0;

            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    i++;
                    System.out.println(i);
                    if (i == 5) {
                        break;
                    }
                }
            }
        });
        thread.start();
        Movable movable = new Movable() {
            @Override
            public void drive() {
                System.out.println("Drive");
            }
        };
    }
}
