package tdd;

import java.util.Scanner;

public class FactorialCalculator {

    private int factorial;
    private static int question;

    public static void main(String[] args) {

        FactorialCalculator calc = new FactorialCalculator();

        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int answer = calc.calculateFactorial(keyboardInput.nextInt());
        System.out.println("The value of " + question + "! = " + answer);
    }
    public int calculateFactorial(int number) {
        question = number;
        if (number == 0) return 1;
        if (number == 1) return 1;
        if (number < 0) terminate();

        factorial = 1;
        while(number > 1){
            factorial *= number;
            number = number - 1;
        }
        return factorial;
    }

    private void terminate() {
        System.out.println("""
                                Invalid input...
                                Try again now
                                Thunder fire you
                                join cohort 19""");
        System.exit(1);
    }
}
