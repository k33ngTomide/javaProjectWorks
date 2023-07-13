package TheTasks;

import java.util.Scanner;

public class SeparatingIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a five digit number: ");
        int userNumber = scan.nextInt();

        if (userNumber > 9999 && userNumber < 100000){
            int firstDigit = userNumber / 10000;
            int secondDigit = (userNumber / 1000) % 10;
            int thirdDigit = (userNumber / 100) % 10;
            int fourthDigit = (userNumber / 10) % 10;
            int lastDigit = userNumber % 10;

            System.out.println(firstDigit + "\t" + secondDigit +
                    "\t" + thirdDigit + "\t" + fourthDigit + "\t" + lastDigit);
        }else {
            System.out.println("The number you entered is not a Five digit number");
        }
    }
}
