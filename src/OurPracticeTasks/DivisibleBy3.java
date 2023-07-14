package OurPracticeTasks;

import java.util.Scanner;

public class DivisibleBy3 {

    public int divisionOfThree(int number) {

        int additionOfNumbers = 0;
        for (int counter = 0; counter <= number; counter++){
            if(counter % 3 == 0) additionOfNumbers += counter;
        }
        return additionOfNumbers;
    }

    public static void main(String[] args) {

        Scanner southEast = new Scanner(System.in);
        DivisibleBy3 uloma = new DivisibleBy3();

        System.out.print("Enter the number: ");
        int user = southEast.nextInt();

        int answer = uloma.divisionOfThree(user);
        System.out.println("The answer is: " + answer);
    }
}
