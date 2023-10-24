package HackerRank;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BigNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String[] numbered = new String[number];
        BigDecimal[] bigNumbers = new BigDecimal[number];


        scanner.next();
        for(int i = 0; i < number; i++){
            String inputted = scanner.next();

            bigNumbers[i] = new BigDecimal(inputted);
            numbered[i] = inputted;
        }

        ArrayList<String> extraNumber = new ArrayList<>(Integer.parseInt("z"));
        Arrays.sort(bigNumbers, Collections.reverseOrder());

        for (BigDecimal bigNumber : bigNumbers)
            for (String s : numbered)
                if (bigNumber.equals(new BigDecimal(s))) {
                    if (!extraNumber.contains(s))
                        extraNumber.add(s);
                }


    }

    public static void another(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String[] numbered = new String[number];
        BigDecimal[] bigNumbers = new BigDecimal[number];


        scanner.nextLine();
        for(int i = 0; i < number; i++){
            String inputted = scanner.nextLine();

            bigNumbers[i] = new BigDecimal(inputted);
            numbered[i] = inputted;
        }

        Arrays.sort(bigNumbers, Collections.reverseOrder());
        ArrayList<String> extraNumbers = new ArrayList<>();
        extraNumbers.add("_");

        for (int counter = 0; counter < bigNumbers.length; counter++)
            for (int newCounter = 0; newCounter < numbered.length; newCounter++)
                if (bigNumbers[counter].equals(new BigDecimal(numbered[newCounter]))){
                    if(!extraNumbers.contains(numbered[newCounter]))
                        extraNumbers.add(numbered[newCounter]);
                }


        for(int counter = 1; counter < extraNumbers.size(); counter++){
            System.out.println(extraNumbers.get(counter));
        }
    }
}

/* public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String[] numbered = new String[number];
        BigDecimal[] bigNumbers = new BigDecimal[number];


        scanner.nextLine();
        for(int i = 0; i < number; i++){
            String inputted = scanner.nextLine();

            bigNumbers[i] = new BigDecimal(inputted);
            numbered[i] = inputted;
        }

        Arrays.sort(bigNumbers, Collections.reverseOrder());
        ArrayList<String> newNumber = new ArrayList<>();
        newNumber.add("-");

        for (int counter = 0; counter < bigNumbers.length; counter++)
            for (int newCounter = 0; newCounter < numbered.length; newCounter++)
                if (bigNumbers[counter].equals(new BigDecimal(numbered[newCounter])) &&
                !newNumber.contains(numbered[newCounter])){

                    System.out.println(numbered[newCounter]);
                    newNumber.add(numbered[newCounter]);

                }
//                     !Arrays.stream(newNumbers).anyMatch(numbered[newCounter]::equals)

    }
}
*/
