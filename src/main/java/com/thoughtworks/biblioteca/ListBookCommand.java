package com.thoughtworks.biblioteca;

/**
 * Created by Adam on 3/4/16.
 */
public class ListBookCommand implements Command {


    private final Library library;

    public ListBookCommand(Library library) {
        this.library = library ;
    }

    @Override
    public void execute() {
        library.listBooks();
    }
}
