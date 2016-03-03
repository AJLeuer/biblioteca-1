package com.thoughtworks.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.List;

import static org.mockito.Mockito.*;

public class ApplicationControllerTest {

    private ApplicationController applicationController;
    private PrintStream printStream;
    private List<Book> listOfBooks;

    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
        applicationController = new ApplicationController(printStream) ;
    }

    @Test
    public void greetCustomer_shouldGreetCustomer(){
        applicationController.greetCustomer();

        verify(printStream).println("Welcome");
    }
}
