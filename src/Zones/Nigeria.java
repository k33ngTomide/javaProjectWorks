package Zones;

import static Zones.GeoPoliticalZone.*;
import static java.lang.System.*;
import java.util.Scanner;

public class Nigeria {

    public static void main(String... args) {
        Scanner scanner = new Scanner(in);
        
        System.out.println("Enter a state: ");
        String enteredState = scanner.nextLine();

        if (enteredState.trim().matches("^[A-Za-z]*$")){
            String zone = String.valueOf(findZone(enteredState.trim()));
            zoneConvert(zone);
        } else {
            out.println("Invalid State");
            main();
        }
    }

    private static void zoneConvert(String zone) {
        switch (zone) {
            case "NORTH_CENTRAL" -> out.println("North Central");
            case "NORTH_EAST" -> out.println("North East");
            case "NORTH_WEST" -> out.println("North West");
            case "SOUTH_EAST" -> out.println("South East");
            case "SOUTH_SOUTH" -> out.println("South South");
            case "SOUTH_WEST" -> out.println("South West");
            default -> {
                    out.println("Not a State"); main();}
        }
    }

}
