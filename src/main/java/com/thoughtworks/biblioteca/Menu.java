package com.thoughtworks.biblioteca;

import java.io.IOException;
import java.io.PrintStream;
import java.util.InputMismatchException;

public class Menu {
    private PrintStream printStream;
    private UserScanner scanner;
    private Library library;

    public Menu(PrintStream printStream, UserScanner scanner, Library library) {
        this.printStream = printStream;
        this.scanner = scanner;
        this.library = library;
    }

    public void displayOptions() {
        printStream.println("1. List Books");
    }

    public void chooseOptionFromUserInput() throws IOException {
        scanner.getUserCommand().execute() ;
    }

    public void display() throws IOException {
        displayOptions();
        chooseOptionFromUserInput();
    }
}
