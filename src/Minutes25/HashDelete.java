package Minutes25;

public class HashDelete {
    public static boolean implBackSpace(String firstWord, String secondWord) {
        firstWord = useBackSpace(firstWord);
        secondWord = useBackSpace(secondWord);

        if(firstWord.equals(secondWord)) return true;
        return false;

    }

    private static String useBackSpace(String word){
        String newWord = "";

        for (int counter = 0; counter < word.length(); counter++) {
            if(word.charAt(counter) == '#') {
                newWord = word.replace(word.charAt(counter), ' ')
                        .replace(word.charAt(counter - 1), ' ');
            }
        }
        return newWord;
    }
}
