package Assignments;

import java.util.Scanner;

public class InstructorReport {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        String studentClass = "SS3";
        int counter = 0;
        double total = 0;

        while (counter < 20){
            System.out.print("Enter a student score:  ");
            double score = keyboardInput.nextDouble();

            if (score >= 0) {
                total += score;
                counter++;
            } else{
                System.out.println("Invalid score");
            }
        }
        double average = total / counter;
        System.out.println("*****************************************************************" +
                "\n                 Aso Rock Secondary School, Abuja Nigeria                    " +
                "\n*****************************************************************" +
                "\nClass:  " + studentClass + "\nNumber of Student in class:  " + counter +
                "\nTotal Score:  " + total + "\nAverage Score:  " + average +
                "\n*****************************************************************");
    }

}
