package example.java_programming_language.type_annotations;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.jetbrains.annotations.NotNull;


/**
 * Created by 이영호 on 2017-04-13.
 */
public class LearnToTypeAnnotations {
    @NonNull
    public static String nonnullValue = null;

    public static void main(String[] args) {
        @NotNull
        String nnobj = null;

        nnobj.toString();
        if (nonnullValue != null)
            nonnullValue.toString();
    }
}
