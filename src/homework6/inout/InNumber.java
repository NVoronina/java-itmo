package homework6.inout;

import java.util.Scanner;

public class InNumber {
    protected int num;

    public InNumber() {
        Scanner scanner = new Scanner(System.in);
        this.num = scanner.nextInt();
    }
}
