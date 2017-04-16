package example.java_programming_language.date_time;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * Created by sun on 2017-04-16.
 */
public class LearnToBackward {
    public static void main(String[] args){
        testBackward();
    }

    private static void testBackward(){
        Date currentDate = new Date();
        System.out.println("current date: " + currentDate);

        Instant now = currentDate.toInstant();
        ZoneId currentZone = ZoneId.systemDefault();

        LocalDateTime localDateTime = LocalDateTime.ofInstant(now, currentZone);
        System.out.println("local date: " + localDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(now, currentZone);
        System.out.println("zoned date: " + zonedDateTime);
    }
}
