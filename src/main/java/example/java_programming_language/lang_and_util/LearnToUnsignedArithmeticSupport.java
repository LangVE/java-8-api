package example.java_programming_language.lang_and_util;

/**
 * Created by 이영호 on 2017-04-19.
 */
public class LearnToUnsignedArithmeticSupport {
    public static void main(String[] args) {
        Integer integer = Integer.parseInt("2147483648");
        System.out.println("integer = " + integer);

        Integer unsignedInteger = Integer.parseUnsignedInt("2147483648", 10);
        System.out.println("unsignedInteger = " + unsignedInteger);
    }
}
