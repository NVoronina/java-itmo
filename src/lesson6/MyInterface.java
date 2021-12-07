package lesson6;

public interface MyInterface {
    public static String name = "Natali";
    public abstract void print();
    String string();
    default void anotherMethod() {
        // нужна реализация
    }
    private static void staticMethod() {
        // можно реализовать
    }
    void myMethod();
}
