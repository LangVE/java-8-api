package example.java_programming_language.lambda_expression;

/**
 * Created by 이영호 on 2017-03-30.
 */
public class LearnToCapturedVariable {
    public static void main(String[] args){

        String how = "hard";

        Company.letWork(new Person(){
            @Override
            public void work() {
                System.out.println(String.format("I work %s!", how));
            }
        });
    }
}
