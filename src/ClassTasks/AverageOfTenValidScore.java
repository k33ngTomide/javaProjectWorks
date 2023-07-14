package ClassTasks;

import java.util.Scanner;

public class AverageOfTenValidScore {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder scores = new StringBuilder(" ");

        double total = 0;
        int counter = 0;

        for( ; counter < 10; )
        {
            System.out.print("Enter Student score: ");
            double score = scan.nextDouble();


            if (score >= 0 && score <= 100) {
                scores.append(score).append(" ");
                total += score;
                counter++;
            } else {
                System.out.println("Invalid Number." +
                        "\nNumber below 0 or more than 100 are invalid.");
            }

        }
        System.out.println("The sum of the even scores is: " + total);
        System.out.print("The average of the even scores is: " + total/counter);
    }
}
