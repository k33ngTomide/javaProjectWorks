package HackerRank;

import java.util.Arrays;
import java.util.Scanner;
public class Anagrams {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String another = "Hello";
        String newAnother = "hello";

        System.out.println(isAnagram(another, newAnother));
    }

    static boolean isAnagram(String a, String b) {

        boolean output = true;
        if (a.length() >= 1 && a.length() <= 50 && b.length() >= 1 && b.length() <= 50) {

            String newA = a.toLowerCase();
            String newB = b.toLowerCase();

            int[] numberInA = new int[a.length()];
            int[] numberInB = new int[b.length()];

            int anotherCounter = 0;
            for (int counter = 0; counter < a.length(); counter++) {
                for (int newCounter = 0; newCounter < a.length(); newCounter++) {

                    if (newA.charAt(counter) == newA.charAt(newCounter)) {
                        anotherCounter++;
                    }
                    numberInA[counter] = anotherCounter;
                }
                anotherCounter = 0;
            }

            int another1Counter = 0;
            for (int counter = 0; counter < b.length(); counter++) {
                for (int newCounter = 0; newCounter < b.length(); newCounter++) {

                    if (newB.charAt(counter) == newB.charAt(newCounter)) {
                        another1Counter++;
                    }
                    numberInB[counter] = another1Counter;
                }
                another1Counter = 0;
            }

            System.out.println(Arrays.toString(numberInA));
            System.out.println(Arrays.toString(numberInB));

            if (Arrays.equals(numberInA, numberInB)) {
                output = true;
            }
            else {output = false;}
        }

        return output;

    }
}