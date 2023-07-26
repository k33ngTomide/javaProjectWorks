package Dietel.ChapterFour;

public class WorldPopulationGrowth {
    private double population;
    private double growthRate;

    public static void main(String[] args) {
        WorldPopulationGrowth world =
                new WorldPopulationGrowth(7_975_105_156L, 0.009);

        System.out.printf("%-10s \t %-15s \t %-15s%n", "Year", "Population", "Difference");
        for(int year = 1; year < 75; year++){
            System.out.printf("%-10d \t %-15.0f \t %-15.0f %n",
                    year, world.getGrowth(year), (Math.abs(world.population - world.getGrowth(year))));
        }
    }
    public WorldPopulationGrowth(long population, double growthRate){
        this.population = population;
        this.growthRate = growthRate;
    }
    public double getPopulation() {
        return population;
    }

    public double getRate() {
        return growthRate;
    }

    public double getGrowth(int year) {
        population = population + (population * (growthRate/100) * year);
        return  population;
    }

}
