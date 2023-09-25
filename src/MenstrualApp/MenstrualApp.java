package MenstrualApp;

import javax.swing.*;
import java.util.InputMismatchException;

public class MenstrualApp {

    private static MenstrualCalculator menstrualCalculator = new MenstrualCalculator();

    public static void main(String[] args) {
        welcome();
        startInput();

    }

    private static void welcome() {
        display("""
                Welcome to Menstrual Calculator Application
                Note That:
                +++++ This Application is Made for Women/Ladies With Regular Menstrual Cycle.
                
                +++++ If Your Cycle Is IRREGULAR, Consult your Doctor.
                
                +++++ The Output of this application should be used alongside your personal
                      body Symptoms to get the near perfect predictions.
                      
                +++++ The output depends on the inputs, Kindly Input correct Information.
                      
                """);

    }

    private static void startInput() {
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
        String dateOfLastPeriod = input("""
                Enter the date your last Period started (Format: yyyy-mm-dd)
                """);
        try{
            int cycleLength = Integer.parseInt(input("Enter your cycle length "));
            int flowDays = Integer.parseInt(input("Enter your flow days"));
            String design = "!".repeat(50);
            display(String.format("""
                            %s
                            Next Period Start:  %s
                            Next Period End:  %s
                            %s
                            """,
                    design, menstrualCalculator.getStartDateOfNextPeriod(dateOfLastPeriod, cycleLength, flowDays),
                    menstrualCalculator.getEndDateOfNextPeriod(
                            menstrualCalculator.getStartDateOfNextPeriod(
                                    dateOfLastPeriod,cycleLength,flowDays), flowDays),
                    design));
            startInput();
        } catch (IllegalArgumentException | InputMismatchException error){
            display(error.getMessage());
            safePeriod();
        }
    }

    private static void ovulationPeriod() {
        String dateOfLastPeriod = input("""
                Enter the date your last Period started (Format: yyyy-mm-dd)
                """);
        try{
            int cycleLength = Integer.parseInt(input("Enter your cycle length "));
            int flowDays = Integer.parseInt(input("Enter your flow days"));
            String design = "*".repeat(50);
            display(String.format("""
                            %s
                            Ovulation date: %s
                            %s
                            """,
                    design,
                    menstrualCalculator.getOvulationDay(dateOfLastPeriod, cycleLength, flowDays),
                    design));
            startInput();
        } catch (IllegalArgumentException error) {
            display(error.getMessage());
            ovulationPeriod();
        }
    }

    private static void fertilityPeriod() {
        String ovulationDate = input("Enter your Ovulation Date (Format: yyyy-mm-dd)");

        try{
            String design = "*".repeat(50);
            display(String.format("""
                            %s
                            Fertility Period Start:  %s
                            Fertility Period End:  %s
                            %s
                            """,
                    design, menstrualCalculator.getStartOfFertilityDate(ovulationDate),
                    menstrualCalculator.getEndOfFertilityDate(ovulationDate), design));
            startInput();
        } catch (IllegalArgumentException error){
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
            int cycleLength = Integer.parseInt(input("Enter your cycle length "));
            int flowDays = Integer.parseInt(input("Enter your flow days"));
            String design = "!".repeat(50);
            display(String.format("""
                            %s
                            Safe Period Start:  %s
                            Safe Period End:  %s
                            %s
                            """,
                    design, menstrualCalculator.getStartOfSafePeriod(dateOfLastPeriod, flowDays),
                    menstrualCalculator.getEndOfSafePeriod(dateOfLastPeriod, cycleLength, flowDays),
                    design));
            startInput();
        } catch (IllegalArgumentException | InputMismatchException error){
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
        startInput();
    }

    private static void display(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    private static String input(String prompt) {
        return JOptionPane.showInputDialog(null, prompt);
    }
    
    
}
