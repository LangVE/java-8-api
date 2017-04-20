package example.java_programming_language.date_time;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * Created by langve on 2017. 4. 17..
 */
public class LearnToBackwardCompatibility {
    public static void main(String args[]) {
        testBackwardCompatability();
    }

    public static void testBackwardCompatability() {
        Date currentDate = new Date();
        Instant nowInstant = currentDate.toInstant();
        ZoneId currentZone = ZoneId.systemDefault();

        LocalDateTime localDateTime = LocalDateTime.ofInstant(nowInstant, currentZone);
        System.out.println("localDateTime = " + localDateTime);
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(nowInstant, currentZone);
        System.out.println("zonedDateTime = " + zonedDateTime);
    }
}
