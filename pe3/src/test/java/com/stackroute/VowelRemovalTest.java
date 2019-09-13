package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelRemovalTest {

    private static VowelRemoval vowelRemoval;
    @Before
    public void setUp() throws Exception {

        vowelRemoval=new VowelRemoval();

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void removeVowel_ArrayOfPlacesGiven_ShouldReturnPlacesWithVowelsRemoved() {

    String s[]={"India","Pakistan","Sri Lanka","South Africa"};
    String expected[]={"nd","Pkstn","Sr Lnk","Sth frc"};

    assertArrayEquals(expected,vowelRemoval.removeVowel(s));
    assertNotNull(vowelRemoval.removeVowel(s));


    }
}