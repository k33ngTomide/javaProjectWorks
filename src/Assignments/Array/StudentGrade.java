package Assignments.Array;

import java.util.Arrays;
import java.util.Scanner;

public class StudentGrade {
    private int numberOfStudent;
    private int numberOfSubjects;

    private String[][] studentScores;
    private int[] totalScore;
    private static final Scanner userInput = new Scanner(System.in);
    private int overallStudentScore;
    private int totalNumberOfEntries;

    public static void main(String[] args) throws InterruptedException {
        StudentGrade studentGrade = new StudentGrade();

            studentGrade.inputChecker();
            System.out.println("=".repeat((studentGrade.numberOfSubjects)*10));
            studentGrade.headerOutput();

            System.out.println("=".repeat((studentGrade.numberOfSubjects)*10));
            studentGrade.scoreOutput();
            System.out.println("=".repeat((studentGrade.numberOfSubjects)*10));
            System.out.println("=".repeat((studentGrade.numberOfSubjects)*10));

            studentGrade.subjectSummary();
            System.out.println("=".repeat((studentGrade.numberOfSubjects)*10));
    }
    public void inputChecker() throws InterruptedException {
        System.out.print("Enter the number of Students:  ");
        String userNumberOfStudents = userInput.next();

        System.out.print("Enter the number of subjects: ");
        String userNumberOfSubjects = userInput.next();

        if (userNumberOfStudents.matches("[0-9]+") &&
                userNumberOfSubjects.matches("[0-9]+")) {
            setStudentAndSubjectNumber(Integer.parseInt(userNumberOfStudents) + 1,
                    Integer.parseInt(userNumberOfSubjects) + 4);
            saver();
        } else {
            System.out.println("Invalid Input");
            inputChecker();
        }
        headerFiller();
    }

    public void setStudentAndSubjectNumber(int numberOfStudent, int numberOfSubjects) {
        if (numberOfStudent > 0 && numberOfSubjects > 0) {
            this.numberOfStudent = numberOfStudent;
            this.numberOfSubjects = numberOfSubjects;
        }
    }

    public void headerFiller() throws InterruptedException {
        String[][] scoreEntry = new String[numberOfStudent][numberOfSubjects];


        scoreEntry[0][0] = "STUDENT  ";
        for (int counter = 1; counter < scoreEntry.length; counter++) {
            scoreEntry[counter][0] = "Student " + counter;
        }

        for (int counter = 1; counter < scoreEntry[0].length; counter++) {
            scoreEntry[0][counter] = "SUB" + counter;
        }

        scoreEntry[0][scoreEntry[0].length - 1] = "POSTN";
        scoreEntry[0][scoreEntry[0].length - 2] = "AVEG";
        scoreEntry[0][scoreEntry[0].length - 3] = "TOTL";

        studentScores = scoreEntry;
        scoresFiller();
    }

    public void scoresFiller() throws InterruptedException {
        int[] studentTotalScore = new int[numberOfStudent];

        int total = 0, overallTotal = 0, totalEntry= 0; double average = 0.0;

        for ( int index = 1; index < studentScores.length; index++) {
            for (int newIndex = 1; newIndex <= studentScores[index].length - 4; ) {
                System.out.println("Entering score for " + studentScores[index][0]);
                System.out.println("Entering score for subject " + newIndex);
                String input = userInput.next();

                if (input.matches("[0-9]+") && Integer.parseInt(input) >= 0 &&
                        Integer.parseInt(input) <= 100) {

                    int score = Integer.parseInt(input);
                    studentScores[index][newIndex] = String.valueOf(score);
                    total += score;
                    average = (double) total / newIndex;
                    newIndex++;
                    overallTotal += score;
                    totalEntry++;
                    saver();

                } else {

                    System.out.println("Invalid Score, Student score should be between 0 and 100");
                    scoresFiller();

                }

                studentScores[index][studentScores[index].length - 3] = String.valueOf(total);
                studentTotalScore[index] = total;
                studentScores[index][studentScores[index].length - 2] = String.format("%.2f", average);

            }
            total = 0;
            average = 0.0;
        }

        totalScore = studentTotalScore;
        overallStudentScore = overallTotal; totalNumberOfEntries = totalEntry;
        positionCalculator();

    }

    public void positionCalculator(){

        Arrays.sort(totalScore);

        System.out.println(Arrays.toString(totalScore));

        for (int counter = 1; counter < totalScore.length; counter++) {
            for (int newCounter = 1; newCounter < numberOfStudent; newCounter++) {

                int value = Integer.parseInt(studentScores[newCounter][(studentScores[0].length) - 3]);

                if ( totalScore[counter] == value) {
                    studentScores[newCounter][studentScores[0].length - 1] = String.valueOf(numberOfStudent - counter);
                }
            }

        }
    }

    public void headerOutput(){

        for (int counter = 0; counter < studentScores[0].length; counter++) {
            System.out.printf(String.format("%10s", studentScores[0][counter]));
        }
        System.out.println();
    }

