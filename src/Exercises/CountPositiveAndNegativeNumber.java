package Exercises;


import java.util.Scanner;

public class CountPositiveAndNegativeNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double total = 0;
        int counter = 0;
        int postiveCounter = 0, negativeCounter = 0;

        System.out.print("Enter an integer, the input ends if it is 0: ");
        int number = scan.nextInt();

        while (number != 0 ){

            if (number > 0) {postiveCounter++;}
            else { negativeCounter++;}

            total += number;
            counter++;

            System.out.print("Enter an integer, the input ends if it is 0: ");
            number = scan.nextInt();

        }
        if (counter == 0) {
            System.out.println("No numbers are entered except 0");
        }

        if (counter > 0) {
            System.out.println("The number of positive is " + postiveCounter +
                    "\nThe number of Negative is " + negativeCounter);
            System.out.println("The total is " + total +
                    "\nThe average is " + total/counter);
        }

    }
}
