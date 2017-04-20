package example.java_programming_language.date_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * Created by langve on 2017. 4. 17..
 */
public class LearnToPeriodDuration {
    public static void main(String[] args) {
        testPeriod();
        testDuration();
    }

    public static void testPeriod() {

        //Get the current date
        LocalDate date1 = LocalDate.now();
        System.out.println("Current date: " + date1);

        //add 1 month to the current date
        LocalDate date2 = date1.plus(1, ChronoUnit.MONTHS).plus(1, ChronoUnit.DAYS);
        System.out.println("Next month: " + date2);

        Period period = Period.between(date1, date2);
        System.out.println("period = " + period);

        period = Period.between(date2, date1);
        System.out.println("period = " + period);
    }

    public static void testDuration() {
        LocalTime time1 = LocalTime.now();

        Duration twoHours = Duration.ofHours(2);
        LocalTime time2 = time1.plus(twoHours);
        Duration duration = Duration.between(time2, time1);

        System.out.println("duration = " + duration);
    }
}
