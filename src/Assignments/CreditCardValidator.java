package Assignments;

import java.util.Scanner;

public class CreditCardValidator {

    private String type;
    private String cardNumber;
    private String validityStatus;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CreditCardValidator newCard = new CreditCardValidator();

        System.out.println("Hello, Kindly enter card Details to verify: ");
        String userCardNumber = input.next();

        if (!userCardNumber.isBlank() && userCardNumber.matches("[0-9]+")){
            newCard.cardNumber = userCardNumber;
            newCard.cardTypeDetector(userCardNumber);
            newCard.cardValidityDetector(userCardNumber);

            System.out.println();
            System.out.println("*".repeat(40) +
                    "\n**Credit Card Type: " + newCard.type +
                    "\n**Credit Card Number: " + userCardNumber +
                    "\n**Credit Card Digit Length: " + userCardNumber.length() +
                    "\n**Credit Card Validity status: " + newCard.validityStatus + "\n" +
                    "*".repeat(40));

        }else {
            System.out.println("Credit Card Number cannot be blank or contain letters. \nTry Again!");
        }

    }

    public boolean isCardValid(){
        if (cardNumber.length() >= 13 && cardNumber.length() <= 16) return  true;

        return false;
    }
    public String cardTypeDetector(String cardNumber) {

        if (isCardValid()) {

            if(cardNumber.startsWith("4")) type = "Visa";
            else if (cardNumber.startsWith("5")) type = "MasterCard";
            else if(cardNumber.startsWith("37")) type = "America ExpressCard";
            else if(cardNumber.startsWith("6")) type = "Discover Card";
            else type = "Invalid Card";

        } else{
            type = "Invalid Card";
        }

        return type;
    }

    public String cardValidityDetector(String cardNumber) {

        validityStatus = "Invalid";

        if (isCardValid()) {
            int evenTotal = 0;
            int oddTotal = 0;

            for (int counter = cardNumber.length() - 1; counter >= 0; counter--) {

                if (counter % 2 == 0) {
                    int digit = Integer.parseInt(String.valueOf(cardNumber.charAt(counter)));
                    int newDigit = digit * 2;

                    if (newDigit >= 10) evenTotal += ((newDigit % 10) + (newDigit / 10 % 10));
                    else evenTotal += newDigit;
                }

                if (counter % 2 != 0) {
                    int digit = Integer.parseInt(String.valueOf(cardNumber.charAt(counter)));
                    oddTotal += digit;
                }

            }

            int totalDigits = evenTotal + oddTotal;
            if (totalDigits % 10 == 0) validityStatus = "Valid";
            else validityStatus = "Invalid";

        }
        return validityStatus;
    }
}
