package OurPracticeTasks.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UniqueElementSort {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(5);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 numbers:  ");
        for (int counter = 0; counter < 10; counter++) {

            int temp = input.nextInt();

            if(!list.contains(temp)) list.add(temp);

        }
        Collections.sort(list);

        System.out.println("The unique numbers entered includes: "+ list);

    }
}
