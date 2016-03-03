package com.thoughtworks.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 3/3/16.
 */
public class Library {

    private List<Book> books;
    
    public Library() {
        books = new ArrayList<Book>() ;
    }

    public void addBook(Book book) {
        books.add(book) ;
    }

    public void listBooks() {
        for (Book book: books){
            book.print();
        }
    }
}
