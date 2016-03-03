package com.thoughtworks.biblioteca;

import java.io.PrintStream;

public class ApplicationController {

    private PrintStream printStream;


    public ApplicationController(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void run() {

        greetCustomer() ;
    }

    public void greetCustomer() {
        printStream.println("Welcome");
    }
}
