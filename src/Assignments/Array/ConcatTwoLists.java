package Assignments.Array;

public class ConcatTwoLists {

    public static String addTwoLists(String[] firstList, String[] secondList) {
        String newList = "";

        for (int counter = 0; counter < firstList.length; counter++) {
            String collector = (firstList[counter]);

            newList += collector + ", ";
        }

        for (int counter = 0; counter < secondList.length; counter++) {
            String newCollector = secondList[counter];

            if (counter == secondList.length - 1)newList += newCollector;
            else newList += newCollector + ", ";
        }
        return newList.trim();
    }
}
