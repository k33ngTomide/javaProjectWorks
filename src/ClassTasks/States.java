package ClassTasks;

public enum States {

    ADAMAWA("yola"),
    AKWA_IBOM(""),
    ANAMBRA(""),
    BAUCHI(""),
    BAYELSA(""),
    BENUE(""),
    BORNO(""),
    CROSS_RIVER(""),
    DELTA(""),
    EBONYI(""),
    EDO(""),
    EKITI(""),
    ENUGUN(""),
    GOMBE(""),
    JIGAWA(""),
    KADUNA(""),
    KEBBI(""),
    KOGI(""),
    KWARA(""),
    LAGOS(""),
    NASARAWA(""),
    NIGER(""),
    OGUN(""),
    ONDO(""),
    OSUN(""),
    OYO(""),
    PLATEAU(""),
    RIVER(""),
    SOKOTO(""),
    TARABA(""),
    YOBE(""),
    ZAMFARA(""),
    FCT(""),
    IMO("");

    private final String localGovernments;

    States(String localGovernments){this.localGovernments = localGovernments;}

    private String getLocalGovernments(){
        return localGovernments;
    }


}


