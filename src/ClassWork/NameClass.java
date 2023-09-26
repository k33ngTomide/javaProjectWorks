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
}
