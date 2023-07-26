/*(Multiples) Write an application that reads two integers, determines whether the first
number tripled is a multiple of the second number doubled, and prints the result. [Hint: Use the
remainder operator.]*/

package Dietel.ChapterTwo;

import java.util.Scanner;

public class Multiples {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int firstEntry = scan.nextInt();
        int secondEntry = scan.nextInt();

        int tripled = firstEntry * 3;
        int doubled  = secondEntry * 2;

        if (tripled % doubled == 0)
            System.out.println(firstEntry + " tripled is a multiple of " + secondEntry + " doubled");
        else
            System.out.println(firstEntry + " tripled is not a multiple of " + secondEntry + " doubled");


    }
}
