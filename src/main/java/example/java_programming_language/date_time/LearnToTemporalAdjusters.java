package example.java_programming_language.date_time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * Created by sun on 2017-04-16.
 */
public class LearnToTemporalAdjusters {

    public static void main (String[] args){
        testTemporalAdjusters();
    }

    private static void testTemporalAdjusters(){
        LocalDate date1 = LocalDate.now();
        System.out.println("current date: " + date1);

        LocalDate nextTuesday = date1.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println("next tuesday: " + nextTuesday);

        LocalDate firstInYear = LocalDate.of(date1.getYear(), date1.getMonth(), 1);
        System.out.println("first in year: " + firstInYear);

        // nextOrSame 일 경우 기준일이 토요일일 경우 변화 없음
        LocalDate secondSaturday = firstInYear.with(TemporalAdjusters.next(DayOfWeek.SATURDAY))
                                            .with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println("second saturday: " + secondSaturday);
    }
}
