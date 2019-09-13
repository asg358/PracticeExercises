package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleExceptionsTest {
    private static MultipleExceptions multipleExceptions;
    @Before
    public void setUp() throws Exception {
        multipleExceptions=new MultipleExceptions();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test(expected=NegativeArraySizeException.class)
    public void createException_ShouldRaiseNegativeArraySizeException() {

        multipleExceptions.createNegativeIndexArrayExceptions();
    }

    @Test(expected=NullPointerException.class)
    public void createException_ShouldRaiseNullPointerException() {

        multipleExceptions.createNullPointerExceptions();

    }

    @Test(expected=IndexOutOfBoundsException.class)
    public void createException_ShouldRaiseIndexOutOfBoundsException() {

        multipleExceptions.createIndexOutOfBoundExceptions();

    }

}