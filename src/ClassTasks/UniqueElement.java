package ClassTasks;

import java.util.Arrays;

public class UniqueElement {

    public static void main(String[] args) {

        int[] items = {1,4,6,9,2,3,4,5,6,2,5,7,8,9};

        System.out.println(Arrays.toString(uniqueElements(items)));

    }

    public static int[] uniqueElements(int... numbers){

        String newNumberList = "";
        String anotherList = "a";

        for (int x = 0; x < numbers.length; x++){

            newNumberList += numbers[x];
        }

        int count = 0;
        for (int y = 0; y < newNumberList.length(); y++) {
            for (int g = 0; g < anotherList.length(); y++){

                if (newNumberList.charAt(y) == anotherList.charAt(g)){
                    count++;
                } else {
                    anotherList += newNumberList.charAt(y) + " ";
                }
            }
        }
        System.out.println(newNumberList);
        int[] newList = new int[numbers.length - count];

        for(int k = 0; k < newList.length; k++){
            newList[k] = anotherList.charAt(k);
        }

        return  newList;
    }
}
