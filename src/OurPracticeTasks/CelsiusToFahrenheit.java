package OurPracticeTasks;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the temperature in celsius:  ");
        double celsius = scan.nextDouble();

        double fahrenheit = ( 9.0 / 5) * celsius + 32;

        System.out.println(celsius + " Celcius is " + fahrenheit + " Fahrenheit");

    }
}
