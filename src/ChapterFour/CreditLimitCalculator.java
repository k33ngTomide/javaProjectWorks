package ChapterFour;

import java.util.Scanner;

public class CreditLimitCalculator {

    private static final Scanner keyboardInput = new Scanner(System.in);

    public static void main(String[] args) {

        while(true) {
            CreditLimitCalculator customer = new CreditLimitCalculator();
            System.out.print("Enter the Balance at the beginning of the month,\n " +
                    "   total  charges for the month and the credit for the month (in $): ");
            double newBalance = customer.creditInput(keyboardInput.nextDouble(),
                    keyboardInput.nextDouble(),
                    keyboardInput.nextDouble());

            System.out.print("Enter Credit limit: ");
            double creditLimit = keyboardInput.nextDouble();

            System.out.println("The new Balance is $" + newBalance + "\n");

            if (newBalance > creditLimit){
                System.out.println("Credit Limit Exceeded!");
            }

            System.out.print("Do you want to calculate for another " +
                    "customer?\nEnter 1 for yes and 2 for No:  ");
            int user_input = keyboardInput.nextInt();

            if (user_input == 2){
                System.out.println("\nCalculator is shutting down...\n");
                break;}

            System.out.println();
        }

    }

    double newBalance;
    public double creditInput(double beginning, double charges, double credit){
        if (beginning > 0) {
            newBalance = beginning + charges - credit;
        }
        return newBalance;
    }
}
