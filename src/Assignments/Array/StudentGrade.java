package Assignments.Array;

import javax.security.auth.Subject;
import java.util.Arrays;
import java.util.Scanner;

public class StudentGrade {
    int numberOfStudent;
    int numberOfSubjects;

    String[][] studentScores;
    int[] totalScore;
    private static final Scanner userInput = new Scanner(System.in);
    int overallStudentScore;


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

        int total = 0, overallTotal = 0; double average = 0.0;

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
        overallStudentScore = overallTotal;
        positionCalculator();

    }

    public void positionCalculator(){

        Arrays.sort(totalScore);
        int[] newTotalScore = new int[numberOfStudent];

        System.out.println(Arrays.toString(totalScore));
        int index = 1;
        for (int counter = totalScore.length-1; counter > 0; counter--) {
            newTotalScore[index] = totalScore[counter];
            index++;
        }

        System.out.println(Arrays.toString(newTotalScore));

        for (int counter = 1; counter < totalScore.length - 1; counter++) {
            for (int newCounter = 1; newCounter < studentScores[0].length - 3; newCounter++) {

                int value = Integer.parseInt(studentScores[newCounter][(studentScores[0].length) - 3]);

                if ( newTotalScore[counter] == value) {
                    studentScores[newCounter][studentScores[0].length - 1] = String.valueOf(counter);
                }
            }

        }
    }

    public void headerOutput() throws InterruptedException {

        for (int counter = 0; counter < studentScores[0].length; counter++) {
            System.out.printf(String.format("%10s", studentScores[0][counter]));
        }
        System.out.println();
    }

    public void scoreOutput() throws InterruptedException {

        for (int counter = 1; counter < studentScores.length; counter++) {
            for (int newCounter = 0; newCounter < studentScores[counter].length; newCounter++) {
                System.out.printf(String.format("%10s", studentScores[counter][newCounter]));
            }
            System.out.println();
        }
    }

    public static void saver() throws InterruptedException {
        System.out.print("Saving ");
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

        for (int index = 1; index < numberOfSubjects - 3; index++) {
            System.out.println("Subject " + index);
            int[] subjectScores = new int[numberOfStudent];
            for (int counter = 1; counter < studentScores.length - 1; counter++) {
                subjectScores[counter] = Integer.parseInt(studentScores[counter][index]);
                total += Integer.parseInt(studentScores[counter][index]);

                if(Integer.parseInt(studentScores[counter][index]) >= 50){passes++;}
                else if (Integer.parseInt(studentScores[counter][index]) < 50){fails++;}
            }
            Arrays.sort(subjectScores);
            
            String highestScoreStudent = "";
            String lowestScoreStudent = "";

            for (int counter = 1; counter < studentScores.length -1; counter++) {
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
            System.out.println("Total score is: " + total +
                    "\nAverage Score is: " + total/(numberOfStudent-1) +
                    "\nNumber of Passes: " + passes +
                    "\nNumber of Fails: " + fails + "\n");

            total = 0; passes = 0; fails = 0;
        }
    }

}




