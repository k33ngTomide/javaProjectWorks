package ClassTasks;

import java.util.Scanner;

public class RestartCollection {

    public static void main(String[] args) {
        numberCollector();
    }

    public static void numberCollector(){
        Scanner scan = new Scanner(System.in);

        StringBuilder scores = new StringBuilder(" ");

        double total = 0;
        for (int counter = 0; counter < 10; ) {
            System.out.print("Enter Student score (entering 30 restarts entry): ");
            double score = scan.nextDouble();

            if (score == 30) {
                System.out.println("Restarting...");
                numberCollector();
            }
            scores.append(score).append(" ");
            if (score >= 0 && score <= 100) {
                total += score;
                counter++;
            } else {
                System.out.println("Invalid Number." +
                        "\nNumber below 0 or more than 100 are invalid. Try again!");
            }

        }
        System.out.println("The sum of the even scores is: " + total);
    }
}
