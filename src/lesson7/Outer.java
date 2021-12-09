package lesson7;

public class Outer {
    int a = 0;
    int b = 0;
    static String name = "Nataly";

    void sum (final int x, final int y) {
        this.a = x;
        this.b = y;
        Inner inner = new Inner();
        inner.display();
        Outer.Inner inner2 = new Outer.Inner();
    }

    class Inner {
        void display() {
            System.out.println("sum " + (a + b));
        }
    }

    public static void main(String[] args) {
        new Outer().sum(4, 5);
        NestedStaticClass.methodInNested();
    }

    public static class NestedStaticClass {
        static void methodInNested() {
            System.out.println("Hello World! My name is " + name);
        }
    }
}
