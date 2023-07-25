package ClassWork;

public class CharacterChecker {

    public boolean isSpecialCharacterPresent(String word){

        boolean character = word.contains("#") || word.contains("$") ||
                word.contains("_") || word.contains("-") ||
                word.contains(":") || word.contains(";") || word.contains("=");

        if(character) return  true;

        return false;
    }

}
