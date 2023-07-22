package Assignments;

public enum GeopoliticalZones {

    NORTH_EAST(" Adamawa, Bauchi, Borno, Gombe, Taraba, Yobe States."),
    NORTH_WEST(" Jigawa, Kaduna, Kano, Katsina, Kebbi, Sokoto, Zamfara States."),
    SOUTH_SOUTH( "Akwa Ibom, Bayelsa, Cross River, Delta, Edo, Rivers States."),
    SOUTH_EAST("Abia, Anambra, Ebonyi, Enugu, Imo States"),
    SOUTH_WEST(" Ekiti, Lagos, Ogun, Ondo, Osun, Oyo States."),
    NORTH_CENTRAL("Benue, Kogi, Kwara, Nasarawa, Niger, Plateau States, Federal Capital Territory");

    private final String states;

    GeopoliticalZones(String states){
        this.states = states;
    }

    public String state(){
        return this.states;
    }

}

