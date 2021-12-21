package lesson12;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaExample {
    public static void main(String[] args) {
        Function<Integer, Integer> multiply = x -> x * 2;
        Integer result = multiply.apply(50);

        BiFunction<Integer, Integer, Integer> division = (x, y) -> x / y;

        Integer result2 = division.apply(10, 2);
        System.out.println(result2);
    }
}
