package Dietel.ChapterEight;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class SavingsAccounts{

    public static void main(String[] args) {

        SavingsAccount saver1 = new SavingsAccount(BigDecimal.valueOf(2000.00));
        SavingsAccount saver2 = new SavingsAccount(BigDecimal.valueOf(3000.00));

        SavingsAccount.setAnnualInterestRate(4);
        System.out.println("SAVING BALANCE FOR 4% RATE");
        System.out.printf("Saver1 savings Balance $%s%n", saver1.calculateMonthlyInterest());
        System.out.printf("Saver2 savings Balance $%s%n%n", saver2.calculateMonthlyInterest());

        SavingsAccount.modifyInterestRate(5);
        System.out.println("SAVING BALANCE FOR 5% RATE");
        System.out.printf("Saver1 savings Balance $%s%n", saver1.calculateMonthlyInterest());
        System.out.printf("Saver2 savings Balance $%s%n", saver2.calculateMonthlyInterest());

    }

}

class SavingsAccount {

    private static double annualInterestRate;

    private BigDecimal savingsBalance;

    public SavingsAccount(BigDecimal savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static void setAnnualInterestRate(int annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public BigDecimal calculateMonthlyInterest(){

        double value = annualInterestRate / 100;
        BigDecimal multiply = savingsBalance.multiply(BigDecimal.valueOf(value));

        BigDecimal interest = multiply.divide(BigDecimal.valueOf(12), 2, RoundingMode.HALF_EVEN);

        savingsBalance = savingsBalance.add(interest);
        return savingsBalance;
    }

    public static void modifyInterestRate(int newRate){
        SavingsAccount.annualInterestRate = newRate;
    }

}



/* Provide method calculateMonthlyInterest to calculate the monthly interest by multiplying the
savingsBalance by annualInterestRate divided by 12—this interest should be added to savings
Balance. Provide a static method modifyInterestRate that sets the annualInterestRate to a new
value. Write a program to test class SavingsAccount. Instantiate two savingsAccount objects, save
r1 and saver2, with balances of $2000.00 and $3000.00, respectively. Set annualInterestRate to
4%, then calculate the monthly interest for each of 12 months and print the new balances for both
savers. Next, set the annualInterestRate to 5%, calculate the next month’s interest and print the
new balances for both savers.*/