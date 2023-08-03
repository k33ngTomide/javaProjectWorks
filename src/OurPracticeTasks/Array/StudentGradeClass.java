package OurPracticeTasks.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StudentGradeClass {

    private int studentNumber;
    private  int subjectNumber;

    String[][] scored;
    private Scanner input = new Scanner(System.in);
    private int[] totalScore;
    public static void main(String[] args) throws InterruptedException {
        StudentGradeClass studentGradeClass = new StudentGradeClass();

        studentGradeClass.collectInput();
        System.out.println("=".repeat(studentGradeClass.subjectNumber*10));
        studentGradeClass.headerPrinter();
        System.out.println("\n" + "=".repeat(studentGradeClass.subjectNumber*10));
        studentGradeClass.bodyPrinter();

    }

    public void collectInput() throws InterruptedException {

        System.out.println("How many Students do you have?");
        int studentNumber = input.nextInt();

        System.out.println("How many Subjects do they offer?");
        int subjectNumber = input.nextInt();

        if(studentNumber > 0 && subjectNumber > 0){
            this.studentNumber = studentNumber + 1;
            this.subjectNumber = subjectNumber + 4;
        }
        saving();

        scoreCollector();
    }

    public void scoreCollector() throws InterruptedException {
        String[][] scores = new String[studentNumber][subjectNumber];

        int[] totalScore = new int[studentNumber];

        int total = 0;
        for (int counter = 1; counter <= scores.length - 1; counter++) {
            for (int index = 1; index < scores[counter].length - 3; index++) {

                System.out.println("Enter score for student " + counter);
                System.out.println("Enter score for subject " + index);

                int userEntry = input.nextInt();
                if(userEntry >= 0 && userEntry<= 100){
                    scores[counter][index] = String.valueOf(userEntry);
                    saving();
                    total += userEntry;
                    double average = (double) total /index;

                    totalScore[counter] = total;

                    scores[counter][subjectNumber-3] = String.valueOf(total);
                    scores[counter][subjectNumber-2] = String.format("%.2f", average);

                }
                else {
                    System.out.println("Invalid Input");
                    scoreCollector();
                }

            }
            total = 0;

        }


        scored = scores;
        this.totalScore = totalScore;
        filler();
    }

    public void saving() throws InterruptedException {

        System.out.print("Saving");

        for (int counter = 0; counter < 10; counter ++) {
            System.out.print(">");
            Thread.sleep(150);
        }
        System.out.println();
        System.out.println("Saved Successfully");
    }

    public void headerPrinter(){
        for (int index = 0; index < scored[0].length; index++) {
            System.out.printf("%10s", scored[0][index]);
        }
    }

    public void bodyPrinter(){
        for (int index = 1; index < scored.length; index++) {
            for (int newIndex = 0; newIndex < scored[index].length; newIndex++) {
                System.out.printf("%10s", scored[index][newIndex]);
            }
            System.out.println();

        }
    }

    public void filler(){

        scored[0][0] = "STUDENT";

        for (int index = 1; index < subjectNumber; index++) {
            scored[0][index] = "SUB" + index;
        }
        for (int index = 1; index < studentNumber; index++) {
            scored[index][0] = "Student" + index;
        }
        scored[0][subjectNumber- 3] = "TOT";
        scored[0][subjectNumber- 2] = "AVG";
        scored[0][subjectNumber- 1] = "POS";

        position();
    }

    public void position(){
        System.out.println(Arrays.toString(totalScore));
        Arrays.sort(totalScore);

        System.out.println(Arrays.toString(totalScore));

        for (int counter = 1; counter < totalScore.length; counter++) {
            for (int index = 1; index < scored.length; index++) {
                if (totalScore[counter] == Integer.parseInt(scored[index][scored[0].length -3])){
                    scored[counter][subjectNumber-1] = String.valueOf(studentNumber - counter);
                }
            }
        }
    }
}
