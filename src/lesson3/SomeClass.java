package lesson3;

public class SomeClass {
    public static final String CONSTANT = "CONSTANT";
    private static String test;
    private String testNormal;

    static {
        System.out.println("===== static ======");
        test = "my";
        System.out.println(test);
        System.out.println("===== static ======");
    }
    {
        System.out.println("==== non static =====");
        testNormal = "nonStatic";
        System.out.println(testNormal);
        System.out.println("==== non static =====");
    }

    public static void main(String[] args) {
        printStatic();
        test = "rrr";
        printStatic();
        (new SomeClass()).printObjectProperty();
    }

    public static void printStatic() {
        System.out.println(test + " in static method");
    }

    public void printObjectProperty() {
        System.out.println("Non static call");
    }
}
