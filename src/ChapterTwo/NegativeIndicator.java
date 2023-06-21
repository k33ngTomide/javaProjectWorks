/* (Negative, Positive and Zero Values) Write a program that inputs five numbers and determines
and prints the number of negative numbers input, the number of positive numbers input and
the number of zeros input.*/

package ChapterTwo;

import java.util.Scanner;

public class NegativeIndicator {
    public static void main(String[] args) {
        Scanner keyboardScan = new Scanner(System.in);

        int negativeNumbers = 0;
        int postiveNumbers = 0;
        int zero = 0;
        int counter = 1;

        while (counter <=5) {
            System.out.print("Enter a numbers of your choice:  ");
            int userEntry = keyboardScan.nextInt();

            if (userEntry < 0) negativeNumbers += 1;
            else if (userEntry > 0) postiveNumbers += 1;
            else zero += 1;
            counter++;
        }

        System.out.println("The Negative inputs are:  " + negativeNumbers);
        System.out.println("The positive inputs are:  " + postiveNumbers);
        System.out.println("The zero inputs are:  " + zero);


    }
}
