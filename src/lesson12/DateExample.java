package lesson12;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateExample {
    public static void main(String[] args) {
        Date date = new Date();
//        System.out.println(date);
//        date.setTime(0);
//        System.out.println(date);
//        System.out.println((new Date().getTime() - date.getTime()) * 1.0 / 1000 / 60 / 60 / 24 / 365);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(new Date());
        System.out.println(calendar);

        Calendar calendar1 = Calendar.getInstance();
        LocalDateTime dateLocal = LocalDateTime.now();
        LocalDateTime dateLocalSome = LocalDateTime.of(2021, 6, 5, 12, 30);
        System.out.println(dateLocalSome.minusDays(200));

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateFormat.format(date));


    }
}
