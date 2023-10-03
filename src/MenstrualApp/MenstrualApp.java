package MenstrualApp;

import javax.swing.*;
import java.util.InputMismatchException;

public class MenstrualApp {

    private static MenstrualCalculator menstrualCalculator;

    public static void main(String[] args) {
        welcome();
        firstDisplay();
        startApplication();

    }



    private static void welcome() {
        display("""
                Welcome to Menstrual Calculator Application
                Note That:
                +++++ This Application is Made for Women/Ladies With Regular Menstrual Cycle.
                
                +++++ If Your Cycle Is IRREGULAR, Consult your Doctor.
                
                +++++ The Output of this application should be used alongside your personal
                      body Symptoms to get the perfect predictions.
                      
                +++++ The output depends on the dates user input, Kindly Input correct Information.
                      
                """);

    }

    private static void firstDisplay() {
        String userInput =  input("""
                Enter:
                1. Input all Menstrual Information
                2. Exit""");

        switch (userInput) {
            case "1" -> collectInput();
            case "2" -> exitApplication();
            default -> {
                display("Invalid Input");
                firstDisplay();
            }
        }
    }

    private static void collectInput() {
        try{
            String startDate = input("Enter the date your last period started: ");
            int numberOfFlowDays = Integer.parseInt(input("Enter the normal number of days of your flow: "));
            int cycleLength = Integer.parseInt(input("Enter "));

            validateDate(startDate);
            validateInput(numberOfFlowDays, cycleLength);

            menstrualCalculator = new MenstrualCalculator(startDate, cycleLength, numberOfFlowDays);
        }
        catch(IllegalArgumentException error){display(error.getMessage());}
        catch (InputMismatchException error){
            display("Invalid Input");
        }

    }

    private static void validateInput(int numberOfFlowDays, int cycleLength) {
        if (numberOfFlowDays > 7 || numberOfFlowDays <= 3)
            throw new IllegalArgumentException("Number of days of flow must be between 21 and 35");
        if(cycleLength > 35 || cycleLength < 21)
            throw new IllegalArgumentException("Cycle length must be between 21 and 35");
    }

    private static void startApplication() {
        String userInput = input("""
                                        What Do you want to do?
                                        1. Know Next Period Date.
                                        2. Get Ovulation Period.
                                        3. Get Fertility Period.
                                        4. Get Safe Period.
                                        5. Exit.
                                        
                                        Enter Your Choice""");
        switch (userInput){
            case "1" -> nextPeriod();
            case "2" -> ovulationPeriod();
            case "3" -> fertilityPeriod();
            case "4" -> safePeriod();
            case "5" -> exitApplication();
            default -> invalidInput();
        }
    }

    private static void nextPeriod() {

        try{
            String design = "!".repeat(50);
            display(String.format("""
                            %s
                            Next Period Start:  %s
                            Next Period End:  %s
                            %s
                            """,
                    design, menstrualCalculator.getStartDateOfNextPeriod(),
                    menstrualCalculator.getEndDateOfNextPeriod(),
                    design));
            startApplication();
        } catch (IllegalArgumentException | InputMismatchException | NullPointerException error){
            display(error.getMessage());
            safePeriod();
        }
    }

    private static void validateDate(String dateOfLastPeriod) {
        if (!dateOfLastPeriod.startsWith("2023"))
            throw new IllegalArgumentException("Invalid date");
    }

    private static void ovulationPeriod() {
        try{
            String design = "*".repeat(50);
            display(String.format("""
                            %s
                            Ovulation date: %s
                            %s
                            """,
                    design,
                    menstrualCalculator.getOvulationDay(),
                    design));
            startApplication();
        } catch (IllegalArgumentException | NullPointerException error) {
            display(error.getMessage());
            ovulationPeriod();
        }
    }

    private static void fertilityPeriod() {
        String ovulationDate = input("Enter your Ovulation Date (Format: yyyy-mm-dd)");

        try{
            validateDate(ovulationDate);
            String design = "*".repeat(50);
            display(String.format("""
                            %s
                            Fertility Period Start:  %s
                            Fertility Period End:  %s
                            %s
                            """,
                    design, menstrualCalculator.getStartOfFertilityDate(),
                    menstrualCalculator.getEndOfFertilityDate(), design));
            startApplication();
        } catch (IllegalArgumentException | NullPointerException error){
            display(error.getMessage());
            fertilityPeriod();
        }
    }

    private static void safePeriod() {
        String dateOfLastPeriod = input("""
                Remember: Abstinence is the the 100% way to be safe.
                
                Enter the date your last Period started (Format: yyyy-mm-dd)
                """);
        try{
            validateDate(dateOfLastPeriod);
            int cycleLength = Integer.parseInt(input("Enter your cycle length "));
            int flowDays = Integer.parseInt(input("Enter your flow days"));
            String design = "!".repeat(50);
            display(String.format("""
                            %s
                            Safe Period Start:  %s
                            Safe Period End:  %s
                            %s
                            """,
                    design, menstrualCalculator.getStartOfSafePeriod(),
                    menstrualCalculator.getEndOfSafePeriod(),
                    design));
            startApplication();
        } catch (IllegalArgumentException | InputMismatchException | NullPointerException error){
            display(error.getMessage());
            safePeriod();
        }
    }

    private static void exitApplication() {
        display("Stay Safe, Remember to use protection... Bye");
        System.exit(1);
    }

    private static void invalidInput() {
        display("Invalid Input");
        startApplication();
    }

    private static void display(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    private static String input(String prompt) {
        return JOptionPane.showInputDialog(null, prompt);
    }
    
    
}
