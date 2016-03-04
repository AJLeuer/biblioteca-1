package com.thoughtworks.biblioteca;

import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by Adam on 3/4/16.
 */
public class QuitCommandTest {

    @Test
    public void shouldQuitWhenUserRequests() {
        PrintStream printStream = mock(PrintStream.class);
        QuitCommand quitCommand = new QuitCommand(printStream) ;
        quitCommand.execute();

        verify(printStream).println(contains("Thank you for using the Biblioteca..?"));
    }
}