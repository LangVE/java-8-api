package example.java_programming_language.date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * Created by langve on 2017. 4. 17..
 */
public class LearnToLocalDataTime {
    public static void main(String[] args) {
        LearnToLocalDataTime learnToLocalDataTime = new LearnToLocalDataTime();
        learnToLocalDataTime.testLocalDateTime();
    }

    public void testLocalDateTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current DateTime : " + currentDateTime);

        LocalDate date1 = currentDateTime.toLocalDate();
        System.out.println("date : " + date1);

        Month month = currentDateTime.getMonth();
        int monthValue = currentDateTime.getMonthValue();
        int day = currentDateTime.getDayOfMonth();
        int seconds = currentDateTime.getSecond();

        //Month: APRIL, day: 17, seconds: 2
        System.out.println("Month: " + month + ", monthValue: " + monthValue + ", day: " + day + ", seconds: " + seconds);

        LocalDateTime date2 = currentDateTime.withDayOfMonth(10).withYear(2012);

        System.out.println("date2 : " + date2);

        //12 december 2014
        LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
        System.out.println("date3: " + date3);

        //22 hour 15 minutes
        LocalTime date4 = LocalTime.of(22, 15);
        System.out.println("date4: " + date4);

        //parse a string
        LocalTime date5 = LocalTime.parse("20:15:30");
        System.out.println("date5: " + date5);
    }
}
