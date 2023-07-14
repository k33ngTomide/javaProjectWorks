package ClassTasks;

import java.util.Scanner;

public class TenScore {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder scores = new StringBuilder(" ");

        double total = 0;
        for(int counter = 0; counter < 10; ){
            System.out.print("Enter Student score: ");
            double score = scan.nextDouble();
                scores.append(score).append(" ");
                total += score;
                counter++;
        }
        System.out.println("The total is: "+total);
    }
}
