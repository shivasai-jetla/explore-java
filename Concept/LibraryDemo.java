package Concept;

class LibraryItem {
    String title;
    String author;
    int yearPublished;

    public LibraryItem(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;

        System.out.println("Title: " + title + ", Author: " + author + ", Year Published: " + yearPublished);
    }
}

class Book extends LibraryItem {
    String genre;

    public Book(String title, String author, int yearPublished, String genre) {
        super(title, author, yearPublished);
        this.genre = genre;
        System.out.println("Genre: " + genre);
    }
}

class Magazine extends LibraryItem{

    int issueDate;
    public Magazine(String title, String author, int yearPublished,int issueDate)
    {
        super(title, author, yearPublished);
        this.issueDate = issueDate;
        System.out.println("issueDate: "+issueDate);
    }

}


public class LibraryDemo {
    public static void main(String[] args) {
        LibraryItem book = new Book("Hey", "Hi", 2032, "Drama");
        LibraryItem magazine = new Magazine("hey","hi",343,23);
    }
}

