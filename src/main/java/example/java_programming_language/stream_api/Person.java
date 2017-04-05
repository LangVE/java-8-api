package example.java_programming_language.stream_api;

/**
 * Created by 이영호 on 2017-04-05.
 */
public class Person {
    private String name;
    private String gender;
    private String age;

    public Person(String name, String gender, String age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        System.out.println(String.format("order : %s, name : %s, getGender : %s", LearnToLazy.order, this.name, this.gender));
        LearnToLazy.order++;

        return gender;
    }

    public String getAge() {
        System.out.println(String.format("order : %s, name : %s, getAge : %s", LearnToLazy.order, this.name, this.age));
        LearnToLazy.order++;
        return age;
    }
}
