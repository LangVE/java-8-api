package example.java_programming_language.type_annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

/**
 * Created by interpark on 2017-04-13.
 */
public class LearnToRepeatableAnnotation {
    @Schedule(dayOfMonth="last")
    @Schedule(dayOfWeek="Fri", hour=23)
    public void doPeriodicCleanup() {
        System.out.println("hello");



    }

    public static void main(String[] args) throws NoSuchMethodException {


        LearnToRepeatableAnnotation learnToRepeatableAnnotation = new LearnToRepeatableAnnotation();
        Method m = learnToRepeatableAnnotation.getClass().getMethod("doPeriodicCleanup", null);
        Schedules s = m.getAnnotation(Schedules.class);
        s.value();
    }
}
