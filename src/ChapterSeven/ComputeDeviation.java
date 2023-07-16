package ChapterSeven;

import java.util.Scanner;

public class ComputeDeviation {
    static int terms = 10;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numberList = new double[terms];

        System.out.print("Enter ten Numbers: ");

        for (int counter = 0; counter < terms; ) {
            double num = input.nextDouble();
           if (num > 0) {
               numberList[counter] = num;
               counter++;
           }else {
               System.out.println("Invalid input");
           }
        }
        double meanAnswer = mean(numberList);
        double deviationAnswer = deviation(numberList);

        System.out.println("The mean is  " + meanAnswer +
                "\nThe standard deviation is " + deviationAnswer);
    }

    public static double deviation(double[] num){
        double totalDeviation = 0.0;

        for (double counter : num) {
            totalDeviation += Math.sqrt(Math.pow(counter - mean(num), 2));
        }
        double deviation = totalDeviation / (terms-1);
        return deviation;
    }

    public static double mean(double[] number){
        double total = 0;
        for (int counter = 0; counter < number.length; counter++){
            total += number[counter];
        }
        double mean = total/terms;
        return mean;
    }
}
