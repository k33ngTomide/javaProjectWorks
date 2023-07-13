package TheTasks;

import java.util.Scanner;

public class QuadraticEquations {

    public static void main(String[] args) {
        Scanner standardInput = new Scanner(System.in);

        System.out.print("Enter a, b and c:  ");
        double a = standardInput.nextDouble();
        double b = standardInput.nextDouble();
        double c = standardInput.nextDouble();

        double discriminant = (b*b) - (4*a*c);

        double r1 = (-b + Math.pow(discriminant, 0.5))/ (2*a);
        double r2 = (-b - Math.pow(discriminant, 0.5))/ (2*a);

        if (discriminant > 0) {
            System.out.printf("The equation has two roots %f and %f.", r1, r2);
        }
        else if (discriminant == 0) {
            System.out.printf("The equation has one root %f", r1);
        }
        else {
            System.out.println("The equation has no roots");
        }

    }

}
