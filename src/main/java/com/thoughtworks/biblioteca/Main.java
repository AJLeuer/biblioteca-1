package com.thoughtworks.biblioteca;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        PrintStream printStream = System.out;
        UserScanner scanner = new UserScanner() ;
        Library library = new Library();
        library.addBook(new Book(printStream,"Title", "Author", 2000));
        Menu menu = new Menu(printStream, scanner, library);

        ApplicationController applicationController = new ApplicationController(printStream, menu);

        applicationController.run();
    }
}
