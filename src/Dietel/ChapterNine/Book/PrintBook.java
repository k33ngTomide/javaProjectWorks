package Dietel.ChapterNine.Book;

import java.time.LocalDate;

public class PrintBook extends Book{

    private String publisher;
    private final String ISBN;

    public PrintBook(String title, String author, LocalDate yearOfPublishing, String publisher, String ISBN) {
        super(title, author, yearOfPublishing);
        this.publisher = publisher;
        this.ISBN = ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "Print Book\n" +
                "Title: " + getTitle() + '\n' +
                "Author: " + getAuthor() + '\n' +
                "Year Of Publishing: " + getYearOfPublishing() + "\n" +
                "publisher: " + publisher + '\n' +
                "ISBN: " + ISBN;
    }
}
