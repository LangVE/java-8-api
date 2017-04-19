package example.java_programming_language.type_annotations;

/**
 * Created by interpark on 2017-04-13.
 */
// Step 1 : Declare a Repeatable Annotation Type

import java.lang.annotation.Repeatable;

@Repeatable(Schedules.class)
public @interface Schedule {
    String dayOfMonth() default "first";

    String dayOfWeek() default "Mon";

    int hour() default 12;
}

// Step 2 : Declare the Containing Annotation Type
@interface Schedules {
    Schedule[] value();
}