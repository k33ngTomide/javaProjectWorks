package ClassWork;

public class Isogram {
    private boolean isIsogram = true;


    public boolean isIsogram(String sentence) {
        sentence = sentence.toLowerCase();
        String[] alphabets = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
        "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "y", "z"};

        for (String alphabet : alphabets)
            if (!sentence.contains(alphabet))
                isIsogram = false;

        countLetters(sentence);

        return isIsogram;
    }

    private void countLetters(String word) {
        String newWord = "";
        for (int counter = 0; counter < word.length(); counter++)
            if (String.valueOf(word.charAt(counter)).matches("[a-z]"))
                newWord += String.valueOf(word.charAt(counter));


        String extraWord = newWord.replaceAll(" ", "");
        for (int counter = 0; counter < extraWord.length(); counter++)

            for (int newCounter = counter+1; newCounter < extraWord.length()-1; newCounter++)
                if (extraWord.charAt(counter) == extraWord.charAt(newCounter)) {
                    isIsogram = false;
                    break;
                }

    }

}
