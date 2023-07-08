package Exercises;

import java.util.Scanner;

public class PositiveNumberAndNegativeNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int positiveNumber = 0;
        int negativeNumber = 0;
        double total = 0;
        int counter = 0;
        System.out.print("Enter an integer, the input ends if it is 0:  ");
        int integer= scan.nextInt();

        for ( ; ; counter++ ){

            if (integer == 0) break;

            if (integer > 0) positiveNumber +=1;
            if (integer < 0) negativeNumber += 1;

            total += integer;

            System.out.print("Enter an integer, the input ends if it is 0:  ");
            integer= scan.nextInt();

        }
        double average = total / counter;
        if (counter > 0) {
            System.out.println("The number of positive number is " + positiveNumber +
                    "\nThe number of negative number is " + negativeNumber +
                    "\nThe total is " + total +
                    "\nThe average is " + average);
        }

        if (counter == 0)
            System.out.println("No numbers are entered except 0");

    }
}
