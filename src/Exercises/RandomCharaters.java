package Exercises;

import java.security.SecureRandom;

public class RandomCharaters {

    public static char randomGenerator(){
        SecureRandom random = new SecureRandom();
        char character = (char) ('a' + random.nextInt(25));
        return character;

    }

    public static char upperCaseRandomGenerator(){
        SecureRandom random = new SecureRandom();
        char character = (char) ('A' + random.nextInt(25));
        return character;

    }

    public static void main(String[] args) {

        for (int counter =0; counter <= 10; counter++){
            for (int newCounter = 0; newCounter <= 10; newCounter++) {

                System.out.print(randomGenerator() + " ");

            }

            System.out.print("   ");
            for (int newCounter = 0; newCounter <= 10; newCounter++) {

                System.out.print(upperCaseRandomGenerator() + " ");

            }
            System.out.println();
        }
    }
}
