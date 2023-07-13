package TheTasks;

import java.util.Scanner;

public class VolumeOfCylinder {

    public static void main(String[] args) {
        Scanner user_entry = new Scanner(System.in);

        System.out.print("Enter the radius and the length of a cylinder:  ");
        double radius = user_entry.nextDouble();
        double length = user_entry.nextDouble();

        double area = radius * radius * Math.PI;
        double volume = area * length;

        System.out.printf("The area is %.4f%nThe volume is %.2f", area, volume);
    }
}
