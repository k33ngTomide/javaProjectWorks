package OurPracticeTasks;

import java.util.Scanner;

public class operators {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number:  ");
        int number = input.nextInt();

        boolean andOperator = (number % 5 == 0 && number % 6 == 0);
        boolean orOperator = (number % 5 == 0 || number % 6 == 0);
        boolean exclusiveOperator = (number % 5==0 ^ number % 6 == 0);

        System.out.printf("Is %d divisible by 5 and 6? %b%n",number, andOperator);
        System.out.printf("Is %d divisible by 5 or 6? %b%n",number, orOperator);
        System.out.printf("Is %d divisible by 5 or 6, but not both? %b%n",number, exclusiveOperator);

    }
}
