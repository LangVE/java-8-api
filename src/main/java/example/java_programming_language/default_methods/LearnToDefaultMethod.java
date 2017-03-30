package example.java_programming_language.default_methods;

/**
 * Created by 이영호 on 2017-03-30.
 */
public class LearnToDefaultMethod {
    public static void main(String[] args){
        Person person = () -> System.out.println("I work hard!!");
        Company.letWork(person);
        person.sleep();
    }
}
