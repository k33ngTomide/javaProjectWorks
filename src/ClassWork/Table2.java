package ClassWork;

import java.util.Scanner;

public class Table2 {

    public static void main (String[] args) {
        Scanner userInput = new Scanner(System.in);

        double[][] numbers = new double[7][3];

        double sum = 0, average = 0, min = Double.MAX_VALUE, max = Double.MIN_VALUE;

        System.out.println("Enter numbers: ");
        for (int counter = 0; counter < 3; counter++) {
            for (int newCounter = 0; newCounter < 3; newCounter++) {

                double number = userInput.nextDouble();
                numbers[counter][newCounter] = number;
            }
        }

        for (int count = 0; count < 3; count++) {
            for (int newCount = 0; newCount < 3; newCount++) {
                sum += numbers[newCount][count];

            }
            numbers[3][count] = sum;
            average = sum / 3;
            numbers[4][count] = average;
            sum = 0; average = 0;
        }


        for (int counter = 0; counter < 3; counter++) {
            for (int newCounter = 0; newCounter < 3; newCounter++) {

                min = Math.min(numbers[0][counter], Math.min(numbers[1][counter], numbers[2][counter]));
                numbers[5][counter] = min;

                max = Math.max(numbers[0][counter], Math.max(numbers[1][counter], numbers[2][counter]));
                numbers[6][counter] = max;
            }
            min = Double.MAX_VALUE; max = Double.MIN_VALUE;
        }

        for (int counter = 0; counter < numbers.length; counter++) {
            for (int newCounter = 0; newCounter < numbers[counter].length; newCounter++) {

                System.out.print(numbers[counter][newCounter] + "\t\t\t\t");
            }
            System.out.println();
        }

    }
}
