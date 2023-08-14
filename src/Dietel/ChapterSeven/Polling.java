package Dietel.ChapterSeven;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class Polling {

    private String[] socialConsciousness;
    private int[][] responses = new int[5][10];
    private int[] total = new int[5];
    private int highest = Integer.MIN_VALUE;
    private int smallest = Integer.MAX_VALUE;

    private String issueH = "";
    private String issueS = "";
    public static void main(String[] args) {
        Polling polling = new Polling();

        polling.filler();
        polling.responsesCollection();
        polling.design();
        polling.print();
        out.println("\n");
        polling.design();
        polling.printPointTotal();
        polling.design();

    }
    public void filler(){
        String[] social = {"Exam Malpractice", "Cultism", "Terrorism", "HIV/AIDS", "Human Trafficking"};
        socialConsciousness = social;
    }
    public void responsesCollection(){
        Scanner scanner = new Scanner(in);

        for (int counter = 0; counter < responses[0].length; counter++) {
            for (int newCounter = 0; newCounter < responses.length; newCounter++) {
                out.print("Enter your rating (betwn 1 to 10) for ");
                switch (newCounter){
                    case 0, 2, 1, 3, 4: out.println(socialConsciousness[newCounter] + ": "); break;
                }

                int userResponse = scanner.nextInt();
                responses[newCounter][counter] = userResponse;

                total[newCounter] += userResponse;
            }
        }
    }
    private void design(){
        out.println("=".repeat(77));
    }
    public void print(){

        for (int counter = 0; counter < socialConsciousness.length; counter++){
            out.printf("%20s", socialConsciousness[counter]);
            for (int index = 0; index < responses[0].length; index++) {
                out.printf("%5d", responses[counter][index]);
            }
            out.printf("%7.2f", (double) total[counter]/10);
            out.println();
            out.println("-".repeat(77));
        }
    }

    public void printPointTotal(){
        for(int counter = 0; counter < total.length; counter++) {

            if (total[counter] > highest) {highest = total[counter]; issueH = socialConsciousness[counter];}
            if(total[counter] < smallest) {smallest = total[counter]; issueS = socialConsciousness[counter];}

        }

        out.println("Issue with highest point total is " + issueH + " with " + highest + " point total");
        out.println("Issue with smallest point total is " + issueS + " with " + smallest + " point total");

    }

}
