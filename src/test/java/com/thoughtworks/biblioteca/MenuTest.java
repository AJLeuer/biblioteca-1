package com.thoughtworks.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.InputMismatchException;

import static org.mockito.Mockito.*;

public class MenuTest {

    private PrintStream printStream;
    private Menu menu;
    private UserScanner scanner;
    private Library library;

    @Before
    public void setUp(){
        scanner = mock(UserScanner.class);
        printStream = mock(PrintStream.class);
        library = mock(Library.class) ;
        menu = new Menu(printStream, scanner, library);
        when(scanner.nextInt()).thenReturn(1000000);

    }

    @Test
    public void shouldDisplayMenuOptionAfterStartup() {
        menu.display();
        verify(printStream).println("1. List Books") ;
    }

    @Test
    public void shouldGiveErrorMessageWhenUserEntersInvalidInput(){
        when(scanner.nextInt()).thenReturn(10000);
        menu.display();
        verify(printStream).println("Select a valid option!");
    }

    @Test
    public void shouldGiveErrorMessageWhenUserEntersNonNumericInput() {
        when(scanner.nextInt()).thenThrow(InputMismatchException.class);
        menu.display();
        verify(printStream).println("Select a valid option!");
    }

    @Test
    public void shouldListBooksWhenOptionOneIsChosen(){
        when(scanner.nextInt()).thenReturn(1);
        menu.display();

        verify(library).listBooks();
    }

}