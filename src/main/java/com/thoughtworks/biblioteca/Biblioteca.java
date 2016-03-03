package com.thoughtworks.biblioteca;

import java.io.PrintStream;

public class Biblioteca {

    private UserScanner scanner;
    private PrintStream printStream;
    private Library library;


    public Biblioteca(PrintStream printStream, UserScanner scanner, Library library) {
        this.printStream = printStream;
        this.scanner = scanner;
        this.library = library;
    }

    public void run() {
        greetCustomer() ;
        showmenu() ;
        handleUserInput();
    }

    public void greetCustomer() {
        printStream.println("Welcome");
    }

    private void showmenu() {
        printStream.println("1. List Books") ;
        printStream.println("2. Quit");
    }

    public void handleUserInput() {
        int input = scanner.nextInt() ;

        response(input);
    }

    public void response(int userInput) {
        switch (userInput) {
            case 1:
                library.listBooks() ;
                break ;
            case 2:
                printStream.println("Thank you for using the Biblioteca..?");
                break;
            default:
                printStream.println("Select a valid option!");
                break;
        }
    }
}
