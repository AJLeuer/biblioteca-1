package com.thoughtworks.biblioteca;

import java.io.PrintStream;

public class Menu {
    private PrintStream printStream;
    private UserScanner scanner;

    public Menu(PrintStream printStream, UserScanner scanner) {
        this.printStream = printStream;
        this.scanner = scanner;
    }

    public void displayOptions() {
        printStream.println("1. List Books");
    }

    public void chooseOptionFromUserInput() {
        int input = scanner.nextInt();
        switch (input) {
            case 1:
//                library.listBooks();
                break;
            case 2:
                printStream.println("Thank you for using the Biblioteca..?");
                break;
            default:
                printStream.println("Select a valid option!");
                break;
        }
    }

    public void runMenu() {
        displayOptions();
        chooseOptionFromUserInput();
    }
}
