package ClassWork;

public class NameClass {


    public static String getInitial(String name) {
        String[] realName = name.split(" ", 10);

        String correctName = "";
        for (int counter = 0; counter < realName.length -1; counter++)
            correctName += realName[counter].charAt(0) + ".";

        correctName = correctName.toUpperCase();
        correctName += " " + realName[realName.length-1];

        return correctName;
    }

    public static int getNumericTotal(String alphaNumeric) {
        int total = 0;

        for(int counter = 0; counter < alphaNumeric.length(); counter++)
            if ((alphaNumeric.charAt(counter) + "").matches("[0-9]"))
                total += Integer.parseInt(alphaNumeric.charAt(counter)+"");

        return total;
    }
}
