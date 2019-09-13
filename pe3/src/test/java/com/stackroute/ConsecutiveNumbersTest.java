package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {

    private static ConsecutiveNumbers consecutiveNumbers;
    @Before
    public void setUp() throws Exception {
        consecutiveNumbers=new ConsecutiveNumbers();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkConsecutiveNumbers_ConsecutiveNumbersGiven_ShouldReturnTrue() {

    String s="12,13,14,15,16";
    assertEquals(true,consecutiveNumbers.checkConsecutiveNumbers(s));
    assertNotNull(consecutiveNumbers.checkConsecutiveNumbers(s));

    }

    @Test
    public void checkConsecutiveNumbers_ConsecutiveNumbersNotGiven_ShouldReturnFalse() {

        String s="12,13,14,16,17";
        assertEquals(false,consecutiveNumbers.checkConsecutiveNumbers(s));
        assertNotNull(consecutiveNumbers.checkConsecutiveNumbers(s));

    }
}