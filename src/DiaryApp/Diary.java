package DiaryApp;

import java.util.ArrayList;
import java.util.List;

public class Diary {

    private String username;
    private String password;
    private List<Entry> entries = new ArrayList<>();
    private boolean isLocked;

    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void lockDiary() {
        isLocked = true;
    }

    public void unlockDiary(String password) {
        validatePassword(password);
        isLocked = false;
    }

    private void validatePassword(String password) {
        if(!this.password.equals(password)) throw new IllegalArgumentException("Incorrect Password");
    }

    public void createEntry(String title, String body) {
        Entry entry = new Entry(generateEntryId(), title, body);
        entries.add(entry);
    }

    private int generateEntryId() {
        return entries.size() + 1;
    }

    public Entry findEntryById(int id) {
        for (Entry entry: entries)
            if (entry.getEntryId() == id) return entry;

        throw new IllegalArgumentException("Entry Not Found");
    }

    public void delete(int entryId) {
        Entry entry = findEntryById(entryId);
        entries.remove(entry);
    }

    public void update(int id, String newTitle, String newBody) {
        findEntryById(id).setTitle(newTitle);
        findEntryById(id).setBody(newBody);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword(){return password;}

}
