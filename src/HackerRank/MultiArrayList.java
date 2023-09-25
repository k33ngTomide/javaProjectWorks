package HackerRank;

import java.util.*;

public class MultiArrayList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfInput = scanner.nextInt();
        ArrayList<ArrayList<Integer>> numbers = new ArrayList<>();

        for (int counter = 0; counter < numberOfInput; counter++){
            int length = scanner.nextInt();
            ArrayList<Integer> newNumbers = new ArrayList<>();

            for(int count = 0; count < length; count++){
                int filling = scanner.nextInt();

                newNumbers.add(filling);
            }

            numbers.add(newNumbers);
        }
        int newLength = scanner.nextInt();
        scanner.nextLine();
        for (int  newCounter = 0; newCounter < newLength; newCounter++){
            String values = scanner.nextLine();
            String[] realValues = values.split(" ", 2);

            try{

                int first = Integer.parseInt(realValues[0]);
                int second = Integer.parseInt(realValues[1]);
                int output = numbers.get(first-1).get(second-1);
                System.out.println(output);

            } catch (RuntimeException e){
                System.out.println("ERROR!");
            }
        }
    }
}
