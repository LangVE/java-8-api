package example.java_programming_language.date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * Created by sun on 2017-04-16.
 */
public class LearnToLocalDateTime {
    public static void main (String[] args){

        testLocalDateTime();
    }

    private static void testLocalDateTime() {
        LocalDateTime time = LocalDateTime.now();
        System.out.println("Current DateTime: " + time);

        LocalDate date1 = time.toLocalDate();
        System.out.println("date1: " + date1);

        Month month = time.getMonth();
        int day1 = time.getDayOfMonth();
        int day2 = time.getDayOfYear();
        int sec = time.getSecond();

        System.out.println("Month: " + month);
        System.out.println("day1: " + day1);
        System.out.println("day2: " + day2);
        System.out.println("sec: " + sec);

        LocalDateTime date2 = time.withDayOfMonth(10).withYear(2012);
        System.out.println("date2: " + date2);

        LocalDate date3 = LocalDate.of(2014, Month.APRIL, 16);
        System.out.println("date3: " + date3);

        LocalTime time2 = LocalTime.of(12, 19);
        System.out.println("time2: " + time2);

        LocalTime time3 = LocalTime.parse("20:15:19");
        System.out.println("time3: " + time3);
    }
}
