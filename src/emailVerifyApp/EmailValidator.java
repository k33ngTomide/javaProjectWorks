package emailVerifyApp;

import java.io.*;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class EmailValidator {

    public static boolean validateEmail(String email) {
        String pattern = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,7}\\b";
        return Pattern.matches(pattern, email);
    }

    public static List<String> extractValidEmails(String inputFile) {
        List<String> validEmails = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (validateEmail(word)) {
                        validEmails.add(word);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return validEmails;
    }

    public static void writeValidEmailsToFile(List<String> validEmails, String outputFile) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (String email : validEmails) {
                writer.write(email + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String inputFile = "/home/user/IdeaProjects/javaProjectWorks/src/emailVerifyApp/input_emails.txt";
        String outputFile = "/home/user/IdeaProjects/javaProjectWorks/src/emailVerifyApp/valid_emails.txt";


        List<String> validEmails = extractValidEmails(inputFile);
        writeValidEmailsToFile(validEmails, outputFile);
        System.out.println("Completed Successfully");
    }
}
