package com.thoughtworks.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) throws IOException {
        PrintStream printStream = System.out;
        Library library = new Library();
        UserScanner scanner = new UserScanner(new BufferedReader(new InputStreamReader(System.in)), library, printStream) ;
        library.addBook(new Book(printStream,"Title", "Author", 2000));
        Menu menu = new Menu(printStream, scanner, library);

        ApplicationController applicationController = new ApplicationController(printStream, menu);

        applicationController.run();
    }
}
