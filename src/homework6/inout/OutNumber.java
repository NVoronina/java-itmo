package homework6.inout;

import java.util.Scanner;

public class OutNumber extends InNumber {
    @Override
    protected void outNum() {
        super.outNum();
    }

    public OutNumber() {
        Scanner scanner = new Scanner(System.in);
        this.num = scanner.nextInt();
    }
}
