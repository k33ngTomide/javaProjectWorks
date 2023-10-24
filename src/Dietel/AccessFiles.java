package Dietel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class AccessFiles {
    public static void main(String[] args) {

        try ( FileInputStream fileInputStream =
                      new FileInputStream("/home/user/IdeaProjects/javaProjectWorks/src/Dietel/text.txt")){
            byte[] content = fileInputStream.readAllBytes();
            String newContent = new String(content);
            System.out.println(newContent);
        }
        catch (IOException exception){
            System.err.println(exception.getMessage());
        }

    }
}
