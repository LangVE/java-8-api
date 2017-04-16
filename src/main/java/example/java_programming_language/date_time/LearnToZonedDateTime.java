package example.java_programming_language.date_time;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Created by sun on 2017-04-16.
 */
public class LearnToZonedDateTime {
    public static void main(String[] args){
        testZonedDateTime();
    }
    private static void testZonedDateTime(){

        ZonedDateTime date1 = ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
        System.out.println("date1: " + date1);

        ZoneId id = ZoneId.of("Europe/Paris");
        System.out.println("ZoneId: " + id);

        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("Current Zone: " + currentZone);
    }
}
