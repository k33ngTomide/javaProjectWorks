package OurPracticeTasks;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a word to reverse: ");
        String wordEntered = scan.next();

//        StringBuilder processedWord = new StringBuilder();
//
//        for (int counter = 0; counter < wordEntered.length(); counter++) {
//            char character = wordEntered.charAt(wordEntered.length() - 1 - counter);
//            processedWord.append(character);
//        }
//        System.out.println(processedWord);

        for (int counter = 0; counter < wordEntered.length(); counter++) {
            char character = wordEntered.charAt(wordEntered.length() - 1 - counter);
            System.out.print(character);
        }
    }
}
