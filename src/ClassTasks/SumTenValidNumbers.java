package ClassTasks;

import java.util.Scanner;

public class SumTenValidNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder scores = new StringBuilder(" ");

        double total = 0;
        for (int counter = 0; counter < 10; ) {
            System.out.print("Enter Student score: ");
            double score = scan.nextDouble();

            scores.append(score).append(" ");
            if (score >= 0 && score <= 100) {
                total += score;
                counter++;
            }else {
                System.out.println("Invalid Number." +
                        "\nNumber below 0 or more than 100 are invalid.");
            }

        }
        System.out.println("The sum of the even scores is: " + total);
    }
}
