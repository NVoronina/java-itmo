package lesson10;

import java.io.*;
import java.net.URI;
import java.nio.file.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File("/Users/nvoronina/Projects/java-itmo/src/lesson10/a.txt");
//        File fileOut = new File("/Users/nvoronina/Projects/java-itmo/src/lesson10/out.txt");
//        try (InputStream is = new FileInputStream(file)){
//            OutputStream os = new FileOutputStream(fileOut);
//
//            while (is.available() > 0) {
//                os.write(is.read());
//            }
//            is.close();
//            os.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        List<String> str = new ArrayList<>();
//        str.add("Ggggg");
//        str.add("ppppp");
//        str.add("fffff");
//        writeData(str);
//
//        String txt = null;
//        StringBuilder builder = new StringBuilder();
//        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
//            while ((txt = reader.readLine()) != null) {
//                builder.append(txt);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(builder);
        pathExample();
    }

    public static void writeData(List<String> stringList) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/nvoronina/Projects/java-itmo/src/lesson10/out2.txt"))) {
            for(String s : stringList) {
                writer.write(s + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void pathExample() {
        Path path = Paths.get("/Users/nvoronina/Projects/java-itmo/src/");
        String[] list = path.toFile().list();
        System.out.println(Arrays.toString(list));
        System.out.println(path.getFileSystem());
        System.out.println(path.toFile().getUsableSpace());
        System.out.println(new DecimalFormat("#.##")
                .format(path.toFile().getTotalSpace() * 1.0 / 1000000000) + " GB");
    }
}
