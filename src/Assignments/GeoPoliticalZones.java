package Assignments;

public enum GeoPoliticalZones {

    NORTH_EAST(" Adamawa, Bauchi, Borno, Gombe, Taraba, Yobe ClassTasks.States."),
    NORTH_WEST(" Jigawa, Kaduna, Kano, Katsina, Kebbi, Sokoto, Zamfara ClassTasks.States."),
    SOUTH_SOUTH( "Akwa Ibom, Bayelsa, Cross River, Delta, Edo, Rivers ClassTasks.States."),
    SOUTH_EAST("Abia, Anambra, Ebonyi, Enugu, Imo ClassTasks.States"),
    SOUTH_WEST(" Ekiti, Lagos, Ogun, Ondo, Osun, Oyo ClassTasks.States."),
    NORTH_CENTRAL("Benue, Kogi, Kwara, Nasarawa, Niger, Plateau ClassTasks.States, Federal Capital Territory");

    private final String states;

    GeoPoliticalZones(String states){
        this.states = states;
    }

    public String state(){
        return this.states;
    }

}

