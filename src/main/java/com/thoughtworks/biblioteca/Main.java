package com.thoughtworks.biblioteca;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        PrintStream printStream = System.out;
        UserScanner scanner = new UserScanner() ;
        Library library = new Library();
        Menu menu = new Menu(printStream, scanner);

        ApplicationController applicationController = new ApplicationController(printStream);

        applicationController.run();
        menu.runMenu();
    }
}
