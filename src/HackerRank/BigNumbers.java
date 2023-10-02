package HackerRank;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BigNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String[] numbered = new String[number];
        BigDecimal[] bigNumbers = new BigDecimal[number];


        scanner.next();
        for(int i = 0; i < number; i++){
            String inputted = scanner.next();

            bigNumbers[i] = new BigDecimal(inputted);
            numbered[i] = inputted;
        }

        Arrays.sort(bigNumbers, Collections.reverseOrder());

        for (int counter = 0; counter < bigNumbers.length; counter++)
            for (int newCounter = 0; newCounter < numbered.length; newCounter++)
                if (bigNumbers[counter].equals(new BigDecimal(numbered[newCounter])))
                    System.out.println(numbered[newCounter]);


    }
}
