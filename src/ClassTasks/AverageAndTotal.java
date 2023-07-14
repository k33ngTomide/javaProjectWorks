package ClassTasks;

import java.util.Scanner;

public class AverageAndTotal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder scores = new StringBuilder(" ");

        double total = 0;
        int counter = 0;

        for( ; counter < 10; counter++ ){
            System.out.print("Enter Student score: ");
            double score = scan.nextDouble();
            total += score;
        }


        double average = total/ counter;
        System.out.println("The sum of the score is: " + total);
        System.out.println("The Average is"+ average);

    }
}
