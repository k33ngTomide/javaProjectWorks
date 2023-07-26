package Dietel.ChapterFive;

import java.util.Scanner;

public class BarChart {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] number = new int[5];

        for (int counter = 0; counter <= 4; ) {
            System.out.print("Enter a number between 1 to 30: ");
            int num = scan.nextInt();

            if (num > 0 && num <= 30) {
                number[counter] = num;
                counter++;
            } else {
                System.out.println("Invalid input.\nThe number you entered is not between 1 and 30");
            }
        }

        for (int star : number) {
            System.out.println("*".repeat(star));
        }
    }
}
