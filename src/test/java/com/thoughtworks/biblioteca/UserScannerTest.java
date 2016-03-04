package com.thoughtworks.biblioteca;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockingDetails;
import static org.mockito.Mockito.when;

/**
 * Created by Adam on 3/4/16.
 */
public class UserScannerTest {

    private UserScanner scanner;
    private BufferedReader reader;
    private Library library ;
    private PrintStream printStream ;

    @Before
    public void setUp() {
        reader = mock(BufferedReader.class);
        library = mock(Library.class) ;
        printStream = mock(PrintStream.class) ;

        scanner = new UserScanner(reader, library, printStream);
    }

    @Test
    public void testNextInt() throws Exception {
        when(reader.readLine()).thenReturn("1");
        int input = scanner.nextInt();

        assertEquals(input, 1);
    }

    @Test
    public void shouldReturnListBookCommandWhenUserChoosesOption1() throws IOException {
        when(reader.readLine()).thenReturn("1");

        Command userCommand = scanner.getUserCommand();
        assertTrue(userCommand instanceof ListBookCommand);
    }


    @Test
    public void shouldReturnQuitCommandWhenUserChoosesOption2() throws IOException {
        when(reader.readLine()).thenReturn("2");

        Command userCommand = scanner.getUserCommand();
        assertTrue(userCommand instanceof QuitCommand);
    }
}