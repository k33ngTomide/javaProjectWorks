package Exercises;

import java.util.Scanner;

public class GratuityCalculator{

    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter subtotal and a gratuity rate: ");
        double subtotal = keyboardInput.nextDouble();
        double gratuityRate = keyboardInput.nextDouble();

        double gratuity = subtotal * (gratuityRate/100);
        double total = gratuity + subtotal;


        System.out.printf("The Gratuity is $%.1f, and the total is $%.1f", gratuity, total);




    }
}
