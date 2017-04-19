package example.java_programming_language.io_nio;

import java.io.File;
import java.nio.file.Files;

/**
 * Created by 이상덕 on 2017-04-17.
 */
public class FindFilePaths {

    public static void main(String[] args){
        try{
            System.out.println("#old java -----------------------------------------------");

            File dir = new File(".\\src\\main\\java\\example\\java_programming_language\\io_nio");
            File[] fileList = dir.listFiles();

            for(int i = 0 ; i < fileList.length ; i++) {
                File file = fileList[i];
                if(file.isFile()){
                    System.out.println(file.getPath());
                }
            }

            System.out.println("#java8 --------------------------------------------------");
            Files.list(new File(".\\src\\main\\java\\example\\java_programming_language\\io_nio")
                    .toPath())
                    .map(String::valueOf)
                    .filter(path -> path.endsWith("java"))
                    .forEach(System.out::println);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
        }

    }
}
