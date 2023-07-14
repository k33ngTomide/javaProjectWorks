package OurPracticeTasks;

import java.util.Scanner;

public class FinancialApplication {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        System.out.print("Enter the balance and the interest rate:");
        double balance = entry.nextDouble();
        double interestRate = entry.nextDouble();

        double interest = balance * (interestRate/ 1200);

        System.out.printf("The interest is %.5f ", interest);
    }
}
