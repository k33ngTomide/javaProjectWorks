package HackerRank;

import java.util.Scanner;

public class Tokens {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        String[] newWord = word.split("[ !,?._&%^'@]");

        int counter = 0;

        for(String token : newWord) if(!token.isEmpty()) counter++;
        System.out.println(counter);

        for (int index = 0; index < newWord.length; index++) {
            System.out.println(newWord[index]);

        }

    }
}
