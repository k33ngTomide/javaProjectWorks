/*(Separating the Digits in an Integer) Write an application that inputs one number consisting
of five digits from the user, separates the number into its individual digits and prints the digits
separated from one another by three spaces each. For example, if the user types in the number 42339,
the program should print 4  2   3   3   9 */

package ChapterTwo;

import java.util.Scanner;

public class SeparatingDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a five digit number: ");
        int userEntry = scan.nextInt();

        int lastDigit = userEntry % 10;
        int fourthDigit = userEntry /10 %10;
        int thirdDigit = userEntry /100 %10;
        int secondDigit = userEntry/1000 %10;
        int firstDigit = userEntry /10000;

        System.out.println(firstDigit + "   " + secondDigit + "    " +
                thirdDigit + "    " + fourthDigit + "    " + lastDigit);
    }
}