    public void scoreOutput() {

        for (int counter = 1; counter < studentScores.length; counter++) {
            for (int newCounter = 0; newCounter < studentScores[counter].length; newCounter++) {
                System.out.printf(String.format("%10s", studentScores[counter][newCounter]));
            }
            System.out.println();
        }
    }

    public static void saver() throws InterruptedException {
        System.out.print("\nSaving ");
        for (int counter = 0; counter < 10; counter++) {
            System.out.print(">");
            Thread.sleep(100);
        }
        System.out.println();
        System.out.println("Saved Successfully\n");
    }

    public void subjectSummary(){
        System.out.println("SUBJECT SUMMARY");
        int total = 0, passes = 0, fails = 0;

        int failed = Integer.MIN_VALUE, passed = Integer.MIN_VALUE;
        int numberOfFailures = 0, numberOfPasses = 0;
        int worstSubjectSaver = 0, bestSubjectSaver = 0;

        int lowestScore = Integer.MAX_VALUE, highestScore = Integer.MIN_VALUE;
        String highScoreStudent = "", lowScoreStudent = "";
        String highSubject = "", lowSubject = "";

        for (int index = 1; index < numberOfSubjects - 3; index++) {
            System.out.println("Subject " + index);
            int[] subjectScores = new int[numberOfStudent];
            for (int counter = 1; counter < numberOfStudent; counter++) {
                subjectScores[counter] = Integer.parseInt(studentScores[counter][index]);
                total += Integer.parseInt(studentScores[counter][index]);

                if(Integer.parseInt(studentScores[counter][index]) >= 50){passes++;}
                else if (Integer.parseInt(studentScores[counter][index]) < 50){fails++;}

                if (Integer.parseInt(studentScores[counter][index]) > highestScore ){
                    highestScore = Integer.parseInt(studentScores[counter][index]);
                    highScoreStudent = studentScores[index][0];
                    highSubject = studentScores[0][index];
                }
                if (Integer.parseInt(studentScores[counter][index]) < lowestScore ){
                    lowestScore = Integer.parseInt(studentScores[counter][index]);
                    lowScoreStudent = studentScores[index][0];
                }
            }

            if (fails > failed){
                failed = fails;
                worstSubjectSaver = index;
                numberOfFailures = fails;
            }

            if (passes > passed){
                passed = passes;
                bestSubjectSaver = index;
                numberOfPasses = passes;
            }

            Arrays.sort(subjectScores);
            
            String highestScoreStudent = "";
            String lowestScoreStudent = "";

            for (int counter = 1; counter < studentScores.length; counter++) {
                if(subjectScores[1] == Integer.parseInt(studentScores[counter][index])){
                    lowestScoreStudent += studentScores[counter][0];
                }
                if(subjectScores[numberOfStudent - 2] == Integer.parseInt(studentScores[counter][index])){
                    highestScoreStudent += studentScores[counter][0];
                }
            }

            System.out.printf("Highest Scoring student is: %s scoring %d%n", highestScoreStudent,
                    subjectScores[numberOfStudent - 2] );
            System.out.printf("Lowest Scoring student is: %s scoring %d%n", lowestScoreStudent,
                    subjectScores[1]);
            System.out.println("Total score is: " + total);
            System.out.printf("Average Score is :%.2f%n ", (double)total/(numberOfStudent-1));
            System.out.println("Number of Passes: " + passes +
                    "\nNumber of Fails: " + fails + "\n");

            total = 0; passes = 0; fails = 0;

        }

        System.out.println("\nThe hardest subject is  Subject " + worstSubjectSaver +
                " with " + numberOfFailures + " failures");
        System.out.println("The easiest subject is  Subject " + bestSubjectSaver +
                " with " + numberOfPasses + " passes" );
        System.out.println("The overall highest score is scored by " +
                highScoreStudent + " in " + highSubject + " scoring " + highestScore);
        System.out.println("The overall lowest score is scored by " + lowScoreStudent +
                " in " + lowSubject + " scoring " + lowestScore);
        System.out.println("=".repeat(65));
        classSummary();
    }

    public void classSummary(){
        Arrays.sort(totalScore);

        int highestScore = totalScore.length - 1;
        int lowestScore = totalScore[1];

        for(int counter = 1; counter < totalScore.length; counter++ ){

            if (highestScore == Integer.parseInt(studentScores[counter][studentScores[0].length - 3])){
                System.out.println();
                System.out.println("=".repeat(55));
                System.out.println("The Best Graduating Student is: " + studentScores[counter][0]  + " scoring " +
                        studentScores[counter][studentScores[0].length-3]);
                System.out.println("=".repeat(55)+ "\n\n");
            }

            if(lowestScore == Integer.parseInt(studentScores[counter][studentScores[0].length - 3])){
                System.out.println("!".repeat(55));
                System.out.println("The Worst Graduating Student is: " + studentScores[counter][0]  + " scoring " +
                        studentScores[counter][studentScores[0].length-3]);
                System.out.println("!".repeat(55) + "\n");
            }

        }

        System.out.println("=".repeat(35));
        System.out.println("Class Total is: " + overallStudentScore);
        System.out.println("Class Average is: " + overallStudentScore/totalNumberOfEntries);
        System.out.println("=".repeat(35));
    }
}




