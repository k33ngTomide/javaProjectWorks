package ClassTasks;

import java.util.Scanner;

public class CollectTenValidScore {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder scores = new StringBuilder(" ");

        for (int counter = 0; counter < 10; ) {
            System.out.print("Enter Student score: ");
            double score = scan.nextDouble();


            if (score >= 0 && score <= 100) {
                scores.append(score).append(" ");
                counter++;
            }else {
                System.out.println("Invalid Number." +
                        "\nNumber below 0 or more than 100 are invalid.");
            }
        }
    }
}
