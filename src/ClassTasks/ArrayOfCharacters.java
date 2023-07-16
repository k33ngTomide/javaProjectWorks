package ClassTasks;

import java.util.Arrays;

public class ArrayOfCharacters {

    public static void main(String[] args) {

        char[] characters = new char[10];

        characters[characters.length -1 ] = 'E';

        System.out.println(Arrays.toString(characters));

        for (int counter = 0; counter < characters.length; counter++) {
            if (counter%2 != 0) characters[counter] = 'A';
        }
        System.out.println(Arrays.toString(characters));

        for (int counter = 0; counter < characters.length; counter++) {
            if (counter%2 == 0) characters[counter] = 'L';
            if(counter == 2) characters[counter] = 'F';
        }
        System.out.println(Arrays.toString(characters));

        for (int counter = 0; counter < characters.length; counter++) {
            characters[counter] = '5';
        }
        System.out.println(Arrays.toString(characters));
    }

}
