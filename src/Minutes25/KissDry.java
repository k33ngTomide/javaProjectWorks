package Minutes25;

public class KissDry {


    public static String getWord(String word, int[] indices) {

        StringBuilder newWord = new StringBuilder();
        for (int counter = 0; counter < indices.length; counter++) {
            newWord.append(word.charAt(indices[counter]));
        }
        return newWord.toString();
    }
}
