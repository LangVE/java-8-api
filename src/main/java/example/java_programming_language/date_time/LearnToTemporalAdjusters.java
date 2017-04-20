package example.java_programming_language.date_time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * Created by langve on 2017. 4. 17..
 */
public class LearnToTemporalAdjusters {

    public static void main(String[] args) {
        testAdjusters();
    }

    public static void testAdjusters() {
        //Get the current date
        LocalDate date1 = LocalDate.now();
        System.out.println("Current date: " + date1);

        //get the next tuesday
        LocalDate nextTuesday = date1.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println("Next Tuesday on : " + nextTuesday);

        //get the second saturday of current month
        LocalDate firstDayOfcurrentMonth = LocalDate.of(date1.getYear(), date1.getMonth(), 1);
        LocalDate secondSaturday = firstDayOfcurrentMonth.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY)).with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println("Second Saturday on : " + secondSaturday);
        LocalDate secondSaturday1 = firstDayOfcurrentMonth.with(TemporalAdjusters.next(DayOfWeek.SATURDAY)).with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println("Second Saturday1 on : " + secondSaturday1);
    }
}
