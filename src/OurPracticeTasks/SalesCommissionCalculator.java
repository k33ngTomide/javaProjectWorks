package OurPracticeTasks;

import java.util.Scanner;

public class SalesCommissionCalculator {

    public static void main(String[] args) {
        SalesCommissionCalculator calculator = new SalesCommissionCalculator();
        Scanner input = new Scanner(System.in);

        for(int counter = 0; counter < 4; counter++) {
            System.out.print("Enter the weekly gross sale: ");
            double sales = input.nextDouble();

            System.out.println("The salesperson's earnings: "
                    + calculator.commissionCalculator(sales));
        }

    }

    public double commissionCalculator(double grossSale) {
        double value = (grossSale * 0.09) + 200;
        return value;
    }
}
