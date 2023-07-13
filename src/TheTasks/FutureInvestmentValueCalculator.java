package TheTasks;

import java.util.Scanner;

public class FutureInvestmentValueCalculator {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.print("Enter investment Amount: ");
        double amount = entry.nextDouble();

        System.out.print("Enter annual rate in percentage: ");
        double annualRate = entry.nextDouble();

        System.out.print("Enter the number of years: ");
        double years = entry.nextDouble();

        double monthlyRate = annualRate/1200;
        double futureValue = amount* Math.pow(1 + monthlyRate, years*12);

        System.out.printf("Accumulated Value is $%.2f ", futureValue);

    }
}
