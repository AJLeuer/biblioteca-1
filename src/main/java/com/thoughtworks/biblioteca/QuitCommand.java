package com.thoughtworks.biblioteca;

import java.io.PrintStream;

/**
 * Created by Adam on 3/4/16.
 */
public class QuitCommand implements Command {

    private final PrintStream printStream;

    public QuitCommand(PrintStream printStream) {
        this.printStream = printStream ;
    }

    @Override
    public void execute() {
        printStream.println("Thank you for using the Biblioteca..?") ;
    }
}
