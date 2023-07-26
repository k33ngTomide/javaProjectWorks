package Dietel.ChapterSix;

import java.security.SecureRandom;
import java.util.Scanner;


public class VaryingTheTypeOfProblem {

    private static Scanner keyboardInput = new Scanner(System.in);
    private static SecureRandom random = new SecureRandom();
    private static int firstNumber;
    private static int secondNumber;
    private static int correct = 0;
    private static int wrong = 0;
    private static int percent;

    private static int input;
    private static int answer;
    private static int problem;

    public static void main(String[] args) {
        allQuestions();
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
    private static void subtract() {
        System.out.print("What is " + firstNumber +
                " - " + secondNumber + "? :  ");
        input = keyboardInput.nextInt();

        answer = firstNumber - secondNumber;
    }

    private static void randomQuestion() {
        int randomProblem = random.nextInt(1, 5);
        switch (randomProblem){
            case 1: addition();
            case 2: subtract();
            case 3: multiplication();
            case 4: division();
        }
    }

    private static void division() {
        System.out.print("What is " + firstNumber +
                " / " + secondNumber + "? :  ");
        double input = keyboardInput.nextDouble();
        double answer = (double) firstNumber / secondNumber;
    }

    private static void multiplication() {
        System.out.print("What is " + firstNumber +
                " x " + secondNumber + "? :  ");
        input = keyboardInput.nextInt();
        answer = firstNumber * secondNumber;
    }

    private static void addition() {
        System.out.print("What is " + firstNumber +
                " + " + secondNumber + "? :  ");
        input = keyboardInput.nextInt();
        answer = firstNumber + secondNumber;
    }


    private static void invalid() {
        System.out.println("you entered and invalid level");
        allQuestions();
    }

    public static void newQuestionLevel_one(){
        if (correct == 0 & wrong == 0)System.out.println("Welcome to level 1");
        firstNumber = random.nextInt(10);
        secondNumber = random.nextInt(10);
        savedQuestionLevelOne();
    }


    public static void newQuestionLevel_two(){
        if (correct == 0 & wrong == 0)System.out.println("Welcome to level 2");
        firstNumber = random.nextInt(10, 100);
        secondNumber = random.nextInt(10, 100);
        savedQuestionLevelTwo();
    }

    public static void newQuestionLevel_three(){
        if (correct == 0 & wrong == 0)System.out.println("Welcome to level 3");
        firstNumber = random.nextInt(100, 1000);
        secondNumber = random.nextInt(100, 1000);
        savedQuestion_Level3();
    }
    public static void percentageCalculator(){
        percent = (correct / 10) * 100;
        if (percent < 75){
            System.out.println("Congratulations, you are ready to go to the next level!");
        } else {
            System.out.println("Please ask your teacher for extra help");
        }
    }

    public static void printProblemQuestion(){
        System.out.print("""
                Pick an arithmetic problem, Enter
                1 for Addition questions, 2 for Subtraction,
                3 for Multiplication, 4 for Division, 5 for random mixture.
                                
                Enter a number:  """);
        problem = keyboardInput.nextInt();
    }
    public static void problemQuestions(){
        if(correct == 0 && wrong == 0) printProblemQuestion();

        switch (problem) {
            case 1 -> addition();
            case 2 -> subtract();
            case 3 -> multiplication();
            case 4 -> division();
            case 5 -> randomQuestion();
            default -> {
                System.out.println("Wrong input, try again");
                printProblemQuestion();
            }

        }
    }

    public static void savedQuestionLevelOne(){

        problemQuestions();

        if (input == answer) {
            correct += 1;
            correctResponses();
            if ((correct + wrong) == 10){
                percentageCalculator();
                newQuestionLevel_two();
                savedQuestionLevelTwo();
            }
            newQuestionLevel_one();
            savedQuestionLevelOne();
        } else {
            wrong += 1;
            wrongResponses();
            savedQuestionLevelOne();
        }

    }

    public static void savedQuestionLevelTwo() {

        problemQuestions();

        if (input == answer){
            correct += 1;
            correctResponses();
            if ((correct + wrong) == 10) {
                percentageCalculator();
                newQuestionLevel_three();
                savedQuestion_Level3();
            }
            newQuestionLevel_two();
            ;
        } else {
            wrong += 1;
            wrongResponses();
            savedQuestionLevelTwo();
        }

    }

    public static void savedQuestion_Level3() {

        problemQuestions();

        if (input == answer) {
            correct += 1;
            correctResponses();
            if ((correct + wrong) == 10) {
                percentageCalculator();
                System.exit(1);
            }
            newQuestionLevel_three();
            savedQuestion_Level3();
        } else {
            wrong += 1;
            wrongResponses();
            savedQuestion_Level3();
        }

    }

    public static void allQuestions () {

        System.out.print("Enter a level between 1 to 3:  ");
        int user = keyboardInput.nextInt();

        switch (user) {
            case 1 -> {
                newQuestionLevel_one();
            }
            case 2 -> {
                newQuestionLevel_two();
            }
            case 3 -> {
                newQuestionLevel_three();
            }
            default -> invalid();
        }
    }

}
