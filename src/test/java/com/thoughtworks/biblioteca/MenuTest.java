package com.thoughtworks.biblioteca;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MenuTest {

    private PrintStream printStream;
    private Menu menu;
    private UserScanner scanner;

    @Before
    public void setUp(){
        scanner = mock(UserScanner.class);
        printStream = mock(PrintStream.class);
        menu = new Menu(printStream, scanner);
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
    @Ignore
    public void shouldListBooksWhenOptionOneIsChosen(){
        when(scanner.nextInt()).thenReturn(1);
        // finish this test
    }

}