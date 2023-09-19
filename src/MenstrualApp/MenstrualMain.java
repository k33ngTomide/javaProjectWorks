package MenstrualApp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MenstrualMain {

    private static List<Integer> allCycleDays = new ArrayList<>();
    private static List<Integer> allFlowDays = new ArrayList<>();
    private static MenstrualCycle menstrualCycle = new MenstrualCycle();

    private static String startFlowDate;
    private static String endFlowDate;
    public static void main(String[] args) {
        display("Welcome");

        cycleEntry();
        flowDaysEntry();


    }

    private static void cycleEntry() {
        display("Enter Number of days of Menstrual cycle(for the past 8 Month): ");
        collector(allCycleDays);

        Object[] allDays = Arrays.stream(allCycleDays.toArray()).sorted().toArray();
        menstrualCycle.setShortestCycle((Integer) allDays[0]);
        menstrualCycle.setLongestCycle((Integer) allDays[allDays.length - 1]);

        display("shortest cycle = " + menstrualCycle.getShortestCycle());
        display("longest cycle = " + menstrualCycle.getLongestCycle());

        String lastFlowStartDate = menstrualInfoCollector(
                "Enter start of last Menstruation date (in yyyy-MM-dd format):  ");
        String lastFlowEndDate = menstrualInfoCollector(
                "Enter end of last Menstruation date (in yyyy-MM-dd format):  ");
        startFlowDate = lastFlowStartDate;
        endFlowDate = lastFlowEndDate;

        int fertileStart = menstrualCycle.getFertileStart();
        String fertileStartingDate = dateCalculator(lastFlowEndDate, fertileStart);


        int fertileEnd = menstrualCycle.getFertileEnd();
        String fertileEndingDate = dateCalculator(lastFlowEndDate, fertileEnd);

        display("Ovulation starts " + dateCalculator(lastFlowEndDate,menstrualCycle.getOvulationStart()));
        display("Fertile start Date: " + fertileStartingDate + "\t" + "Fertile Ending date: " + fertileEndingDate);

    }

    private static void flowDaysEntry(){
        display("Enter Number of days of flow(for the past 8 Month): ");
        collector(allFlowDays);

        Object[] allDays = Arrays.stream(allFlowDays.toArray()).sorted().toArray();
        menstrualCycle.setShortestFlow((Integer) allDays[0]);
        menstrualCycle.setLongestFlow((Integer) allDays[allDays.length - 1]);

        int shortestFlow = menstrualCycle.getShortestFlow();
        int longestFlow = menstrualCycle.getLongestFlow();

        


    }

    private static void collector(List<Integer> allFlowDays) {
        for (int counter = 0; counter < 8; counter++) {
            String cycleDays = menstrualInfoCollector(
                    "Enter for Month " + (counter + 1) + ": ");
            allFlowDays.add(Integer.parseInt(cycleDays));
        }
    }


    private static String dateCalculator(String dateInputted, int daysToAdd){

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date endDate = dateFormat.parse(dateInputted);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(endDate);
            calendar.add(Calendar.DAY_OF_MONTH, daysToAdd);

            Date resultDate = calendar.getTime();

            return String.format("%s", dateFormat.format(resultDate));
        } catch (ParseException e) {
            display("Invalid date format. Please use yyyy-MM-dd.");
        }

        return null;
    }

    private static String menstrualInfoCollector(String prompt) {
        System.out.print(prompt);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    private static void display(String message){
        System.out.println(message);
    }

}
