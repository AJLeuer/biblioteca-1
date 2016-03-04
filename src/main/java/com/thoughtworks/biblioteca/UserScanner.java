package com.thoughtworks.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserScanner {

    private final Library library;
    private final PrintStream printStream;
    private Scanner scanner;
    private BufferedReader reader ;
    private Map<Integer, Command> commands;

    public UserScanner(BufferedReader reader, Library library, PrintStream printStream){
        this.reader = reader ;
        this.scanner = new Scanner(reader);
        this.library = library ;
        this.printStream = printStream ;

        commands = new HashMap<Integer, Command>();
        commands.put(1, new ListBookCommand(library));
        commands.put(2, new QuitCommand(printStream));
    }

    public int nextInt() throws IOException {

        return Integer.parseInt(reader.readLine());
    }


    public Command getUserCommand() throws IOException {
        int userChosenOption = nextInt() ;

        return commands.get(userChosenOption);
    }
}
