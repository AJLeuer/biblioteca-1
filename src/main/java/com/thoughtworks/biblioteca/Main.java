package com.thoughtworks.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> listOfBooks = new ArrayList<>();
        PrintStream printStream = System.out;
        UserScanner scanner = new UserScanner() ;
        Library library = new Library();
        Biblioteca biblioteca = new Biblioteca(printStream, scanner, library);
        biblioteca.run();
    }
}
