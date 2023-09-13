package Dietel.ChapterNine.Book;

import java.time.LocalDate;

public class Book {

    private String title;
    private String author;
    private LocalDate yearOfPublishing;

    public Book(String title, String author, LocalDate yearOfPublishing) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(LocalDate yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Title: " + title + '\n' +
                "Author: " + author + '\n' +
                "Year Of Publishing: " + yearOfPublishing +
                '}';
    }
}
