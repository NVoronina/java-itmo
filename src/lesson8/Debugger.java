package lesson8;

public class Debugger {
    public static void main(String[] args) {
        someProg();
    }
    public static void someProg() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
