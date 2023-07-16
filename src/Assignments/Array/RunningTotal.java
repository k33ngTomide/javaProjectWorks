package Assignments.Array;

import java.util.Scanner;

public class RunningTotal {

    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);

        System.out.print("Enter the number of element: ");
        int userEntry = scanInput.nextInt();

        double[] listOfNumbers = new double[userEntry];

        System.out.print("Enter the list of numbers:  ");
        for (int counter = 0; counter < userEntry; counter++) {
            double numberEntry = scanInput.nextDouble();
            listOfNumbers[counter] = numberEntry;
        }

        double listTotal = getTotal(listOfNumbers);

        System.out.println("The total of the list is: " + listTotal);
    }

    public static double getTotal(double... numbers) {
        double total = 0;
        for (double number : numbers) {
            total += number;

        }
        return total;
    }

    public static int getTotal(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}
