package ClassWork;

public class keepSevenSegment {
    public void switchLight(String switchNumber) {
        String[][] lights = {
                {"#","#","#","#"},
                {"#"," "," ","#"},
                {"#","#","#","#"},
                {"#"," "," ","#"},
                {"#","#","#","#"},
        };

        boolean allCondition = (switchNumber.length() == 8 &&
                (switchNumber.charAt(0) == '0' || switchNumber.charAt(0) == '1') &&
                (switchNumber.charAt(1) == '0' || switchNumber.charAt(1) == '1') &&
                (switchNumber.charAt(2) == '0' || switchNumber.charAt(2) == '1') &&
                (switchNumber.charAt(3) == '0' || switchNumber.charAt(3) == '1') &&
                (switchNumber.charAt(4) == '0' || switchNumber.charAt(4) == '1') &&
                (switchNumber.charAt(5) == '0' || switchNumber.charAt(5) == '1') &&
                (switchNumber.charAt(6) == '0' || switchNumber.charAt(6) == '1') &&
                (switchNumber.charAt(7) == '0' || switchNumber.charAt(7) == '1'));

        if (allCondition){
            for (int counter = 0; counter < lights.length; counter++) {
                for (int newCounter = 0; newCounter < lights[counter].length; newCounter++) {

                    if (switchNumber.charAt(7) == '1') {
                        if (switchNumber.charAt(0) == '0') {
                            lights[0][1] = " ";
                            lights[0][2] = " ";
                        }
                        if (switchNumber.charAt(1) == '0') {
                            lights[1][3] = " ";
                        }
                        if (switchNumber.charAt(2) == '0') {
                            lights[3][3] = " ";
                        }
                        if (switchNumber.charAt(4) == '0') {
                            lights[3][0] = " ";
                        }
                        if (switchNumber.charAt(3) == '0') {
                            lights[4][0] = " ";
                            lights[4][1] = " ";
                            lights[4][2] = " ";
                        }
                        if (switchNumber.charAt(5) == '0') {
                            lights[1][0] = " ";
                        }
                        if (switchNumber.charAt(6) == '0') {
                            lights[2][0] = " ";
                            lights[2][1] = " ";
                            lights[2][2] = " ";
                        }
                        String element = lights[counter][newCounter];
                        System.out.print(element + " ");
                    }

                }
                System.out.println();
            }
        }
        else {
            System.out.println("You entry is Invalid, try again");
        }
    }
}
