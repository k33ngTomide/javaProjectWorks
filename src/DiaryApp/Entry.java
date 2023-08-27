package DiaryApp;

import java.time.LocalDateTime;
import java.util.Date;

public class Entry {
    private int id;
    private String title;
    private String body;
    private final LocalDateTime dateCreated = LocalDateTime.now();

    public Entry(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public String getEntryDetails(){
        return "Entry Id: " + getEntryId() + "\nTitle: " + getTitle() + "\nBody: "
                + getBody() + "\nDate Created: " + dateCreated;
    }

    private String getBody() {
        return body;
    }

    private String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getEntryId() {
        return id;
    }
}
