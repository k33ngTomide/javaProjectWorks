package HackerRank;

import java.util.Scanner;

public class TagContentExtractor {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while(testCases>0){
            String line = in.nextLine();

            String word= removeTags(line);

            System.out.println(word);

            testCases--;
        }

    }

    public static String removeTags(String input) {

        String regex = "</*[A-z]*[a-z]*[0-9]*>";
        String newLine = input.replaceAll(regex, "");
        return newLine;

    }
}
