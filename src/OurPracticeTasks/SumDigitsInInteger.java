package OurPracticeTasks;

import java.util.Scanner;

public class SumDigitsInInteger {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int userNumber = scan.nextInt();

        if (userNumber > 0 && userNumber <= 1000) {

            int firstDigit = (userNumber / 1000);
            int secondDigit = (userNumber / 100) % 10;
            int thirdDigit = (userNumber / 10) % 10;
            int lastDigit = userNumber % 10;

            System.out.println(firstDigit + "\t" + secondDigit +
                    "\t" + thirdDigit + "\t" + lastDigit);
            System.out.println();

            int total = firstDigit + secondDigit + thirdDigit + lastDigit;
            System.out.println("The sum of the digits is: " + total);
        } else{
            System.out.println("The number you entered is not within the given range");
        }
    }
}
