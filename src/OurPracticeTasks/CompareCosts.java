package OurPracticeTasks;

import java.util.Scanner;

public class CompareCosts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] packages = new double[2];

        for(int counter = 1; counter < 3; ) {
            System.out.printf("Enter weight and price for package %d: ", counter);
            double weight = scan.nextDouble();
            double price = scan.nextDouble();

            double thePackage = weight / price;
            if(thePackage > 0){
                packages[counter] = thePackage;
                counter++;
            }
            else{
                System.out.println("Invalid Input");
            }
        }

        if(packages[0] > packages[1]){
            System.out.println("Package 1 has better price");
        }else{
            System.out.println("Package 2 has better price");
        }




    }
}
