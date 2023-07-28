package Exercises.Rectangle;

import java.util.Scanner;

public class RectangleTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle[] rectangles = new Rectangle[3];

        for (int counter = 0; counter < rectangles.length; ) {
            System.out.println("Do you want to enter the width and height (y/n): ");

            char choice = scanner.next().charAt(0);
            if (choice == 'y'){
                System.out.print("Enter the width and the height: ");
                rectangles[counter] = new Rectangle(scanner.nextDouble(), scanner.nextDouble());
                counter++;
            }
            else if (choice == 'n'){
                rectangles[counter] = new Rectangle();
                counter++;
            }
            else
                System.out.println("Invalid option, Try again!!");
            
        }

        for (int counter = 0; counter < rectangles.length; counter++) {
            System.out.println("Rectangle " + (counter+1) +
                    ": width:" + rectangles[counter].getWidth() +
                    ", height: " + rectangles[counter].getHeight());
        }

    }
}
