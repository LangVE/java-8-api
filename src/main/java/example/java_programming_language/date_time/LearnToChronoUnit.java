package example.java_programming_language.date_time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Created by sun on 2017-04-16.
 */
public class LearnToChronoUnit {
    public static void main (String[] args){
        testChronoUnits();
    }

    private static void testChronoUnits(){
        LocalDate today = LocalDate.now();
        System.out.println("today: " + today);

        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("next week:" + nextWeek);

        LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
        System.out.println("next month: " + nextMonth);

        LocalDate nextDecade= today.plus(1, ChronoUnit.DECADES);
        System.out.println("next year: " + nextDecade);

        LocalDate nextCenturies = today.plus(1, ChronoUnit.CENTURIES);
        System.out.println("next centurie: " + nextCenturies);
    }
}
