package com.thoughtworks.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class UserScanner {

    private Scanner scanner;
    private BufferedReader reader ;

    public UserScanner(BufferedReader reader){
        this.reader = reader ;
        this.scanner = new Scanner(reader);
    }

    public int nextInt() throws IOException {

        return Integer.parseInt(reader.readLine());
        
        //return scanner.nextInt();
    }



}
