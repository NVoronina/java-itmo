package lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        methodWithException();
    }

    public static void methodWithException() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = 0;
        try {
            input = Integer.parseInt(reader.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println(e.getMessage() + " " + e.getCause());
        } catch (Exception e) {
            System.out.println("Не смогла я, не смогла!");
        } finally {
            System.out.println("В любом случае");
        }
    }

    public static void exceptionMethod() throws NumberFormatException {
        throw new NumberFormatException("My Exception");
    }

    public static void devisionZero(int number) {
        System.out.println(number / 0);
    }
    public static void myExceptionMethod() throws MyLocalException {
        throw new MyLocalException("Wow");
    }
}
