package example.java_programming_language.date_time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Created by langve on 2017. 4. 17..
 */
public class LearnToChronoUnit {
    public static void main(String[] args) {
        testChronoUtit();
    }
    public static void testChronoUtit() {
        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);

        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("nextWeek = " + nextWeek);

        LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
        System.out.println("nextMonth = " + nextMonth);

        LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
        System.out.println("nextYear = " + nextYear);

        LocalDate nextDecade = today.plus(1, ChronoUnit.DECADES);
        System.out.println("nextDecade = " + nextDecade);
    }
}
