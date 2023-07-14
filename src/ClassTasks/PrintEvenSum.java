package ClassTasks;

import java.util.Scanner;

public class PrintEvenSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder scores = new StringBuilder(" ");

        double evenCountedTotal = 0;
        for(int counter = 1; counter <= 10; counter++ ){
            System.out.print("Enter Student score: ");
            double score = scan.nextDouble();
            scores.append(score).append(" ");

            if (counter % 2 == 0){
                evenCountedTotal += score;
            }
        }


        System.out.println("The sum of even collection is: " + evenCountedTotal);
    }
}
