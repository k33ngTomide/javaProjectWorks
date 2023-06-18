package ChapterTwo;

import java.util.Scanner;
public class Product {
    public static void main(String[] args) {
        //Sample payroll Calculations
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter an Integer:");
        int b = keyboardInput.nextInt();

        System.out.print("Enter another Integer: ");
        int c = keyboardInput.nextInt();

        int a = b * c;

        System.out.println(a);

        keyboardInput.close();


    }
}
