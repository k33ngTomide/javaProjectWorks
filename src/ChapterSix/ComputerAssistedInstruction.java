package ChapterSix;

import java.security.SecureRandom;
import java.util.Scanner;


public class ComputerAssistedInstruction {

    private static Scanner keyboardInput
            = new Scanner(System.in);
    private static SecureRandom random
            = new SecureRandom();
    private static int firstNumber;
    private static int secondNumber;
    public static void main(String[] args) {

        newQuestion();
        savedQuestion();
    }
    public static void newQuestion(){

        firstNumber = random.nextInt(10);
        secondNumber = random.nextInt(10);
    }
    private static int correct = 0;
    private static int wrong = 0;
    private static int percent;

    public static void savedQuestion(){
        System.out.print("How much is " + firstNumber +
                " times " + secondNumber + "? :  ");
        int input = keyboardInput.nextInt();
        int answer = firstNumber * secondNumber;

        if (input == answer) {
            correct += 1;
            correctResponses();
            if ((correct + wrong) == 10){
                percentageCalculator();
                System.exit(1);
            }
            newQuestion();
            savedQuestion();
        } else {
            wrong += 1;
            wrongResponses();
            savedQuestion();
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
