package Zones;

public enum GeoPoliticalZone {
    NORTH_CENTRAL("Benue", "FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"),
    NORTH_EAST("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
    NORTH_WEST("Kaduna", "Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"),
    SOUTH_EAST("Abia", "Anambra", "Ebonyi", "Enugu", "Imo"),
    SOUTH_SOUTH("AkwaIbom", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers"),
    SOUTH_WEST("Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo");

    public String[] states;

    GeoPoliticalZone(String... states){
        this.states = states;
    }

    public String[] getStates() {
        return states;
    }

    public void setStates(String... states) {
        this.states = states;
    }

    public static GeoPoliticalZone findZone(String state) {
        for(GeoPoliticalZone politicalZone: GeoPoliticalZone.values()){
            for(String zone: politicalZone.states){
                if(zone.equalsIgnoreCase(state)){
                    return politicalZone;
                }
            }
        }
        return null;
    }
}
