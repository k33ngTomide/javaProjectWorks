package MenstrualApp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MenstrualCalculator {

    private String dateLastPeriodStarted;
    private int cycleLength;
    private int flowDays;

    public MenstrualCalculator(String dateLastPeriodStarted, int cycleLength, int flowDays){
        this.dateLastPeriodStarted = dateLastPeriodStarted;
        this.cycleLength = cycleLength;
        this.flowDays = flowDays;
    }


    public String getOvulationDay() {
        int daysToOvulation = (cycleLength) / 2;
        return addDaysToDate(dateLastPeriodStarted, daysToOvulation);
    }


    public String getStartOfFertilityDate() {
        return addDaysToDate(getOvulationDay(), -2);
    }
    public String getEndOfFertilityDate() {
        return addDaysToDate(getOvulationDay(), 2);
    }

    public String getStartDateOfNextPeriod() {
        int fullCycle = getCycleLength() + getFlowDays();
        return addDaysToDate(getDateLastPeriodStarted(), fullCycle);
    }

    public String getEndDateOfNextPeriod() {
        return addDaysToDate(getStartDateOfNextPeriod(), flowDays);
    }

    public String getStartOfSafePeriod() {
        return addDaysToDate(getDateLastPeriodStarted(), getFlowDays() + 1);
    }

    public String getEndOfSafePeriod(){
        String ovulationDate = getOvulationDay();
        return addDaysToDate(ovulationDate, -3);
    }

    private static String addDaysToDate(String dateInputted, int days){
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date endDate = dateFormat.parse(dateInputted);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(endDate);
            calendar.add(Calendar.DAY_OF_MONTH, days);

            Date resultDate = calendar.getTime();
            return String.format("%s", dateFormat.format(resultDate));
        }
        catch (ParseException e){
            throw new IllegalArgumentException(
                    "Date format is Invalid. Correct Format ('yyyy-mm-dd')");
        }

    }


    public String getDateLastPeriodStarted() {
        return dateLastPeriodStarted;
    }

    public int getCycleLength() {
        return cycleLength;
    }

    public int getFlowDays() {
        return flowDays;
    }
}
