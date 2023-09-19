package MenstrualApp;

import java.util.Date;

public class MenstrualCycle {

    private int shortestCycle;
    private int longestCycle;
    private int shortestFlow;
    private int longestFlow;
    private Date endOfLastMenstruation;

    public MenstrualCycle(int shortestCycle,
                          int longestCycle,
                          int shortestFlow,
                          int longestFlow) {
        this.shortestCycle = shortestCycle;
        this.longestCycle = longestCycle;
        this.shortestFlow = shortestFlow;
        this.longestFlow = longestFlow;
    }

    public Date getEndOfLastMenstruation() {
        return endOfLastMenstruation;
    }

    public void setEndOfLastMenstruation(Date endOfLastMenstruation) {
        this.endOfLastMenstruation = endOfLastMenstruation;
    }

    public MenstrualCycle(){

    }

    public int getShortestCycle() {
        return shortestCycle;
    }

    public void setShortestCycle(int shortestCycle) {
        this.shortestCycle = shortestCycle;
    }

    public int getLongestCycle() {
        return longestCycle;
    }

    public void setLongestCycle(int longestCycle) {
        this.longestCycle = longestCycle;
    }

    public int getShortestFlow() {
        return shortestFlow;
    }

    public void setShortestFlow(int shortestFlow) {
        this.shortestFlow = shortestFlow;
    }

    public int getLongestFlow() {
        return longestFlow;
    }

    public void setLongestFlow(int longestFlow) {
        this.longestFlow = longestFlow;
    }

    public int getSafeStart() {
        return shortestCycle - 18;
    }

    public int getSafeEnd() {
        return longestCycle - 11;
    }

    public int getOvulationStart() {
        return (shortestCycle + longestCycle) / 2;
    }

    public int getFertileStart() {
        return getOvulationStart() - 2;
    }

    public int getFertileEnd() {
        return getOvulationStart() + 2;
    }


}
