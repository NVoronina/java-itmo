package homework10;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> file1 = readFile("/Users/nvoronina/Projects/java-itmo/src/homework10/a.txt");
        System.out.println(file1);

        writeFile("Hello World", "/Users/nvoronina/Projects/java-itmo/src/homework10/out2.txt");
        ArrayList<String> file2 = readFile("/Users/nvoronina/Projects/java-itmo/src/homework10/out2.txt");

        System.out.println(concutFiles(file1, file2));
        changeNotSymbol("/Users/nvoronina/Projects/java-itmo/src/homework10/out2.txt");
    }

    /** 1.	Написать метод, который читает текстовый файл и возвращает его в виде списка строк. */
    private static ArrayList<String> readFile(String fileLink) {
        ArrayList<String> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileLink))) {
            String txt;
            while ((txt = reader.readLine()) != null) {
                result.add(txt);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    /** 2.	Написать метод, который записывает в файл строку, переданную параметром. */
    private static void writeFile(String str, String fileLink) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileLink))) {
            writer.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /** 3.	Используя решение 1 и 2, напишите метод, который склеивает два текстовый файла один. */
    private static ArrayList<String> concutFiles(ArrayList<String> file, ArrayList<String> file2) {
        file.addAll(file2);
        return file;
    }

    /** 4.	Написать метод который заменяет в файле все не символьные на знак ‘$’ */
    private static void changeNotSymbol(String fileLink) {
        ArrayList<String> file = readFile(fileLink);
        StringBuilder result = new StringBuilder();
        for (String row: file) {
            result.append(row.replaceAll( "[0-9A-zА-яЁё]", Matcher.quoteReplacement("$")));
        }
        writeFile(result.toString(), fileLink);
    }
}
