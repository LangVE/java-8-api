package example.java_programming_language.stream_api;

/**
 * Created by 이영호 on 2017-04-05.
 */
public class Person {
    private String gender;
    private String age;

    public Person(String gender, String age){
        this.gender = gender;
        this.age = age;
    }
    public String getGender() {
        System.out.println("getGender : " + gender);
        return gender;
    }

    public String getAge() {
        System.out.println("getAge : " + age);
        return age;
    }
}
