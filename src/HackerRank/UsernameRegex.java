package HackerRank;

import java.util.Scanner;

public class UsernameRegex {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number >= 1 && number <= 100){
            for(int x = 0; x < number; x++){
                String userInput = scanner.next();
                if(userInput.length() >= 8 && userInput.length() <= 30){
                    if(userInput.matches("^[A-Za-z]+([_]*[0-9]*[_]*[A-Za-z]*)+$"))
                        System.out.println("Valid");
                    else
                        System.out.println("Invalid");
                }
                else
                    System.out.println("Invalid");
            }
        }
    }
}
