package HackerRank;

import java.util.Scanner;

public class Substring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        int k = scanner.nextInt();

        System.out.println(getSmallestAndLargest(s, k));
    }

    public static String getSmallestAndLargest(String s, int k){

        String largest = "";
        String smallest = "";

        for (int index = 0; index <= s.length() - k; index++) {

            String word = s.substring(index, index+k);

            if (index == 0){
                largest = word;
                smallest = word;
            }
            if(index > 0){
                if (word.compareTo(largest) > 0)  largest = word;
                if (word.compareTo(smallest) < 0) smallest = word;
            }

        }
        return smallest + "\n" + largest;
    }

}