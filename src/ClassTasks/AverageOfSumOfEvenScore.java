package ClassTasks;

import java.util.Scanner;

public class AverageOfSumOfEvenScore {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder scores = new StringBuilder(" ");

        double evenTotal = 0;
        int evenCounter = 0;

        for ( int counter = 0; counter < 10; counter++) {
            System.out.print("Enter Student score: ");
            double score = scan.nextDouble();

            scores.append(score).append(" ");
            if (score % 2 == 0) {
                evenTotal += score;
                evenCounter++;
            }

        }
        System.out.println("The sum of the even scores is: " + evenTotal);
        System.out.print("The average of the even scores is: " + evenTotal/evenCounter);
    }
}

