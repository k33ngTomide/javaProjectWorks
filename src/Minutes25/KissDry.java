package Minutes25;

public class KissDry {


    public static String getWord(String word, int[] indices) {

        String newWord = "";
        for (int counter = 0; counter < indices.length; counter++) {
            newWord += word.charAt(indices[counter]);
        }
        return newWord;
    }
}
