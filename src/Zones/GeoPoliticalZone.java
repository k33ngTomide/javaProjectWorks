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
            final GeoPoliticalZone politicalZone1 = getGeoPoliticalZone(state, politicalZone);
            if (politicalZone1 != null) return politicalZone1;
        }
        return null;
    }

    private static GeoPoliticalZone getGeoPoliticalZone(String state, GeoPoliticalZone politicalZone) {
        for(String zone: politicalZone.states){
            final GeoPoliticalZone political = checkState(state, politicalZone, zone);
            if (political != null) return political;
        }
        return null;
    }

    private static GeoPoliticalZone checkState(String state, GeoPoliticalZone politicalZone, String zone) {
        if(zone.equalsIgnoreCase(state)){
            return politicalZone;
        }
        return null;
    }
}
