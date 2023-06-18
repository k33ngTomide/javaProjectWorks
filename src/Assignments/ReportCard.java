package Assignments;

import java.util.Scanner;
public class ReportCard {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        String studentClass = "SS3";
        int numberOfStudents = 0;
        double total = 0;

        System.out.print("Enter a student score:  ");
        double score = keyboardInput.nextDouble();
        if (score > 0)total = score;

        while (score != -25){
            System.out.print("Enter another student score or -25 to see result:  ");
            score = keyboardInput.nextDouble();

            if(score >= 0) {
                total += score;
                numberOfStudents++;
            } else {
                System.out.println("Invalid Score");
            }

        }

        double average = total / numberOfStudents;
        System.out.println("*****************************************************************" +
                "\n                 Aso Rock Secondary School, Abuja Nigeria                    " +
                "\n*****************************************************************" +
                "\nClass:  " + studentClass + "\nNumber of Student in class:  " + numberOfStudents +
                "\nTotal Score:  " + total + "\nAverage Score:  " + average +
                "\n*****************************************************************");
    }

}
