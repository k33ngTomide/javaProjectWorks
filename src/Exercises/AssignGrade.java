package Exercises;

import java.util.Scanner;
public class AssignGrade {

    private static String grade;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of students:  ");
        int user_entry = scan.nextInt();

        System.out.print("Enter the scores for " + user_entry + " students:  ");
        int best = 0;
        int[] score = new int[user_entry];
        for(int x = 0 ; x < user_entry; x++){
            score[x] = scan.nextInt();

            if (score[x] > best) best = score[x];

            if (score[x] >= best - 10) grade = "A";
            else if (score[x] >= best - 20) grade = "B";
            else if (score[x] >= best - 30) grade = "C";
            else if (score[x] >= best - 40) grade = "D";
            else grade = "F";

            System.out.printf("Student %d score is %d and grade is %s\n", x, score[x], grade);
        }

    }

}
