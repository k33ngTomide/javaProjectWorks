package DiaryApp;

import java.time.LocalDateTime;
import java.util.Objects;

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
        String design = "*".repeat(20);
        return  "\n" + design + "\nEntry Id: " + getEntryId() + "\nTitle: " + getTitle() + "\nBody: "
                + getBody() + "\nDate Created: " + dateCreated + "\n" + design + "\n";
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entry entry = (Entry) o;
        return id == entry.id &&
                Objects.equals(title, entry.title) &&
                Objects.equals(body, entry.body);
    }
}
