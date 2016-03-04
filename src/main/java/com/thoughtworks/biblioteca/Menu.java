package com.thoughtworks.biblioteca;

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

    public void chooseOptionFromUserInput() {
        int input = 0;
        try {
            input = scanner.nextInt();
        } catch (InputMismatchException e) { }

        switch (input) {
            case 1:
                library.listBooks() ;
                break;
            case 2:
                printStream.println("Thank you for using the Biblioteca..?");
                break;
            default:
                printStream.println("Select a valid option!");
                break;
        }
    }

    public void display() {
        displayOptions();
        chooseOptionFromUserInput();
    }
}
