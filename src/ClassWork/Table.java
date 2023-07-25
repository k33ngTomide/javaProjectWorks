package ClassWork;

import java.util.Scanner;

public class Table {

    public static void main (String[] args) {
        Scanner userInput = new Scanner(System.in);

        double[][] numbers = new double[3][7];

        double sum = 0, average = 0, min = Double.MAX_VALUE, max = Double.MIN_VALUE;

        System.out.println("Enter numbers: ");
        for (int counter = 0; counter < numbers.length; counter++) {
            for (int newCounter = 0; newCounter < numbers[counter].length - 4; newCounter++) {

                double number = userInput.nextDouble();
                numbers[counter][newCounter] = number;

                sum += number;
                numbers[counter][3] = sum;

                average = sum / 3;
                numbers[counter][4] = average;

            }
            sum = 0;

        }

        for (int counter = 0; counter < numbers.length; counter++) {
            for (int newCounter = 0; newCounter < 1; newCounter++) {

                min = Math.min(numbers[counter][0], Math.min(numbers[counter][1], numbers[counter][2]));
                numbers[counter][5] = min;

                max = Math.max(numbers[counter][0], Math.max(numbers[counter][1], numbers[counter][2]));
                numbers[counter][6] = max;
            }
            min = Double.MAX_VALUE; max = Double.MIN_VALUE;
        }

        for (int counter = 0; counter < numbers.length; counter++) {
            for (int newCounter = 0; newCounter < numbers[counter].length; newCounter++) {

                System.out.print(numbers[counter][newCounter] + "\t\t");
            }
            System.out.println();
        }

    }
}
