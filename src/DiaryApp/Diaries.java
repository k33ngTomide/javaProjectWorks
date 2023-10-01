package DiaryApp;

//import javax.xml.bind.annotation.XmlElement;
import java.util.*;


public class Diaries {
//    @XmlElement(name = "Diary")
    List<Diary> diaries = new ArrayList<>();
    public void add(String username, String password) {
        checkIfDiaryUsernameAlreadyExists(username);
        Diary diary = new Diary(username, password);
        diaries.add(diary);
    }

    private void checkIfDiaryUsernameAlreadyExists(String username) {
        if(!diaries.isEmpty()) for(Diary diary: diaries) if(diary.getUsername().equals(username))
            throw new IllegalArgumentException("Username Already Exists");

    }

    public Diary findByUsername(String username) {
        for(Diary diary: diaries)
            if (diary.getUsername().equals(username)) return diary;

        throw new IllegalArgumentException("Diary Not Found");
    }

    public void delete(String username, String password) {
        validatePassword(username, password);
        diaries.remove(findByUsername(username));
    }

    public void validatePassword(String username, String password) {
        if(!findByUsername(username).getPassword().equals(password))
            throw new IllegalArgumentException("Incorrect Password");
    }

}
