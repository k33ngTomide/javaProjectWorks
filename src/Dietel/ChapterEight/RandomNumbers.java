package Dietel.ChapterEight;

import java.security.SecureRandom;
import java.util.Scanner;

public class RandomNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SecureRandom secureRandom = new SecureRandom();

        int count = scanner.nextInt();
        for (int counter = 0; counter < count; counter++)
            System.out.println(secureRandom.nextInt(10,100));

    }
}
