package com.thoughtworks.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class BibliotecaTest {

    private Biblioteca biblioteca;
    private PrintStream printStream;
    private Book book;
    private List<Book> listOfBooks;
    private UserScanner scanner;
    private Library library;

    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
        book = mock(Book.class);
        scanner = mock(UserScanner.class) ;
        library = mock(Library.class);
        biblioteca = new Biblioteca(printStream, scanner, library) ;
    }

    @Test
    public void greetCustomer_shouldGreetCustomer(){
        biblioteca.greetCustomer();

        verify(printStream).println("Welcome");
    }


    @Test
    public void shouldDisplayMenuOptionAfterStartup() {
        biblioteca.run() ;
        verify(printStream).println("1. List Books") ;
    }


    @Test
    public void shouldTellLibraryToDisplayBooksWhenUserEnters1AfterMenuDisplayed() {
        when(scanner.nextInt()).thenReturn(1) ;

        biblioteca.handleUserInput() ;

        verify(library).listBooks() ;
    }

    @Test
    public void shouldGiveErrorMessageWhenUserEntersInvalidInput(){
        when(scanner.nextInt()).thenReturn(10000);
        biblioteca.handleUserInput();

        verify(printStream).println("Select a valid option!");
    }

    @Test
    public void shouldExitBibliotecaWhenUserEntersQuit(){
        when(scanner.nextInt()).thenReturn(2);
        biblioteca.handleUserInput();

        verify(printStream).println("Thank you for using the Biblioteca..?");
    }

}
