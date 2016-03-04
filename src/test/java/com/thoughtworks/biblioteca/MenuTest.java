package com.thoughtworks.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.PrintStream;
import java.util.InputMismatchException;

import static org.mockito.Mockito.*;

public class MenuTest {

    private PrintStream printStream;
    private Menu menu;
    private UserScanner scanner;
    private Library library;

    @Before
    public void setUp() throws IOException {
        scanner = mock(UserScanner.class);
        printStream = mock(PrintStream.class);
        library = mock(Library.class) ;
        menu = new Menu(printStream, scanner, library);
        when(scanner.nextInt()).thenReturn(1000000);

    }

    @Test
    public void shouldDisplayMenuOptionAfterStartup() throws IOException {
        menu.displayOptions();
        verify(printStream).println("1. List Books") ;
    }

    @Test
    public void shouldExecuteCommandFromScanner() throws IOException {
        Command command = mock(Command.class) ;
        when(scanner.getUserCommand()).thenReturn(command) ;

        menu.chooseOptionFromUserInput();
        verify(command).execute() ;
    }

}