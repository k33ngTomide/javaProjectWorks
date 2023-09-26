package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListInsertDelete {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        ArrayList<Integer> integers = new ArrayList<>();

        for(int counter = 0; counter < length; counter++){
            int number = scanner.nextInt();
            integers.add(number);
        }

        int newLength = scanner.nextInt();
        scanner.nextLine();

        for (int newCounter = 0; newCounter < newLength; newCounter++){

            String function = scanner.nextLine();

            if(function.equals("Insert")){
                String order = scanner.nextLine();

                String[] sepOrder = order.split(" ", 2);

                int first = Integer.parseInt(sepOrder[0]);
                int second = Integer.parseInt(sepOrder[1]);

                integers.add(first, second);
            }

            if (function.equals("Delete")){
                String order = scanner.next();
                integers.remove(Integer.parseInt(order));
            }
        }

        for(int counter = 0; counter < integers.size(); counter++){
            System.out.print(integers.get(counter) + " ");
        }
    }
}
