package com.thoughtworks.biblioteca;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.BufferedReader;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Adam on 3/4/16.
 */
public class UserScannerTest {

    private UserScanner scanner;
    private BufferedReader reader;

    @Before
    public void setUp() {
        reader = mock(BufferedReader.class);
        scanner = new UserScanner(reader);
    }

    @Test
    public void testNextInt() throws Exception {
        when(reader.readLine()).thenReturn("1");
        int input = scanner.nextInt();

        assertEquals(input, 1);
    }

    @Test
    @Ignore
    public void shouldReturnCorrectCommandObjectWhenUserChoosesOption() {

//        Command userCommand = scanner.getUserCommand() ;
//        assertThat(userCommand, isInstanceOf(ListBookCommand));
    }
}