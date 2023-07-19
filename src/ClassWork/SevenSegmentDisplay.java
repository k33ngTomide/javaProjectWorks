package ClassWork;

public class SevenSegmentDisplay {

    public String switchLight(String switchNumber) {
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

        String output = new String();

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
                        if(switchNumber.charAt(0) == '0' && switchNumber.charAt(1) == '0' &&
                                switchNumber.charAt(2) == '0' && switchNumber.charAt(3) == '0') {
                            lights[0][3] = " "; lights[4][0] = "#"; lights[4][3] = " ";
                            lights[2][0] = "#"; lights[2][3] = " ";
                        }


                        String element = lights[counter][newCounter];
                        if(newCounter == lights[counter].length -1) output += element;
                        else output += element + " ";
                    }
                }
                output += "\n";

            }
            return output.trim();
        }
        return " ";
    }

}
