package com.thoughtworks.biblioteca;

import java.io.IOException;
import java.io.PrintStream;

public class ApplicationController {

    private PrintStream printStream;
    private Menu menu;


    public ApplicationController(PrintStream printStream, Menu menu) {
        this.printStream = printStream;
        this.menu = menu;
    }

    public void run() throws IOException {
        greetCustomer() ;
        menu.display();
    }

    public void greetCustomer() {
        printStream.println("Welcome");
    }
}
