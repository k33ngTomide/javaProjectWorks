package TheTasks;

import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter the exchange rate of dollar to RMB:  ");
        double rate = scan.nextDouble();

        System.out.print("Enter 0 to covert dollars RMB or" +
                "\nEnter 1 to convert RMB to dollars:  ");
        int choice = scan.nextInt();

        if (choice == 0){
            System.out.print("Enter the dollars amounts: ");
            double amount = scan.nextDouble();

            System.out.println("$" +amount + " is " + calculateUSDCurrencyToRMB(amount, rate) + "yuan");


        } else if (choice == 1){
            System.out.print("Enter the RNB amount:  ");
            double amount = scan.nextDouble();

            System.out.println(amount +" is  $"+ calculateRMBCurrencyToUSD(amount, rate));
        }else {
            System.out.println("Invalid input. Try again?");
        }

    }

    public static double calculateUSDCurrencyToRMB(double dollar, double exchangeRate) {
        double exchangedDollar = dollar * exchangeRate;
        return exchangedDollar;
    }

    public static double calculateRMBCurrencyToUSD(double rmb, double exchangeRate) {
        double exchangeRMB =rmb / exchangeRate;
        return exchangeRMB;
    }
}
