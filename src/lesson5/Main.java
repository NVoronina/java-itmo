package lesson5;

import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String string = "Java";
        String string2 = new String("Java");
        String string3 = "Java";

        System.out.println(string == string3);
        System.out.println(string == string2);
        System.out.println(string.equals(string2));

        String newString = string = string.concat(" ").concat("Wow");
        System.out.println(string);

        String path = "Java/JavaVirtualMachines/corretto-11.0.13/Contents/Home/bin/java ";
        char[] chars = path.toCharArray();
        String[] split = path.split("/");
        System.out.println(Arrays.toString(split));
        for (String s: split) {
            System.out.println(s);
        }
        path = path.trim();
        System.out.println(path);

        int length = path.length();
        System.out.println(length);

        System.out.println(path.substring(2, 15));
        System.out.println("ПриВетЪ".toLowerCase());
        System.out.println(path.toUpperCase());
        System.out.println("ПриВет".equalsIgnoreCase("Привет".toLowerCase()));
        System.out.println(path.contains("Java"));
        System.out.println(path.startsWith("Java"));
        System.out.println(path.endsWith("/"));
        printString("Hi");
        printString(null);
        System.out.println(path.matches("^Java(.*)"));
        System.out.println(path.replaceAll("a", "."));

        StringBuffer buffer = new StringBuffer();
        StringBuilder builder = new StringBuilder(path);
        builder
                .append("/localPath")
                .append("/oneMore")
        ;
        System.out.println(builder);
        System.out.println(builder.reverse());
        System.out.println(builder.insert(0, "INSERT_PATH/"));
        System.out.println(builder.delete(0, 12));

    }

    public static void printString(String str) {
        if (str != null && !str.isEmpty()) {
            System.out.println(str);
        }
    }
}
