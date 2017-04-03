package example.java_programming_language.captured_value;

/**
 * Created by interpark on 2017-03-30.
 */
public class LearnToCapturedValue {
    public static void main(String[] args) {
//        Person person = new Person();
//        Company.letWork(person);

        String how = "hard";

        /*
        how = "dd";
        Company.letWork(new Person() {
            public void work(){
                System.out.println(String.format("I work %s!", how));
            }
        });
*/
        Company.letWork((() -> {
            System.out.println(String.format("I work %s!", how));
        }));
    }
}
