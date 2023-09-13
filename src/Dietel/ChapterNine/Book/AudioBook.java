package Dietel.ChapterNine.Book;

import java.time.LocalDate;

public class AudioBook extends Book {

    private String bookSize;
    private String playLength;
    private String playBackArtist;


    public AudioBook(String title, String author, LocalDate yearOfPublishing,
                     String bookSize, String playLength, String playBackArtist) {
        super(title, author, yearOfPublishing);
        this.bookSize = bookSize;
        this.playLength = playLength;
        this.playBackArtist = playBackArtist;
    }

    public String getBookSize() {
        return bookSize;
    }

    public void setBookSize(String bookSize) {
        this.bookSize = bookSize;
    }

    public String getPlayLength() {
        return playLength;
    }

    public void setPlayLength(String playLength) {
        this.playLength = playLength;
    }

    public String getPlayBackArtist() {
        return playBackArtist;
    }

    public void setPlayBackArtist(String playBackArtist) {
        this.playBackArtist = playBackArtist;
    }

    @Override
    public String toString(){
        return "Audio Book\n" +
                "Title: " + getTitle() + '\n' +
                "Author: " + getAuthor() + '\n' +
                "Year Of Publishing: " + getYearOfPublishing() + "\n" +
                "Book Size: " + bookSize + '\n' +
                "Play Length: " + playLength + '\n' +
                "Play Back Artist: " + playBackArtist;
    }
}
