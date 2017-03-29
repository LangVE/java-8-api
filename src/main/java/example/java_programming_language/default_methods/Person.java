package example.java_programming_language.default_methods;

/**
 * Created by 이영호 on 2017-03-29.
 */
public interface Person {
    void work();

    static void eat() {
        System.out.println("I eat food.");
    };
}
