package Dietel.ChapterSix;

import java.security.SecureRandom;
import java.util.Scanner;


public class ComputerAssistedInstruction {

    private static Scanner keyboardInput = new Scanner(System.in);
    private static SecureRandom random = new SecureRandom();
    private static int firstNumber;
    private static int secondNumber;
    private static int correct = 0;
    private static int wrong = 0;
    private static int percent;

    public static void main(String[] args) {
        allQuestions();
    }

    public static void allQuestions(){
        System.out.print("Enter a level between 1 to 3:  ");
        int user = keyboardInput.nextInt();

        switch (user){
            case 1 -> {newQuestionLevel_one(); savedQuestionLevel1();}
            case 2 -> {newQuestionLevel_two(); savedQuestionLevel2();}
            case 3 -> {newQuestionLevel_three(); savedQuestionLevel3();}
            default -> invalid();
        }
    }

    private static void invalid() {
        System.out.println("you entered and invalid level");
        allQuestions();
    }

    public static void newQuestionLevel_one(){
        System.out.println("Welcome to level 1");
        firstNumber = random.nextInt(10);
        secondNumber = random.nextInt(10);
    }


    public static void newQuestionLevel_two(){
        System.out.println("Welcome to level 2");
        firstNumber = random.nextInt(10, 100);
        secondNumber = random.nextInt(10, 100);
    }

    public static void newQuestionLevel_three(){
        System.out.println("Welcome to level 3");
        firstNumber = random.nextInt(100, 1000);
        secondNumber = random.nextInt(100, 1000);
    }

    public static void savedQuestionLevel1(){
        System.out.print("What is " + firstNumber +
                " + " + secondNumber + "? :  ");
        int input = keyboardInput.nextInt();
        int answer = firstNumber + secondNumber;

        if (input == answer) {
            correct += 1;
            correctResponses();
            if ((correct + wrong) == 10){
                percentageCalculator();
                newQuestionLevel_two();
                savedQuestionLevel2();
            }
            newQuestionLevel_one();
            savedQuestionLevel1();
        } else {
            wrong += 1;
            wrongResponses();
            savedQuestionLevel1();
        }

    }

    public static void savedQuestionLevel2(){
        System.out.print("What is the addition of  " + firstNumber +
                " and " + secondNumber + "? :  ");
        int input = keyboardInput.nextInt();
        int answer = firstNumber + secondNumber;

        if (input == answer) {
            correct += 1;
            correctResponses();
            if ((correct + wrong) == 10){
                percentageCalculator();
                newQuestionLevel_three();
                savedQuestionLevel3();
            }
            newQuestionLevel_two();
            savedQuestionLevel2();
        } else {
            wrong += 1;
            wrongResponses();
            savedQuestionLevel2();
        }

    }

    public static void savedQuestionLevel3(){
        System.out.print("What is the sum of  " + firstNumber +
                " and " + secondNumber + "? :  ");
        int input = keyboardInput.nextInt();
        int answer = firstNumber + secondNumber;

        if (input == answer) {
            correct += 1;
            correctResponses();
            if ((correct + wrong) == 10){
                percentageCalculator();
                System.exit(1);
            }
            newQuestionLevel_three();
            savedQuestionLevel3();
        } else {
            wrong += 1;
            wrongResponses();
            savedQuestionLevel3();
        }

    }

    public static void percentageCalculator(){
        percent = (correct / 10) * 100;
        if (percent < 75){
            System.out.println("Congratulations, you are ready to go to the next level!");
        } else {
            System.out.println("Please ask your teacher for extra help");
        }
    }
    public static void correctResponses(){
        int correctResponses = random.nextInt(4);

        switch (correctResponses) {
            case 0 -> System.out.println("That's correct, Very good!\n");
            case 1 -> System.out.println("Perfectly Excellent!\n");
            case 2 -> System.out.println("Nice Work!\n");
            case 3 -> System.out.println("Keep the good work!\n");
        }
    }
    public static void wrongResponses(){
        int wrongResponses = random.nextInt(4);

        switch (wrongResponses) {
            case 0 -> System.out.println("No, Please Try again!\n");
            case 1 -> System.out.println("Wrong. Try once more!\n");
            case 2 -> System.out.println("Don't give up!\n");
            case 3 -> System.out.println("No. Keep trying!\n");
        }
    }

}
