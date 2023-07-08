package Exercises;

import java.util.Objects;
import java.util.Scanner;

public class SimpleCalc {

    public static void main(String[] args) {

        System.out.println("Welcome to a Simple Calculator");
        System.out.println(calculate());
    }
    private static String calculate(){
        String[] example = new String[3];
        Scanner calc = new Scanner(System.in);


        for(int x = 0; x <3 ; x++){
            example[x] = calc.next();
        }

        int firstNumber = Integer.parseInt(example[0]);
        int secondNumber = Integer.parseInt(example[2]);

        if (example[1].equals("+")) {
            int answer = firstNumber + secondNumber;
            return answer + " ";
        }
        else if (example[1].equals("-")){
            int answerNext = firstNumber - secondNumber;
            return answerNext + " ";
        }
        else if (example[1].equals("*")){
            int answerN = firstNumber * secondNumber;
            return answerN + " ";
        }
        String invalid = "Invalid Input";

        return invalid;
    }
}
