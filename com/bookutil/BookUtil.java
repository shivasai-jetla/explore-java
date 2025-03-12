package com.bookutil;

import com.model.Book;
import com.service.BookStore;

public class BookUtil {

    public static void main(String[] args) {

        BookStore bs = new BookStore();
        Book b1 = new Book("101","man","rr","drama",2000);
        Book b2 = new Book("102","hey","ar","drama",2000);

        bs.addBook(b1);
        System.out.println();
        bs.addBook(b2);
        System.out.println();
        bs.displayAll();
        System.out.println();
        bs.searchByTitle("man");
        System.out.println();
        bs.searchByAuthor("ar");
        System.out.println();
        System.out.println(b1);
    }
}
