package com.thoughtworks.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class LibraryTest {


    @Test
    public void shouldListTwoBooks(){
        Library library = new Library() ;

        Book book = mock(Book.class) ;
        Book book2 = mock(Book.class) ;

        library.addBook(book);
        library.addBook(book2);

        library.listBooks();

        verify(book2).print();
    }



}