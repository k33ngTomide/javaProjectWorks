package ChapterFour;

import java.util.Scanner;

public class GasMillage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the miles driven:");
        int miles = input.nextInt();

        int totalMiles = 0;
        int totalGallons = 0;

        while (miles != 0){

            System.out.print("Enter the gallon: ");
            int gallons = input.nextInt();

            System.out.println(" The total mile per gallon of this trip is : "
                    + calculateMilePerGallon(miles, gallons));
            totalMiles += miles;
            totalGallons += gallons;

            System.out.print("Enter the miles driven:");
            miles = input.nextInt();


        }

        System.out.println("The overall total miles per gallon for all trips =  " +
                calculateOverall(totalMiles, totalGallons));
    }
    public static double calculateMilePerGallon(int mile, int gallon) {
        return (double) mile / gallon;
    }

    public static double calculateOverall(int tMiles, int tGallons){
        return (double) tMiles/tGallons;
    }

}
