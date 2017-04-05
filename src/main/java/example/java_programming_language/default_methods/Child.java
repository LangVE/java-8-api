package example.java_programming_language.default_methods;

/**
 * Created by 이영호 on 2017-04-05.
 */
public class Child  implements Person{
    @Override
    public void work() {
        System.out.println("I'm not working");
    }

    @Override
    public void sleep() {
        System.out.println("I want to depp-sleep");
    }
}
