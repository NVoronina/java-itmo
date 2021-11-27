package homework1;

import java.util.Scanner;

public class InOut {

    public static void main(String[] args) {
        InOut.start();
    }

    private static void start() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextInt());
        }
    }
}
