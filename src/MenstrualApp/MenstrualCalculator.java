package MenstrualApp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MenstrualCalculator {


    public String getOvulationDay(String dateLastPeriodStarted, int cycleLength, int flowDays) {
        int daysToOvulation = (cycleLength + flowDays) / 2;
        return addDaysToDate(dateLastPeriodStarted, daysToOvulation);
    }


    public String getStartOfFertilityDate(String ovulationDate) {
        return addDaysToDate(ovulationDate, -2);
    }
    public String getEndOfFertilityDate(String ovulationDate) {
        return addDaysToDate(ovulationDate, 2);
    }

    public String getStartDateOfNextPeriod(String dateLastPeriodStarted, int cycleLength, int flowDays) {
        int fullCycle = cycleLength + flowDays;
        return addDaysToDate(dateLastPeriodStarted, fullCycle);
    }

    public String getEndDateOfNextPeriod(String startDateOfNextPeriod, int flowDays) {
        return addDaysToDate(startDateOfNextPeriod, flowDays);
    }

    public String getStartOfSafePeriod(String dateLastPeriodStarted, int numberOfFlowDays) {
        return addDaysToDate(dateLastPeriodStarted, numberOfFlowDays + 1);
    }

    public String getEndOfSafePeriod(String dateLastPeriodStart, int cycleLength, int flowDays){
        String ovulationDate = getOvulationDay(dateLastPeriodStart, cycleLength, flowDays);
        return addDaysToDate(ovulationDate, -3);
    }

    private static String addDaysToDate(String dateInputted, int days){
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date endDate = dateFormat.parse(dateInputted);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(endDate);
            calendar.add(Calendar.DAY_OF_YEAR, days);

            Date resultDate = calendar.getTime();
            return String.format("%s", dateFormat.format(resultDate));
        }
        catch (ParseException e){
            throw new IllegalArgumentException(
                    "Date format is Invalid. Correct Format ('yyyy-mm-dd')");
        }
    }
}
