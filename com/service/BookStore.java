package com.service;

import com.model.Book;

import java.util.ArrayList;

public class BookStore {

    ArrayList<Book> a = new ArrayList<>();

    public void addBook(Book b)
    {

        a.add(b);
    }

    public void searchByTitle(String title)
    {
        for(Book b:a)
        {
            if(b.getTitle().equals(title))
            {
                System.out.println(b);
            }

        }
    }

    public void searchByAuthor(String author)
    {

        for(Book b:a)
        {
            if(b.getAuthor().equals(author))
            {
                System.out.println(b);
            }

        }
    }

    public void displayAll()
    {
        for(Book b : a)
        {
            System.out.println(b);
        }
    }




}
