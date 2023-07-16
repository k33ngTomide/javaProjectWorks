package Assignments.Array;

import java.util.Scanner;

public class CheckPalindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the word: ");
        String userEntry = input.next();

        boolean isPalindrome = isStringPalindrome(userEntry);
        if (isPalindrome) System.out.println(userEntry + " is a Palindrome");
        else System.out.println(userEntry + " is not a palindrome");

    }
    public static boolean isStringPalindrome(String word) {
        boolean isPalindrome = false;

        String newWordFormed = "";

        for (int counter = 0; counter < word.length(); counter++) {
            char character = word.charAt(word.length()-1 -counter);

            newWordFormed += character;
        }
        if(word.toLowerCase().equals(newWordFormed.toLowerCase())){
            isPalindrome = true;
        }
        return isPalindrome;
    }
}
