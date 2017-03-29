package example.java_programming_language.default_methods.main;

import static example.java_programming_language.default_methods.Person.*;

/**
 * Created by 이영호 on 2017-03-29.
 */
public class StaticMethodInInterface {
//    public interface Person {
//        public abstract void work();
//
//        public static void eat() {
//            System.out.println("I eat food!");
//        }
//    }

    public static void main(String[] args) {
        eat();

        // error
        //sleep();
    }
}
