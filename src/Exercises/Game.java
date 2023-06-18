package Exercises;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        Scanner scanKeyboard = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 3);

        System.out.print("Enter your option... " + "(1)Rock " + "(2) for paper" + "(0) for Scissors:");
        int userEntry = scanKeyboard.nextInt();

        if (userEntry >= 0 && userEntry < 3) {

            if (userEntry == 0 && randomNumber == 0) {
                System.out.println("The computer is scissors. You are scissors. It is a draw");
            } else if (userEntry == 0 && randomNumber == 1) {
                System.out.println("The computer is rock. You are scissors. The computer won");
            } else if (userEntry == 0 && randomNumber == 2) {
                System.out.println("The computer is paper. You are scissors. You Won");
            } else if (userEntry == 1 && randomNumber == 0) {
                System.out.println("The computer is scissors. You are rock. You Won");
            } else if (userEntry == 1 && randomNumber == 1) {
                System.out.println("The computer is rock. You are rock. It is a draw");
            } else if (userEntry == 1 && randomNumber == 2) {
                System.out.println("The computer is paper. You are rock. The computer Won");
            } else if (userEntry == 2 && randomNumber == 0) {
                System.out.println("The computer is scissors. You are paper. The computer Won");
            } else if (userEntry == 2 && randomNumber == 1) {
                System.out.println("The computer is rock. You are paper. You Won");
            } else if (userEntry == 2 && randomNumber == 2) {
                System.out.println("The computer is paper. You are paper. It is a draw");
            }
        } else {
            System.out.println("Your Entry is Invalid");
        }
    }
}