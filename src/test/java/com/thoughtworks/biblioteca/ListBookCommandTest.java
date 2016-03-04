package com.thoughtworks.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by Adam on 3/4/16.
 */
public class ListBookCommandTest {

    @Test
    public void shouldListBooksInLibraryWhenUserRequests() {
        Library library = mock(Library.class) ;
        ListBookCommand listBookCommand = new ListBookCommand(library) ;

        listBookCommand.execute() ;

        verify(library).listBooks() ;
    }

}