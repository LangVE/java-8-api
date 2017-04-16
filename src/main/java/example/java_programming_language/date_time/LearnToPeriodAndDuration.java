package example.java_programming_language.date_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * Created by sun on 2017-04-16.
 */
public class LearnToPeriodAndDuration {
    public static void main(String[] args){
        testPeriod();
        testDuration();
    }

    private static void testPeriod(){
        LocalDate date1 = LocalDate.now();
        System.out.println("Current date: " + date1);

        LocalDate date2 = date1.plus(1, ChronoUnit.YEARS);
        System.out.println("next year: " + date2);

        Period period = Period.between(date2, date1);
        System.out.println("period: " + period);
    }

    private static void testDuration(){
        LocalTime time1 = LocalTime.now();
        Duration twoHours = Duration.ofMinutes(35);

        LocalTime time2 = time1.plus(twoHours);
        Duration duration = Duration.between(time2, time1);

        System.out.println("duration: " + duration);
    }
}
