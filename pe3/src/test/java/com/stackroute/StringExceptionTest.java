package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringExceptionTest {
    private static StringException stringException;
    @Before
    public void setUp() throws Exception {
        stringException=new StringException();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test(expected=Exception.class)
    public void createStringException_StringArgumentGiven_ShouldTestIfExceptionRaised() {

        System.out.println("Testing whether exception is thrown by getInput method or not");
        String s="Hello World!";
        stringException.createStringException(s);
    }
}