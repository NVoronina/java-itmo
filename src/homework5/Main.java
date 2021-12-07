package homework5;

import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println(longStringSearch(new String[]{"test", "long", "superLong", "wo"}));
        System.out.println(isReversedEquals("Мем"));
        System.out.println(censure("всякая бяка нам тут не нужна. Бяка!"));
        System.out.println(substrCounter("всякая бяка нам тут не нужна. Бяка!", "Бяка"));
        reverseWords("This is a test string");
    }

    /**
     * 1.	Написать метод для поиска самой длинной строки.
     * @param array String[]
     * @return string
     */
    private static String longStringSearch(String[] array) {
        String maxLength = "";
        for (String a: array) {
            if (a.length() > maxLength.length()) {
                maxLength = a;
            }
        }
        return maxLength;
    }

    /**
     2.	Написать метод, который проверяет является ли слово палиндромом.
     * @param str String
     * @return boolean
     */
    private static boolean isReversedEquals(String str) {

        str = str.toLowerCase();
        return str.equals((new StringBuilder(str)).reverse().toString());
    }

    /**
     3.	Напишите метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]».
     * @param str String
     * @return String
     */
    private static String censure(String str) {

        return str.replaceAll("(?iu)бяка", "[вырезано цензурой]");
    }

    /**
     4.	Имеются две строки. Найти количество вхождений одной (являющейся подстрокой) в другую.
     * @param str String
     * @param needle String
     * @return int
     */
    private static int substrCounter(String str, String needle) {
        str = str.toLowerCase();
        needle = needle.toLowerCase();

        return str.split(needle).length - 1;
    }

    /**
     5.	Напишите метод, который инвертирует слова в строке. Предполагается, что в строке нет знаков препинания, и слова разделены пробелами.
         Sample Output:
         The given string is: This is a test string
         The string reversed word by word is:
         sihT si a tset gnirts
     * @param str String
     */
    private static void reverseWords(String str) {
        System.out.println("The given string is: " + str);
        String[] array = str.split(" ");
        String result = "";
        for (String a : array) {
            result = result.concat(new StringBuilder(a).reverse().toString()).concat(" ");
        }
        System.out.println("The string reversed word by word is: \n" + result.trim());

    }
}
